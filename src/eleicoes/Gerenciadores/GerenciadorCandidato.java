/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicoes.Gerenciadores;

import eleicoes.Atributos.Candidato;
import eleicoes.Eleicoes;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class GerenciadorCandidato {
    public ArrayList <Candidato> listCandidato = new ArrayList();
    
    public Candidato consultarNumero(int numId){
        for(int i=0 ; i<Eleicoes.gc.listCandidato.size() ; i++){
            if(Eleicoes.gc.listCandidato.get(i).getNumId()==numId){
                return Eleicoes.gc.listCandidato.get(i);
            }
        }
        return null;
    }
    
}
