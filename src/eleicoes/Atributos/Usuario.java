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
public class Usuario implements Serializable{
    private String nomeUser;
    private String senha;

    public Usuario(String nomeUser, String senha) {
        this.nomeUser = nomeUser;
        this.senha = senha;
    }

    public String getNomeUser() {
        return nomeUser;
    }
    public String getSenha() {
        return senha;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }  
}
