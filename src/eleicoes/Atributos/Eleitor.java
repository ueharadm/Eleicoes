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
public class Eleitor extends Usuario implements Serializable{
     private String nome; 
     private String cpf;
     private String cidade; 
     boolean Admin;
     
    //Construtor de Eleitor com atributos da classe mãe Usuario
    public Eleitor(String nome, String cpf, String cidade, String user, String senha, boolean isAdmin) {
        super(user, senha);   
        this.nome = nome;
        this.cpf = cpf;
        this.cidade = cidade;
        this.Admin = isAdmin;
    }
    
    //métodos Getters
    public String getNome(){
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getCidade() {
        return cidade;
    }
    public boolean isAdmin() {
        return Admin;
    }
    


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setAdmin(boolean Admin) {
        this.Admin = Admin;
    }

    @Override
    public String toString(){
        return "Nome: "+this.nome+"\nCPF: "+this.cpf+"\nCidade: "+this.cidade;
    }
     
     
}
