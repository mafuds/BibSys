package br.unesp.rc.bibsys.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoUtils {
    
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
    
}
