/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.awt.BorderLayout;

/**
 *
 * @author nakaz
 */
public class Bichinho {
    private String nome;
    private int idade;
    private int fome;
    private int saude;
    private int comida;


    public Bichinho(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void comida(){
        System.out.println("O urso foi alimentado com mel");
        fome +=50;
    }
}

