/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicoes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class EscritorArquivoBinario {
    private ObjectOutputStream objetoEscrita;
    
    public void abrirArquivoEscrita(String nomeArquivo){
        try{
            //Carrega arquivo
            FileOutputStream arqLeitura = new FileOutputStream(nomeArquivo);
            objetoEscrita = new ObjectOutputStream(arqLeitura);
        }catch(IOException e){
            System.err.printf("Erro ao abrir arquivo: " + e);
        }
    }
    
    public void fecharArquivoEscrita(){
        try{
            //fecha o arquivo
            if(objetoEscrita !=null){
                objetoEscrita.close();
            }
        }catch(IOException e){
            System.err.printf("Erro ao fechar arquivo: "+e);
            System.exit(1);
        }
    }
    
    public void escreverObjetoArquivo(ArrayList objetos){
        try{
            for(int i=0 ; i<objetos.size() ; i++){
                objetoEscrita.flush();
                //objetoEscrita.writeObject(objetos.get(i));
            }
            System.out.println("\nObjeto gravado com sucesso!\n");
        }catch(Exception e){
            System.err.printf("Exceção durante escrita: "+e.toString());
        }
    }
}
