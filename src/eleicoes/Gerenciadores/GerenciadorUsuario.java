/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicoes.Gerenciadores;

import eleicoes.Atributos.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class GerenciadorUsuario {
    public ArrayList <Usuario> listUsuario = new ArrayList();
    
    public Usuario consultarUsuario(String userName){
        for(int i=0 ; i<listUsuario.size() ; i++){
            if(listUsuario.get(i).getNomeUser().equals(userName)){
                return listUsuario.get(i);
            }
        }
        return null;
    }
}
