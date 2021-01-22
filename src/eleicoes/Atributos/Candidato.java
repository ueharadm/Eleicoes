/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicoes.Atributos;

import java.io.Serializable;

/**
 *
 * @author Lucas
 */
public class Candidato implements Serializable{
    private int numId;
    private String nome;
    private String descricao;

    public Candidato(int numId, String nome, String descricao) {
        this.numId = numId;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getNumId() {
        return numId;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        return "Numero de identificacao: "+this.numId+"\nNome: "+this.nome+"\nDescricao: "+this.descricao;
    }
    
}
