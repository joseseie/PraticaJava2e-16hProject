/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.e.exercicios;

/**
 *
 * @author Aly Macome
 */
public class Exerc11a7 {
    
    /*
    11.	Criar um array A com 10 elementos inteiros. Desenvolver um programa 
        que defina o percentual de elementos pares e ímpares, respectivamente, 
        armazenados neste array.
    */
    
    public static void main(String[] args) {
        
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        
        int elementosPares = 0;
        int elementosImpares = 0;
        double percetagemPar = 0;
        double percetagemImpar = 0;
        
        int n = 0;
        int m = 0;
        
        for (int i = 0; i < A.length; i++) {
            
            if(A[i]%2 == 0){
               
               elementosPares = n + 1;
               
               //percetagemPar = A.length * (elementosPares / 100); ver como fazer para calcular a percentagem
              System.out.print(A[i]);
               
             System.out.println();
                
            }
            else{
                
                elementosImpares = m + 1;
                //percetagemImpar = A.length * (elementosImpares / 100);
                System.out.print(A[i]);
            }
            
        }
        //System.out.println("Elementos pares : " + elementosPares);
        //System.out.println("Percentagem par : " + percetagemPar);
        //System.out.println("Elementos impares : " + elementosImpares);
        //System.out.println("Percetagem impar : " +  percetagemImpar);
    }
}
