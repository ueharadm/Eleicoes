/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicoes.Atributos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Eleicao implements Serializable{
    private String nome;
    private String descricao;
    private String data;
    private ArrayList <String> cpfVotantes = new ArrayList();
    private ArrayList <Integer> numCandidato = new ArrayList();
    private ArrayList <Integer> votosCandidato = new ArrayList();
    //Date data;
    //Calendar data;

    public Eleicao(String nome, String descricao, String data) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getData() {
        return data;
    }
    public ArrayList getCpfVotantes() {
        return cpfVotantes;
    }
    public ArrayList getNumCandidato() {
        return numCandidato;
    }
    public ArrayList getVotosCandidato() {
        return votosCandidato;
    }
    
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setVotosCandidato(int index, int voto) {
        this.votosCandidato.set(index, voto);    
    }
    public void setVotosCandidato(ArrayList votosCandidato){
        this.votosCandidato = votosCandidato;
    }
    public void setCpfVotantes(ArrayList cpfVotantes) {
        this.cpfVotantes = cpfVotantes;
    }
    public void setNumCandidato(ArrayList numCandidato) {
        this.numCandidato = numCandidato;
    }
    
    //métodos para adicinar elementos às respectivas listas
    public void addCpfVotantes(String cpfVotantes){
        this.cpfVotantes.add(cpfVotantes);
    }
    public void addNumCandidato(int numCandidato){
        this.numCandidato.add(numCandidato);
        this.votosCandidato.add(0);
    }
    public void novoVotosCandidato(){
        this.votosCandidato.add(0);
    }
    public void addCpfVotante(String cpfVotante){
        this.cpfVotantes.add(cpfVotante);
    }
    
}
