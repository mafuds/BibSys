/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.bibsys.utils;

import br.unesp.rc.bibsys.beans.Elemento;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        String linha, ref = "", nomeTag = "", valorTag = "";
        int i, max;
        char c;
        Elemento e = new Elemento();
        HashMap<String, String> hm = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            linha = reader.readLine();
            if (linha.matches("[@].*")) {
                for (i = 0; i < linha.length(); i++) {
                    c = linha.charAt(i);
                    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                        ref = ref + c;
                    }
                    if (c == '{') {
                        break;
                    }
                }
                e.setReferencia(ref);
                
                linha = reader.readLine();
                while (linha != null && (!linha.isEmpty() || !linha.matches("\\s"))) {
                    i = 0;
                    c = linha.charAt(i);
                    max = linha.length();
                    while (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z')) {
                        i++;
                        if (i >= max) {
                            break;
                        }
                        c = linha.charAt(i);
                    }
                    nomeTag = "";
                    while ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                        nomeTag = nomeTag + c;
                        i++;
                        c = linha.charAt(i);
                    }
                    System.out.println("nomeTag: " + nomeTag);
                    
                    while (!(c == '=')) {
                        i++;
                        if (i >= max) {
                            break;
                        }
                        c = linha.charAt(i);
                    }
                    if (c == '=') {
                        i++;
                        c = linha.charAt(i);
                    }
                    while (c == ' ') {
                        i++;
                        if (i >= max) {
                            break;
                        }
                        c = linha.charAt(i);
                    }
                    if (c == '{' || c == '"') {
                        i++;
                        c = linha.charAt(i);
                    }
                    valorTag = "";
                    while (c != '}' && c != '"' && c != '\r') {
                        valorTag = valorTag + c;
                        i++;
                        if (i >= max) {
                            break;
                        }
                        c = linha.charAt(i);
                    }
//                    System.out.println("valor: " + valorTag);
                    
                    // se tiver achado nome e valor de tag, salva no hashmap
                    if (!nomeTag.equals("") && !valorTag.equals("")) {
                        hm.put(nomeTag, valorTag);
                        System.out.println("Hashmap <" + nomeTag + ", " + valorTag + ">");
                    }
                    
                    linha = reader.readLine();
                }
            }
        } catch (IOException ex) {
            System.out.println("Ocorreu um erro ao ler o arquivo! " + ex.getMessage());
        }
                
        if (!hm.isEmpty()) {
            e.setValores(hm);
        }
        
        return arquivo;
    }
    
    static public File converteold(File arquivo) {
        String ref = "", nomeTag = "", conteudoTag = "";
        Elemento e = new Elemento();
        HashMap<String, String> hm = new HashMap<>();
        int i;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            i = reader.read();
            while (i != -1) {
                char s = (char) i;
                while (s != '@') {
                    i = reader.read();
                    s = (char) i;
                }
                // -------------------------------------------------------------------
                //  achou o começo da primeira referencia
                if (s == '@') {
                    i = reader.read();
                    s = (char) i;
                    // le chars e escreve em ref até que acabem as letras
                    while (i != -1 && ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z'))) {
                        ref = ref + s;
                        i = reader.read();
                        s = (char) i;
                    }
                    e.setReferencia(ref);
                    while (s != '{') {
                        i = reader.read();
                        s = (char) i;
                    }
                    
                    // -------------------------------------------------------------------
                    //  achou o abrir chaves da primeira referencia
                    if (s == '{') {
                        while (s != '}') {
                            System.out.println("s: " + s);
                            // -------------------------------------------------------------------
                            // enquanto não encontrar string (ou seja, nome do parametro), 
                            //   ignora o que achar
                            while ((i != -1) && !((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z'))
                                   ) {
                                i = reader.read();
                                s = (char) i;
                            }
                            // -------------------------------------------------------------------
                            //  pega o nome do parametro
                            nomeTag = "";
                            while (i != -1 && ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z'))) {
                                nomeTag = nomeTag + s;
                                i = reader.read();
                                s = (char) i;
                            }

                            // -------------------------------------------------------------------
                            //  pula espacos em branco até o =
                            while ((i != -1) && (s != '=')) {
                               i = reader.read();
                               s = (char) i;
                            }
                            // passa o igual
                            i = reader.read();
                            s = (char) i;

                            // pula espacos em branco ate o começo do valor do parametro
                            while ((i != -1) && (s != '{' || s != '"') && !((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z'))
                                    && !(i >= '0' && i <= '9')) {
                                i = reader.read();
                                s = (char) i;
                            }
                            // caso seja { ou ", pula esse char
                            if (s == '{' || s == '"') {
                                i = reader.read();
                                s = (char) i;
                            }

                            // -------------------------------------------------------------------
                            //  pega o valor do parametro
                            conteudoTag = "";
                            while ((i != -1) && (s != '\r') && (s != '}') && (s != '"')) {
                                conteudoTag = conteudoTag + s;
                                i = reader.read();
                                s = (char) i;
                            }
                            // se tiver achado nome e valor de tag, salva no hashmap
                            if (!nomeTag.equals("") && !conteudoTag.equals("")) {
                                hm.put(nomeTag, conteudoTag);
                                System.out.println("Hashmap <" + nomeTag + ", " + conteudoTag + ">");
                            }
                        }
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println("Ocorreu um erro ao ler o arquivo! " + ex.getMessage());

        }
                
        if (!hm.isEmpty()) {
            e.setValores(hm);
        }

//        for (String key : hm.keySet()) {
//            //Capturamos o valor a partir da chave
//            String value = hm.get(key);
//            System.out.println(key + " = " + value);
//        }
        
//        System.out.println("ref: " + e.getReferencia());
        
        return arquivo;
    }
    
    
    
//    static public File converte(File arquivo) {
//        String ref = "", nomeTag = "", conteudoTag = "";
//        Elemento e = new Elemento();
//        HashMap<String, String> hm = new HashMap<>();
//        int i;
//        
//        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
//            i = reader.read();
//            while (i != -1) {
//                char s = (char) i;
////                System.out.println("antes do switch: i: " + i + " - s: " + Character.toString ((char) i)); // sendo i o código ascii do caracter lido
//                switch (s) {
//                    // testa se eh a primeira linha (@article, por ex)
//                    case '@':
//                        // lê proximo char
//                        i = reader.read();
//                        s = (char) i;
//                        // le chars e escreve em ref até que acabem as letras
//                        while (i != -1 && ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z'))) {
//                            ref = ref + s;
//                            i = reader.read();
//                            s = (char) i;
//                        }
//                        e.setReferencia(ref);
//                        break;
//                    case '\r':
//                    case ' ':
//                    case '\n':
//                    case '{':
//                        while (i != -1 && s != '}') {
//                            // -------------------------------------------------------------------
//                            //      começa a leitura de atributos da referencia
//                            // -------------------------------------------------------------------
//                            // ignora tudo o que está depois do primeiro abrir chaves
//                            // vai ate o final da primeira linha
//                            while ((i != -1) && (s != '\r')) { 
//                                i = reader.read();
//                                s = (char) i;
//                            }
//                            // -------------------------------------------------------------------
//                            //  pula espacos em branco ate chegar ao nome do primeiro parametro
//                            while ((i != -1) && !((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z'))) {
//                               i = reader.read();
//                               s = (char) i;
//                            }
//
//                            // -------------------------------------------------------------------
//                            //  pega o nome do parametro
//                            nomeTag = "";
//                            while (i != -1 && ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z'))) {
//                                nomeTag = nomeTag + s;
//                                i = reader.read();
//                                s = (char) i;
//                            }
//    //                        System.out.println("nome tag: " + nomeTag);
//
//                            // -------------------------------------------------------------------
//                            //  pula espacos em branco até o =
//                            while ((i != -1) && (s != '=')) {
//                               i = reader.read();
//                               s = (char) i;
//                            }
//                            // passa o igual
//                            i = reader.read();
//                            s = (char) i;
//
//                            // pula espacos em branco ate o começo do valor do parametro
//    //                        while ((i != -1) && (s == ' ')) {
//                            while ((i != -1) && (s != '{' || s != '"') && !((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z'))
//                                    && !(i >= '0' && i <= '9')) {
//                                i = reader.read();
//                                s = (char) i;
//                            }
//                            if (s == '{' || s == '"') {
//                                i = reader.read();
//                                s = (char) i;
//                            }
//
//                            // -------------------------------------------------------------------
//                            //  pega o valor do parametro
//                            conteudoTag = "";
//                            while ((i != -1) && (s != '\r') && (s != '}') && (s != '"')) {
//                                conteudoTag = conteudoTag + s;
//                                i = reader.read();
//                                s = (char) i;
//                            }
//    //                        System.out.println("conteudo tag: " + conteudoTag);
//                            if (!nomeTag.equals("") && !conteudoTag.equals("")) {
//                                hm.put(nomeTag, conteudoTag);
//                                System.out.println("Hashmap <" + nomeTag + ", " + conteudoTag + ">");
//                            }
//                        }
//                        break;
//                    default:
//                        i = reader.read();
//                        break;
//                }
////                i = reader.read();
//            }
//        }   catch (IOException ex) {
//            System.out.println("Ocorreu um erro ao ler o arquivo! " + ex.getMessage());
//        }
//        if (!hm.isEmpty()) {
//            e.setValores(hm);
//        }
//
////        for (String key : hm.keySet()) {
////            //Capturamos o valor a partir da chave
////            String value = hm.get(key);
////            System.out.println(key + " = " + value);
////        }
//        
////        System.out.println("ref: " + e.getReferencia());
//        
//        return arquivo;
//    }
    
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
