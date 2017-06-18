/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.bibsys.utils;

import br.unesp.rc.bibsys.beans.Elemento;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    
    static public void comparar(File arq1, File arq2) {
        ArquivoUtils.criaDiretorio("src\\Arquivos\\Comparacao");
        
        
    }
    
}
