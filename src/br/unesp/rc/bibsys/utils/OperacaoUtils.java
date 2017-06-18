/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.bibsys.utils;

import br.unesp.rc.bibsys.beans.Elemento;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author tuifm
 */
public class OperacaoUtils
{

    public OperacaoUtils() {
    }
        
    static public String converte(File arquivo) {
        ArrayList<Elemento> lista = ParserUtils.lerDados(arquivo);
        String nomeNovoArq = "src\\tmp\\arquivoTmpConvertido.bib";
        
        ArquivoUtils.escreveArquivo(nomeNovoArq, lista);
        
        return nomeNovoArq;
    }
    
    
    static public String concatenar(File arq1, File arq2) {
        String nomeNovoArq = "src\\tmp\\arquivoTmpConcatenado.bib";
        
        // le os arquivos e coloca em arraylist
        ArrayList<Elemento> listaArq1 = ParserUtils.lerDados(arq1);
        ArrayList<Elemento> listaArq2 = ParserUtils.lerDados(arq2);
        ArrayList<Elemento> listaTotal = new ArrayList<>();
        listaTotal.addAll(listaArq1);
        listaTotal.addAll(listaArq2);
        
        ArquivoUtils.escreveArquivo(nomeNovoArq, listaTotal);
        
        return nomeNovoArq;
    }
    
    static public void comparar(File arq1, File arq2) throws IOException {
        ArquivoUtils.criaDiretorio("src\\Arquivos\\Comparacao"); // cria o diretório onde será salvo o arquivo resultante
        File arqResultante = new File("src\\Arquivos\\Comparacao\\arqResultante.txt"); // abre o arquivo resultante
        FileWriter fw = new FileWriter(arqResultante.getAbsoluteFile());
        PrintWriter pw = new PrintWriter(fw);
                
        // pega as informações dos arquivos lidos
        ArrayList<Elemento> lista1 = ParserUtils.lerDados(arq1);
        ArrayList<Elemento> lista2 = ParserUtils.lerDados(arq2);
        
        HashMap<String, String> hm = new HashMap<>();
        
        // compara se tem uma bibkey do arquivo 1 no 2. Se encontrar, NÃO é pra escrever no arquivo final
        boolean flag = false;
        
        // O que do 1 não tem no 2
        for (Elemento e : lista1) {
            for (Elemento j : lista2) {
                if (Objects.equals(e.getBibkey(), j.getBibkey())) { // a comparação certa de duas strings
                    flag = true; // encontrou um bibkey da lista 1 na lista 2
                }
            }
            // escreve o que tiver de diferente no arquivo
            if (!flag) {
                pw.println("@" + e.getReferencia() + "{" + 
                        e.getBibkey());
                hm = e.getValores();
                
                for (Map.Entry<String, String> entry : hm.entrySet()) {
                    String key = entry.getKey();
                    key = String.format("%1$-16s", key);
                    String value = entry.getValue();
                    pw.println("  " + key + "=  {" + value + "},");
                }
                pw.println("}\n");
            }
            flag = false; // reseta a flag pra conseguir comparar de novo
        }
        
        // O que do 2 não tem no 1
        for (Elemento e : lista2) {
            for (Elemento j : lista1) {
                if (Objects.equals(e.getBibkey(), j.getBibkey())) { // a comparação certa de duas strings
                    flag = true; // encontrou um bibkey da lista 2 na lista 1
                }
            }
            // escreve o que tiver de diferente no arquivo
            if (!flag) {
                pw.println("@" + e.getReferencia() + "{" + 
                        e.getBibkey());
                hm = e.getValores();
                
                for (Map.Entry<String, String> entry : hm.entrySet()) {
                    String key = entry.getKey();
                    key = String.format("%1$-16s", key);
                    String value = entry.getValue();
                    pw.println("  " + key + "=  {" + value + "},");
                }
                pw.println("}\n");
            }
            flag = false; // reseta a flag pra conseguir comparar de novo
        }
        
        // fecha a conexão com o arquivo
        fw.close();
    }
    
    static public void ordenar(File arq) throws IOException {
        String nomeNovoArq = "src\\Arquivos\\Ordenacao\\arqResultante.txt";
        // garante que o diretorio do arquivo resultante existe
        ArquivoUtils.criaDiretorio("src\\Arquivos\\Ordenacao");
                
        // pega as informações do arquivo lido
        ArrayList<Elemento> lista = ParserUtils.lerDados(arq);
        
        // Ordena a lista pelo bibkey
        Collections.sort(lista,comparing(Elemento::getBibkey));
        
        // salva lista no arquivo
        ArquivoUtils.escreveArquivo(nomeNovoArq, lista);
        
    }
}
