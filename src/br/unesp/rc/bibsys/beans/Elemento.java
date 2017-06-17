/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.bibsys.beans;

import java.util.HashMap;

/**
 *
 * @author mariana
 */
public class Elemento {
    // referencia é o que é precedido pelo @ 
    // exemplo: @article, @book
    private String referencia;
    // este é o autor:ano que aparece depois da chave {
    private String autor;
    private int ano;
    // nome da tag (autor, ano, volume)
    private String nomeTag;
    // valor da tag
    private String contTag;
    
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
     * @return the nomeTag
     */
    public String getNomeTag() {
        return nomeTag;
    }

    /**
     * @param nomeTag the nomeTag to set
     */
    public void setNomeTag(String nomeTag) {
        this.nomeTag = nomeTag;
    }

    /**
     * @return the contTag
     */
    public String getContTag() {
        return contTag;
    }

    /**
     * @param contTag the contTag to set
     */
    public void setContTag(String contTag) {
        this.contTag = contTag;
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

}
