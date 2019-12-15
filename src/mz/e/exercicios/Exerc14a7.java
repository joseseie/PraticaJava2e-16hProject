/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.e.exercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aly Macome
 */
public class Exerc14a7 {
    
    /*
    14.	Ler um array A com 10 elementos inteiros correspondentes as idades de 
        um grupo de pessoas. Escreva um programa que determine e escreva a menor e
        a maior idades e suas respectivas posições.
    */
    
    public static void main(String[] args) {
        
        int x = 4;
        
        /*
        O maior começa com Integer.MIN_VALUE, que é o menor valor que um inteiro 
        pode ter em Java (no caso, é -2147483648).
        */
        int idadeMaior = Integer.MIN_VALUE;
        int indiceMaior = -1;
        int idadeMenor = 0;
        int indiceMenor = -1;
        
        int idade[] = new int[x];
        
        for (int i = 0; i < idade.length; i++) {
            
            System.out.println("indique a idade: ");
            
            Scanner s =new Scanner(System.in);
            
            idade[i] = s.nextInt();
            
            
            
            if (idade[i] > idadeMaior) {
                
              idadeMaior = idade[i];
              indiceMaior = i;
                
            } else if(idade[i] < idadeMaior){
                
               idadeMenor = idade[i];
               indiceMenor = i;
              //verificar codigo para mostrar menor numero  
            }
            
            
            
            
        }
        System.out.println(Arrays.toString(idade) );
        System.out.println("a maior idade e:" + idadeMaior + "   esta na posicao   " + indiceMaior );
        System.out.println("a menor idade e:" + idadeMenor );
    }
}
