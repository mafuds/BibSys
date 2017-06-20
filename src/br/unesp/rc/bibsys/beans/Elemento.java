/*
 * Elemento contém as informações básicas de uma citação
 * o tipo (@article, @book...), autor, ano e o bibkey.
 * Há um hashmap para juntar as tags corretamente
 */
package br.unesp.rc.bibsys.beans;

import java.util.HashMap;

/**
 *
 * @author Artur, Gabriel e Mariana
 */
public class Elemento {
    // referencia é o que é precedido pelo @ 
    // exemplo: @article, @book
    private String referencia;
    // este é o autor:ano que aparece depois da chave {
    private String autor;
    private int ano;
    private String bibkey;
    // hashmap ira unir o nome e o valor da tag (autor, ano, volume)
    private HashMap<String, String> valores;

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the valores
     */
    public HashMap<String, String> getValores() {
        return valores;
    }

    /**
     * @param valores the valores to set
     */
    public void setValores(HashMap<String, String> valores) {
        this.valores = valores;
    }
    
//    public void setValores(String chave, String valor) {
//        this.valores.put(chave, valor);
//    }

    /**
     * @return the bibkey
     */
    public String getBibkey() {
        return bibkey;
    }

    /**
     * @param bibkey the bibkey to set
     */
    public void setBibkey(String bibkey) {
        this.bibkey = bibkey;
    }

}
