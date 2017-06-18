/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.bibsys.utils;

import br.unesp.rc.bibsys.beans.Elemento;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
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
//        String nomeArq = arquivo.getName();
//        nomeArq = ;
        String nomeNovoArq = "src\\tmp\\"+arquivo.getName().substring(0, arquivo.getName().length()-4)
                +"-formatado.bib";
        
        ArquivoUtils.escreveArquivo(nomeNovoArq, lista);
        
        return nomeNovoArq;
    }
    
    
    static public String concatenar(File arq1, File arq2) {
        // garante que o diretorio do arquivo resultante existe
        ArquivoUtils.criaDiretorio("src\\Arquivos\\Concatenacao");

        String nomeNovoArq = "src\\tmp\\"+
                arq1.getName().substring(0, arq1.getName().length()-4)
                +"-"+arq2.getName().substring(0, arq2.getName().length()-4)+"-concatenados.bib";
        
        // le os arquivos e coloca em arraylist
        ArrayList<Elemento> listaArq1 = ParserUtils.lerDados(arq1);
        ArrayList<Elemento> listaArq2 = ParserUtils.lerDados(arq2);
        ArrayList<Elemento> listaTotal = new ArrayList<>();
        listaTotal.addAll(listaArq1);
        listaTotal.addAll(listaArq2);
        
        ArquivoUtils.escreveArquivo(nomeNovoArq, listaTotal);
        
        return nomeNovoArq;
    }
    
    static public String comparar(File arq1, File arq2) throws IOException {
       
        // define nomes dos arquivos resultantes
        String arquivoAmbos = "src\\tmp\\Referencias-" + arq1.getName().substring(0, arq1.getName().length()-4) + 
                "-" + arq2.getName().substring(0, arq2.getName().length()-4) + ".bib";
        String arquivoSoUm = "src\\tmp\\Referencias-" + arq1.getName().substring(0, arq1.getName().length()-4) + ".bib";
        String arquivoSoDois = "src\\tmp\\Referencias-" + arq2.getName().substring(0, arq2.getName().length()-4) + ".bib";
                
        // pega as informacoes que seram comparadas
        ArrayList<Elemento> lista1 = ParserUtils.lerDados(arq1);
        ArrayList<Elemento> lista2 = ParserUtils.lerDados(arq2);
        
        // cria listas pra armazenar os registros que tem nos 2
        ArrayList<Elemento> listaAmbos = new ArrayList<>();
        ArrayList<Elemento> listaSoUm = new ArrayList<>();
        ArrayList<Elemento> listaSoDois = new ArrayList<>();

        // compara se tem uma bibkey do arquivo 1 no 2. Se encontrar, NÃO é pra escrever no arquivo final
        boolean flag = false;
        
        // O que do 1 não tem no 2
        for (Elemento e : lista1) {
            for (Elemento j : lista2) {
                if (Objects.equals(e.getBibkey(), j.getBibkey())) { // a comparação certa de duas strings
                    flag = true; // encontrou um bibkey da lista 1 na lista 2
                    listaAmbos.add(e);
                }
            }
            // escreve o que tiver de diferente no arquivo
            if (!flag) {
                // se a flag valer falso, quer dizer que o elemento esta na lista 1 e nao na 2
                listaSoUm.add(e);
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
                // se a flag valer falso, quer dizer que o elemento esta na lista 2 e nao na 1
                listaSoDois.add(e);
            }
            flag = false; // reseta a flag pra conseguir comparar de novo
        }

        // escreve dados nos arquivos de resultados
        ArquivoUtils.escreveArquivo(arquivoAmbos, listaAmbos);
        ArquivoUtils.escreveArquivo(arquivoSoUm, listaSoUm);
        ArquivoUtils.escreveArquivo(arquivoSoDois, listaSoDois);
        
        return arquivoAmbos + "," + arquivoSoUm + "," + arquivoSoDois;
    }
    
    static public String ordenar(File arq) throws IOException {
       
        String nomeNovoArq = "src\\tmp\\" + arq.getName() + "-ordenado.bib";
                
        // pega as informações do arquivo lido
        ArrayList<Elemento> lista = ParserUtils.lerDados(arq);
        
        // Ordena a lista pelo bibkey
        Collections.sort(lista,comparing(Elemento::getBibkey));
        
        // salva lista no arquivo
        ArquivoUtils.escreveArquivo(nomeNovoArq, lista);
        
        return nomeNovoArq;
    }
}
