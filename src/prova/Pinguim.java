/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author nakaz
 */
 public class Pinguim implements Bichointer{
    int fome;
    String comida;
    int saude;
    
    
    @Override
    public void alimentar(String comida){
        this.comida = comida;
    }

    @Override
    public void aumentarfome(int fome){
        this.fome = this.fome + fome;
    }
    @Override
    public void aumentarsaude(int saude){
        this.saude = this.saude + saude;
    }
    public void print(){
        System.out.println("O bichinho esta alimentado com Peixe, Saude do Pingum: " + this.saude + " fome do Pinguim: " + this.fome);
    }
}
