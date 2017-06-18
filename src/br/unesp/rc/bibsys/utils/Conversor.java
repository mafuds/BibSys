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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    
    static private String trataAutor(String autor) {
        String autorFormatado = "";
        String [] array1;
        String [] array2;
        array1 = autor.split("and");
        
        switch (array1.length) {
            case 0:
                System.out.println("Erro! Deve haver um autor.");
                break;
            case 1:
                autorFormatado = array1[0].split(",")[0].trim();
                array2 = autorFormatado.split(" ");
                autorFormatado = array2[array2.length-1].toLowerCase().trim();
                break;
            case 2:
                String str = "";
                autorFormatado = array1[0].split(",")[0].trim();
                array2 = autorFormatado.split(" ");
                autorFormatado = array2[array2.length-1].toLowerCase().trim();
                str = array1[1].split(",")[0].trim();
                array2 = str.split(" ");
                str = array2[array2.length-1].toLowerCase().trim();
                autorFormatado = autorFormatado + "." + str;
                break;
            default:
                if (array1.length >= 3) {
                    autorFormatado = array1[0].split(",")[0].trim();
                    array2 = autorFormatado.split(" ");
                    autorFormatado = array2[array2.length-1].toLowerCase().trim();
                    autorFormatado = autorFormatado + "etal";
                }
                break;
        }
        
        return autorFormatado;
    }
    
    static private ArrayList<Elemento> lerDados(File arquivo) {
        ArrayList<Elemento> lista = new ArrayList<>();
        String linha, ref = "", nomeTag = "", valorTag = "";
        int i, max;
        char c;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            linha = reader.readLine();
            while (linha != null) {
                // testo se é inicio de uma nova referencia
                if (linha.matches("\\s*[@].*")) {
                    // declaro as variaveis que serão necessárias para salvar a referencia
                    Elemento e = new Elemento();
                    HashMap<String, String> hm = new HashMap<>();

                    // pego o nome da referencia (article ou book, por ex)
                    ref = "";
                    for (i = 0; i < linha.length(); i++) {
                        c = linha.charAt(i);
                        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                            ref = ref + c;
                        }
                        if (c == '{') {
                            break;
                        }
                    }
                    // salvo o nome da referencia no objeto
                    e.setReferencia(ref);

                    // leio a proxima linha
                    linha = reader.readLine();
                    // se a linha nao for final de arquivo e nem estiver vazia, trato ela
    //                System.out.println("antes do while");
                    while (linha != null && !linha.matches("[}]\\s*") && linha.length() > 0 &&
                            (!linha.isEmpty() || !linha.matches("\\s"))) {
//                        System.out.println("linha: " + linha);
                        i = 0;
                        c = linha.charAt(i);
                        max = linha.length();

                        // enquanto não encontro uma letra, ignoro caracteres
                        while (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z')) {
                            i++;
                            // o if testa se não tentaremos acessar um index inexistente na string
                            if (i >= max) {
                                break;
                            }
                            c = linha.charAt(i);
                        }
                        // quando acha letra, é o nome do parametro
                        nomeTag = "";
                        while ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                            nomeTag = nomeTag + c;
                            i++;
                            c = linha.charAt(i);
                        }
//                        System.out.println("nomeTag: " + nomeTag);

                        // depois do nome do parametro, tem que haver um =
                        while (!(c == '=')) {
                            i++;
                            if (i >= max) {
                                break;
                            }
                            c = linha.charAt(i);
                        }
                        // lê e passa pelo =
                        if (c == '=') {
                            i++;
                            c = linha.charAt(i);
                        }
                        // depois do =, pode haver espacos em branco
                        while (c == ' ') {
                            i++;
                            if (i >= max) {
                                break;
                            }
                            c = linha.charAt(i);
                        }
                        // depois do espaço em branco, pode haver um { ou "
                        // ou simplesmente o valor do parametro
                        if (c == '{' || c == '"') {
                            i++;
                            c = linha.charAt(i);
                        }

                        // tudo o que estiver dentro das chaves ou aspas é o valor do parametro
                        valorTag = "";
                        while (c != '}' && c != '"' && c != '\r') {
                            valorTag = valorTag + c;
                            i++;
                            if (i >= max) {
                                break;
                            }
                            c = linha.charAt(i);
                        }

                        // verifico se a string de valor não pegou uma virgula no final
                        if (!valorTag.isEmpty()) {
                            if (valorTag.charAt(valorTag.length()-1) == ',') {
                                valorTag = valorTag.substring(0, valorTag.length() - 1);
                            }
                        }
                            
    //                    System.out.println("valor: " + valorTag);

                        // se tiver achado nome e valor de tag, salva no hashmap
                        if (!nomeTag.equals("") && !valorTag.equals("")) {
                            hm.put(nomeTag, valorTag);
//                            System.out.println("Hashmap <" + nomeTag + ", " + valorTag + ">");
                        }
                        
                        // verifico se a tag era de ano ou autor
                        if (nomeTag.equals("author")) {
                            // trato o nome do autor
//                            Conversor.trataAutor(valorTag);
                            e.setAutor(Conversor.trataAutor(valorTag));
//                            e.setAutor(valorTag);
                        }
                        if (nomeTag.equals("year")) {
                            e.setAno(Integer.parseInt(valorTag));
                        }
                        linha = reader.readLine();
//                        System.out.println("linha: " + linha);
                    }
                    if (!hm.isEmpty()) {
                        e.setValores(hm);
                    }
                    e.setBibkey(e.getAutor() + ":" + e.getAno());
                    lista.add(e);
                }
//                System.out.println("linha: " + linha);
//                System.out.println("saiu do while");
                linha = reader.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Ocorreu um erro ao ler o arquivo! " + ex.getMessage());
        }
           
        return lista;
    }
    
    static public String converte(File arquivo) {
        ArrayList<Elemento> lista = new ArrayList<>();
        HashMap<String, String> hm = new HashMap<>();
        lista = Conversor.lerDados(arquivo);
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
    
}
