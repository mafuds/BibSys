/*
 * ArquivoUtils contém as operações básicas a serem realizadas com arquivos
 * Propicionam que possamos trabalhar com o conteúdo em outras etapas
 */
package br.unesp.rc.bibsys.utils;

import br.unesp.rc.bibsys.beans.Elemento;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArquivoUtils {
    
    /**
     * Pega o conteúdo de um arquivo
     * @author Artur, Gabriel e Mariana
     * @param arq o arquivo a ser lido
     * @return uma string com o conteúdo do arquivo
     */
    static public String lerArquivo(File arq) {
        StringBuilder conteudo = new StringBuilder();
//        content.append("<html>");
        try (BufferedReader reader = new BufferedReader(new FileReader(arq))) {
            String s;
            while ((s = reader.readLine()) != null) {
                conteudo.append(s).append(System.getProperty("line.separator"));
            }
//        txtEnderecoArq.setText();
        }   catch (IOException ex) {
            System.out.println("Ocorreu um erro ao ler o arquivo! " + ex.getMessage());
        }
        return conteudo.toString();
    }

    /**
     * Cria um diretório com o nome dado
     * @author Artur, Gabriel e Mariana
     * @param nome o nome do diretório a ser criado
     */    
    static public void criaDiretorio(String nome) {
        boolean b = false;
        File diretorio = new File(nome);

        // if the directory does not exist, create it
        if (!diretorio.exists()) {
            b = false;

            try {
                diretorio.mkdir();
                b = true;
            } catch (SecurityException ex) {
                System.out.println("Erro ao criar diretorio: " + ex.getMessage());
            }        
            if (b) {    
                System.out.println("Diretorio criado com sucesso!");  
            }
        }   
    }
    
/**
 * Escreve um conteúdo com a formatação correta em um arquivo 
 * @author Artur, Gabriel e Mariana
 * @param nomeNovoArq o nome do arquivo a ser criado
 * @param lista todo o conteúdo a ser escrito no arquivo
 * @return um valor booleano de sucesso. True é sucesso e false é erro
 */    
    static public boolean escreveArquivo(String nomeNovoArq, ArrayList<Elemento> lista) {
        HashMap<String, String> hm = new HashMap<>();
        boolean b = false;

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
            b = true;
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo. Mensagem: " + e.getMessage());
        } 
        
        return b;
    }
}
