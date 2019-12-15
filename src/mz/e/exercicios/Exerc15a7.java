/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.e.exercicios;

import java.util.Arrays;
/**
 *
 * @author Aly Macome
 */
public class Exerc15a7 {
    
    /*
    15.	Criar um array A com 10 elementos inteiros. Implementar um programa que 
        defina e escreva a quantidade de elementos armazenados neste vetor que são pares.
    */
    
    public static void main(String[] args) {
        
        int quantPar = 0;
        int k = 0;
        int posicao = -1;
        
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int par[]= new int[A.length];
        
        for (int i = 0; i < A.length; i++) {
            
            if (A[i] % 2 == 0) {
                
                par[k++] = A[i];
                quantPar++;
               
                
            }
            
            
            
        }
        System.out.println("Os elementos pares sao: " + quantPar);
      
        System.out.println(Arrays.toString(par));
    }
    
}
