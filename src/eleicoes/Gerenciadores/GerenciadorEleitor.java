/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicoes.Gerenciadores;

import eleicoes.Atributos.Eleitor;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class GerenciadorEleitor {
    public ArrayList <Eleitor> listEleitor = new ArrayList();
    
    //Função que retorna um objeto do tipo Eleitor, caso não exista, retorna "null"
    public Eleitor consultarEleitor(String userName){
        for(int i=0;i<listEleitor.size();i++){
            if(listEleitor.get(i).getNomeUser().equals(userName)){
                return listEleitor.get(i);
            }
        }
        return null;
    }
    
    public String consutaCpfPorUsuario(String userName){
        for(int i=0;i<listEleitor.size();i++){
            if(listEleitor.get(i).getNomeUser().equals(userName)){
                return listEleitor.get(i).getCpf();
            }
        }
        return null;
    }
}
