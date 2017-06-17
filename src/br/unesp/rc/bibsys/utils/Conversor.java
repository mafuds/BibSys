/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.bibsys.utils;

import br.unesp.rc.bibsys.beans.Elemento;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author tuifm
 */
public class Conversor
{

    public Conversor() {
    }
    
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
    
    static public File converte(File arquivo) {
        String ref = "";
        Elemento e = new Elemento();
        HashMap<String, String> hm = new HashMap<>();
        int i;
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            i = reader.read();
            while (i != -1) {
                char s = (char) i;
                System.out.println("antes do switch: i: " + i + " - s: " + Character.toString ((char) i)); // sendo i o código ascii do caracter lido
                switch (s) {
                    // testa se eh a primeira linha (@article, por ex)
                    case '@':
                        // lê proximo char
                        i = reader.read();
                        s = (char) i;
                        // le chars e escreve em ref até que acabem as letras
                        while (i != -1 && ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z'))) {
                            ref = ref + s;
                            i = reader.read();
                            s = (char) i;
                        }
                        e.setReferencia(ref);
                        break;
                    case '\r':
                    case ' ':
                    case '\n':
                    case '{':
//                        System.out.println("entrou no case {");
                        // ignora o que vem depois do {
                        while (i != -1 && (s != ',' || s == ' ')) {
                            // esse while percorre (pra ignorar) até o final da primeira linha
                            System.out.println("while de dentro " + s);
                            i = reader.read();
                            s = (char) i;
                        }
//                        i = reader.read();
//                        s = (char) i;
                        break;
//                    case '{':
//                        break;
                    default:
                        i = reader.read();
                        break;
                }
//                i = reader.read();
            }
        }   catch (IOException ex) {
            System.out.println("Ocorreu um erro ao ler o arquivo! " + ex.getMessage());
        }

        System.out.println("ref: " + e.getReferencia());
        
        return arquivo;
    }
    
//    static public File converte(File arquivo) {
//        System.out.println("entrou no converte");
//        File teste = null;
//        HashMap<String, String> hm = new HashMap<>();
//        Elemento e = new Elemento();
//        String patternRef = "[@](\\w+)(\\s*)[{]";
//        String patternAtr = "(\\w+)\\s*[=]\\s*(.+)";
//        
//        // Create a Pattern object
//        Pattern referenciaP = Pattern.compile(patternRef);
//        Pattern atributosP = Pattern.compile(patternAtr);
//        Matcher referencia = null;
//        Matcher atributos = null;
//
//        //String texto = Conversor.lerArquivo(arquivo);
//        
//        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
//            String s;
//            while ((s = reader.readLine()) != null) {
//                System.out.println(s);
//                
//                // verifica se é linha de referencia (@article, por ex)
//                referencia = referenciaP.matcher(s);
//                if (referencia.find()) {
//                    e.setReferencia(referencia.group(1));
//                }
//                
//                // verifica se é linha de atributos (year = {2012}, por ex)
//                atributos = atributosP.matcher(s);
//                if (atributos.find()) {
//                    hm.put(atributos.group(1), atributos.group(2));
//                    e.setNomeTag(atributos.group(1));   // nome do atributo
//                    e.setContTag(atributos.group(2));   // valor do atributo
////                    e.setContTag(atributos.group(4));
//                    System.out.println("bateu");
//                    System.out.println("qtde grupos: " + atributos.groupCount());
//                    for (int i = 0; i <= atributos.groupCount(); i++) {
//                        System.out.println("atributos("+i+"): " + atributos.group(i) );
//                    }
//                    if (atributos.group(1).equals("year")) {
//                        Pattern p = Pattern.compile("[{]?(\\d+)[}]?[,]?");
//                        
//                        Matcher m = p.matcher(atributos.group(2));
//                        System.out.println("qtde grupos: " + m.groupCount());
//                        for (int i = 0; i <= m.groupCount(); i++) {
//                            System.out.println("m("+i+"): " + m.group(i) );
//                        }
//                        
////                        System.out.println("Achou: " + m.group(0));
////                        e.setAno(atributos.group(2));
//                    }
//                }
//                
//            }
//            
//        }   catch (IOException ex) {
//            System.out.println("Ocorreu um erro ao ler o arquivo! " + ex.getMessage());
//        }
//        
//        
//        
//        return teste;
//    }
}
