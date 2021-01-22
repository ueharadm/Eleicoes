/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicoes.Gerenciadores;

import eleicoes.Atributos.Eleicao;
import eleicoes.Eleicoes;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class GerenciadorEleicao {
    public ArrayList <Eleicao> listEleicao = new ArrayList();
    
    public void votarCandidato(int indexEleicao,int indexCandidato){
        Eleicoes.geleicao.listEleicao.get(indexEleicao);
    }
}
