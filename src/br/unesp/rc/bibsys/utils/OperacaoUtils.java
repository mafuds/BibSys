/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.bibsys.utils;

import br.unesp.rc.bibsys.beans.Elemento;
import java.io.BufferedWriter;
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
        ArrayList<Elemento> lista = new ArrayList<>();
        HashMap<String, String> hm = new HashMap<>();
        lista = ParserUtils.lerDados(arquivo);
        String nomeNovoArq = "src\\tmp\\arquivoTmpConvertido.bib";
        
        try {
            PrintWriter novoArq = new PrintWriter(nomeNovoArq, "UTF-8");
            
            for (Elemento elemento : lista) {
                novoArq.println("@" + elemento.getReferencia() + "{" + 
                        elemento.getBibkey());
                hm = elemento.getValores();
                for (Map.Entry<String, String> entry : hm.entrySet()) {
                    String key = entry.getKey();
                    key = String.format("%1$-16s", key);
                    String value = entry.getValue();
                    novoArq.println("  " + key + "=  {" + value + "},");
                }
                novoArq.println("}\n");
            }
            
            novoArq.close();
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo. Mensagem: " + e.getMessage());
        } 
        
        return nomeNovoArq;
    }
    
    
    static public String concatenar(File arq1, File arq2) {
        String nomeNovoArq = "src\\tmp\\arquivoTmpConcatenado.bib";
        
        HashMap<String, String> hm = new HashMap<>();
        
        // le arquivo 1
        ArrayList<Elemento> listaArq1 = new ArrayList<>();
        listaArq1 = ParserUtils.lerDados(arq1);
        
        // le arquivo 2
        ArrayList<Elemento> listaArq2 = new ArrayList<>();
        listaArq2 = ParserUtils.lerDados(arq2);
        
        try {
            PrintWriter novoArq = new PrintWriter(nomeNovoArq, "UTF-8");
            
            for (Elemento elemento : listaArq1) {
                novoArq.println("@" + elemento.getReferencia() + "{" + 
                        elemento.getBibkey());
                hm = elemento.getValores();
                for (Map.Entry<String, String> entry : hm.entrySet()) {
                    String key = entry.getKey();
                    key = String.format("%1$-16s", key);
                    String value = entry.getValue();
                    novoArq.println("  " + key + "=  {" + value + "},");
                }
                novoArq.println("}\n");
            }
            
            for (Elemento elemento : listaArq2) {
                novoArq.println("@" + elemento.getReferencia() + "{" + 
                        elemento.getBibkey());
                hm = elemento.getValores();
                for (Map.Entry<String, String> entry : hm.entrySet()) {
                    String key = entry.getKey();
                    key = String.format("%1$-16s", key);
                    String value = entry.getValue();
                    novoArq.println("  " + key + "=  {" + value + "},");
                }
                novoArq.println("}\n");
            }
            
            novoArq.close();
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo. Mensagem: " + e.getMessage());
        } 
        
        return nomeNovoArq;
    }
    
    static public void comparar(File arq1, File arq2) throws IOException {
        ArquivoUtils.criaDiretorio("src\\Arquivos\\Comparacao"); // cria o diretório onde será salvo o arquivo resultante
        File arqResultante = new File("src\\Arquivos\\Comparacao\\arqResultante.txt"); // abre o arquivo resultante
        FileWriter fw = new FileWriter(arqResultante.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        
        // ler arquivos que são parâmetro
        String resultadoArq1;
        String resultadoArq2;
        ArquivoUtils arqUtils = new ArquivoUtils();
        resultadoArq1 = arqUtils.lerArquivo(arq1);
        resultadoArq2 = arqUtils.lerArquivo(arq2);
        
        // pega as informações dos arquivos lidos
        ParserUtils pu = new ParserUtils();
        ArrayList<Elemento> lista1 = new ArrayList<>();
        ArrayList<Elemento> lista2 = new ArrayList<>();
        lista1 = pu.lerDados(arq1);
        lista2 = pu.lerDados(arq2);
        
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
                bw.write(e.getBibkey());
                bw.write("\n");
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
                bw.write(e.getBibkey());
                bw.write("\n");
            }
            flag = false; // reseta a flag pra conseguir comparar de novo
        }
        
        // fecha a conexão com o arquivo
        bw.close();
    }
    
    static public void ordenar(File arq) throws IOException {
        ArquivoUtils.criaDiretorio("src\\Arquivos\\Ordenacao"); // cria o diretório onde será salvo o arquivo resultante
        File arqResultante = new File("src\\Arquivos\\Ordenacao\\arqResultante.txt"); // abre o arquivo resultante
        FileWriter fw = new FileWriter(arqResultante.getAbsoluteFile());
        PrintWriter pw = new PrintWriter(fw);
        
        // lê o arquivo parâmetro
        String resultadoArq;
        ArquivoUtils arqUtils = new ArquivoUtils();
        resultadoArq = arqUtils.lerArquivo(arq);
        
        // pega as informações do arquivo lido
        ParserUtils pu = new ParserUtils();
        ArrayList<Elemento> lista = new ArrayList<>();
        lista = pu.lerDados(arq);
        
        // Ordena a lista pelo bibkey
        Collections.sort(lista,comparing(Elemento::getBibkey));
        
        // Salva a lista no arquivo
        HashMap<String, String> hm = new HashMap<>();
        
        for (Elemento elemento : lista) {
                pw.println("@" + elemento.getReferencia() + "{" + 
                        elemento.getBibkey());
                hm = elemento.getValores();
                
                for (Map.Entry<String, String> entry : hm.entrySet()) {
                    String key = entry.getKey();
                    key = String.format("%1$-16s", key);
                    String value = entry.getValue();
                    pw.println("  " + key + "=  {" + value + "},");
                }
                pw.println("}\n");
            }
        
        // fecha a conexão com o arquivo
        pw.close();
    }
}
