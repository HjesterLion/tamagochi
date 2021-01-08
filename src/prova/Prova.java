/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.Scanner;


/**
 *
 * @author nakaz
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nome;
        int idade;
        int escolha;
        String tipo;
        System.out.println("Digite o tipo de bichinho voce quer Urso ou Pinguim?");
        tipo = entrada.next();
         System.out.println("Digite o nome e idade");
    	Bichinho b = new Bichinho(nome = entrada.next(), idade = entrada.nextInt());
        
        if(tipo.equals("Urso")){
        Urso u = new Urso();
    	u.aumentarfome(100);
        u.alimentar("Mel");
        u.aumentarsaude(100);
        u.print();
        }
        if(tipo.equals("Pinguim")){
        Pinguim p = new Pinguim();
        p.aumentarfome(100);
        p.alimentar("Peixe");
        p.aumentarsaude(100);
        p.print();
       }
    	System.out.println(b.getNome() + " " + b.getIdade());
        System.out.println("Gostaria de renomar o bichinho? 1 = Sim , 2 = Não");
        escolha = entrada.nextInt();
        if(escolha == 1){
            System.out.println("Renomeie o Bichinho: ");
            b.setNome(nome = entrada.next());
            b.setIdade(idade = entrada.nextInt());    	
            System.out.println(b.getNome() + " " + b.getIdade());
        }
    }
}
