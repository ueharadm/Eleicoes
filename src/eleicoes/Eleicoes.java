/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicoes;

import eleicoes.Gerenciadores.GerenciadorEleitor;
import eleicoes.Gerenciadores.GerenciadorEleicao;
import eleicoes.Gerenciadores.GerenciadorUsuario;
import eleicoes.Gerenciadores.GerenciadorCandidato;
import eleicoes.Atributos.Candidato;
import eleicoes.Atributos.Usuario;
import eleicoes.Atributos.Eleicao;
import eleicoes.Atributos.Eleitor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Eleicoes {

    
    /**
     * @param args the command line arguments
     */
    
    //Inicialização dos Gerenciadores
    static public GerenciadorEleicao geleicao = new GerenciadorEleicao();
    static public GerenciadorEleitor geleitor = new GerenciadorEleitor();
    static public GerenciadorCandidato gc = new GerenciadorCandidato();
    static public GerenciadorUsuario gu = new GerenciadorUsuario();
    
    //Variável para salvar o usuário atualmente logado
    static Eleitor loggedUser;
    //Variável para salvar a eleicao atualmente selecionada
    static Eleicao currentElection;
    //Variável para salvar o candidato atualmente selecionado
    static Candidato currentCandidate;
    
    public static void main(String[] args) throws IOException {
        /*Métodos de exportar CSV
        Eleicoes.exportCSVCand("listCandidatos.csv", Eleicoes.gc.listCandidato);
        
        Eleicoes.exportCSVEleicao("listEleicao.csv", Eleicoes.geleicao.listEleicao);
            for(int i=0 ; i<Eleicoes.geleicao.listEleicao.size() ; i++){
                Eleicoes.exportCSVEleicaoCpf(i);
                Eleicoes.exportCSVEleicaoCand(i);
                Eleicoes.exportCSVEleicaoVotos(i);
            }
        
        Eleicoes.exportCSVEleitor("listEleitor.csv", Eleicoes.geleitor.listEleitor);
        */
               

        //Importar lista de candidatos
        gc.listCandidato = importCSVCand("listCandidatos.csv");
        
        
        //Importar lista de eleições
        geleicao.listEleicao = importCSVEleicao("listEleicao.csv");
        //Importar lista de votantes, candidatos e votos por candidato em cada eleição
        for(int i=0 ; i<geleicao.listEleicao.size() ; i++){
            //Quem votou
            geleicao.listEleicao.get(i).setCpfVotantes(importCSVEleicaoCpf(i));
            //Candidatos disponíveis
            geleicao.listEleicao.get(i).setNumCandidato(importCSVEleicaoCand(i));
            //Quantos votos por candidato
            geleicao.listEleicao.get(i).setVotosCandidato(importCSVEleicaoVotos(i));
        }
        
        
        //Importar lista de Eleitores
        geleitor.listEleitor = importCSVEleitor("listEleitor.csv");
        
        
        
        System.out.println(geleitor.listEleitor.get(1).getNomeUser());
        System.out.println(geleitor.consutaCpfPorUsuario("user"));

        IGLogin ig = new IGLogin();
        ig.setVisible(true);
        
        
    }
    
    
    //método para exportar CSV de candidatos
    public static void exportCSVCand(String nome, ArrayList <Candidato> list) throws IOException{
        File arquivo = new File(nome);
        arquivo.createNewFile();
        
        FileWriter fileWriter = new FileWriter(arquivo,false);
        PrintWriter writer = new PrintWriter(fileWriter);
        
        for(int i=0 ; i<list.size() ; i++){
            writer.println(list.get(i).getNumId()+";"+list.get(i).getNome()+";"+list.get(i).getDescricao());
        }
        System.out.println("CSV de candidatos exportado!");
        writer.flush();
        writer.close();
    }
    //método para importar CSV de candidatos
    public static ArrayList importCSVCand(String nome) throws IOException{
        ArrayList <Candidato> listCand = new ArrayList();
        Scanner entrada = new Scanner(new File(nome));
        while(entrada.hasNext()){
            try{
                String line = entrada.nextLine();
                String var[] = line.split(";");
                listCand.add(new Candidato(Integer.parseInt(var[0]), var[1], var[2]));
            }catch(NoSuchElementException e){
                System.err.println("Arquivo com formato incorreto: "+ e);
                entrada.close();
                System.exit(1);
            }
        }
        System.out.println("CSV Candidatos importado");
        entrada.close();
        return listCand;
    }
    
    
    //método para exportar CSV de eleiçoes
    public static void exportCSVEleicao(String nome, ArrayList <Eleicao> list) throws IOException{
        File arquivo = new File(nome);
        arquivo.createNewFile();
        
        FileWriter fileWriter = new FileWriter(arquivo,false);
        PrintWriter writer = new PrintWriter(fileWriter);
        
        for(int i=0 ; i<list.size() ; i++){
            writer.println(list.get(i).getNome()+";"+list.get(i).getDescricao()+";"+list.get(i).getData());
            
        }
        System.out.println("CSV de eleicoes exportado!");
        writer.flush();
        writer.close();
    }
    //método para importar CSV de eleiçoes
    public static ArrayList importCSVEleicao(String nome) throws IOException{
        ArrayList <Eleicao> list = new ArrayList();
        Scanner entrada = new Scanner(new File(nome));
        while(entrada.hasNext()){
            try{
                String line = entrada.nextLine();
                String var[] = line.split(";");
                list.add(new Eleicao(var[0], var[1], var[2]));
            }catch(NoSuchElementException e){
                System.err.println("Arquivo com formato incorreto: "+ e);
                entrada.close();
                System.exit(1);
            }
        }
        System.out.println("CSV Eleicoes importado");
        entrada.close();
        return list;
    }
    
    
    //método para exportar CSV de eleitores
    public static void exportCSVEleitor(String nome, ArrayList <Eleitor> list) throws IOException{
        File arquivo = new File(nome);
        arquivo.createNewFile();
        
        FileWriter fileWriter = new FileWriter(arquivo,false);
        PrintWriter writer = new PrintWriter(fileWriter);
        
        for(int i=0 ; i<list.size() ; i++){
            writer.println(list.get(i).getNome()+";"+list.get(i).getCpf()+";"+
                    list.get(i).getCidade()+";"+list.get(i).getNomeUser()+";"+list.get(i).getSenha()+";"+list.get(i).isAdmin());
        }
        System.out.println("\nCSV eleitores exportado!\n");
        writer.flush();
        writer.close();
    }
    //método para importar CSV de eleitores
    public static ArrayList importCSVEleitor(String nome) throws IOException{
        ArrayList <Eleitor> list = new ArrayList();
        Scanner entrada = new Scanner(new File(nome));
        while(entrada.hasNext()){
            try{
                String line = entrada.nextLine();
                String var[] = line.split(";");
                list.add(new Eleitor(var[0], var[1], var[2], var[3], var[4], Boolean.parseBoolean(var[5])));
            }catch(NoSuchElementException e){
                System.err.println("Arquivo com formato incorreto: "+ e);
                entrada.close();
                System.exit(1);
            }
        }
        System.out.println("CSV Eleitor importado");
        entrada.close();
        return list;
    }
    
    
    
    //método para exportar CSV de cpfs que votaram em uma eleição
    public static void exportCSVEleicaoCpf(int index) throws IOException{
        ArrayList list = new ArrayList(Eleicoes.geleicao.listEleicao.get(index).getCpfVotantes());
        File arquivo = new File("listEleicaoCpf\\listEleicaoCpf"+index+".csv");
        arquivo.createNewFile();
        
        FileWriter fileWriter = new FileWriter(arquivo,false);
        PrintWriter writer = new PrintWriter(fileWriter);
        
        for(int i=0 ; i<list.size() ; i++){
            writer.println(list.get(i));
        }
        System.out.println("\nCSV cpfs votante exportado!\n");
        writer.flush();
        writer.close();
    }
    //método para importar CSV de cpfs votantes da eleição de index mencionado
    public static ArrayList importCSVEleicaoCpf(int index) throws IOException{
        ArrayList list = new ArrayList();
        Scanner entrada = new Scanner(new File("listEleicaoCpf\\listEleicaoCpf"+index+".csv"));
        while(entrada.hasNext()){
            try{
                String line = entrada.nextLine();
                String var[] = line.split(";");
                for(int i=0 ; i<var.length ; i++){
                    list.add(var[i]);
                }
            }catch(NoSuchElementException e){
                System.err.println("Arquivo com formato incorreto: "+ e);
                entrada.close();
                System.exit(1);
            }
        }
        System.out.println("CSV cpf votantes importado");
        entrada.close();
        return list;
    }
    
    
    //método para exportar CSV de candidatos disponiveis em uma eleicao
    public static void exportCSVEleicaoCand(int index) throws IOException{
        ArrayList list = new ArrayList(Eleicoes.geleicao.listEleicao.get(index).getNumCandidato());
        File arquivo = new File("listEleicaoCand\\listEleicaoCand"+index+".csv");
        arquivo.createNewFile();
        
        FileWriter fileWriter = new FileWriter(arquivo,false);
        PrintWriter writer = new PrintWriter(fileWriter);
        
        for(int i=0 ; i<list.size() ; i++){
            writer.println(list.get(i));
        }
        System.out.println("\nCSV candidatos eleicao exportado!\n");
        writer.flush();
        writer.close();
    }
    //método para importar CSV de candidatos disponiveis em uma eleição
    public static ArrayList importCSVEleicaoCand(int index) throws IOException{
        ArrayList list = new ArrayList();
        Scanner entrada = new Scanner(new File("listEleicaoCand\\listEleicaoCand"+index+".csv"));
        while(entrada.hasNext()){
            try{
                String line = entrada.nextLine();
                String var[] = line.split(";");
                for(int i=0 ; i<var.length ; i++){
                    list.add(var[i]);
                }
            }catch(NoSuchElementException e){
                System.err.println("Arquivo com formato incorreto: "+ e);
                entrada.close();
                System.exit(1);
            }
        }
        System.out.println("CSV candidatos eleicao importado");
        entrada.close();
        return list;
    }
    
    
    //método para exportar votos por candidato em uma eleicao
    public static void exportCSVEleicaoVotos(int index) throws IOException{
        ArrayList <Integer> list = new ArrayList(Eleicoes.geleicao.listEleicao.get(index).getVotosCandidato());
        File arquivo = new File("listEleicaoVotos\\listEleicaoVotos"+index+".csv");
        arquivo.createNewFile();
        
        FileWriter fileWriter = new FileWriter(arquivo,false);
        PrintWriter writer = new PrintWriter(fileWriter);
        
        for(int i=0 ; i<list.size() ; i++){
            writer.println(list.get(i));
        }
        System.out.println("\nCSV votos por candidato exportado!\n");
        writer.flush();
        writer.close();
    }
    //método para importar votos por candidato em uma eleição
    public static ArrayList importCSVEleicaoVotos(int index) throws IOException{
        ArrayList <Integer> list = new ArrayList();
        Scanner entrada = new Scanner(new File("listEleicaoVotos\\listEleicaoVotos"+index+".csv"));
        while(entrada.hasNext()){
            try{
                String line = entrada.nextLine();
                String var[] = line.split(";");
                for(int i=0 ; i<var.length ; i++){
                    list.add(Integer.parseInt(var[i]));
                }
            }catch(NoSuchElementException e){
                System.err.println("Arquivo com formato incorreto: "+ e);
                entrada.close();
                System.exit(1);
            }
        }
        System.out.println("CSV votos por candidato importado");
        entrada.close();
        return list;
    }
}
