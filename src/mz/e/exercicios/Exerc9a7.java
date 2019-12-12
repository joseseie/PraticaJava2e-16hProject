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
public class Exerc9a7 {
    
    /*
    9.	Criar um array A com 10 elementos inteiros. Implementar um programa 
        que determine a soma dos elementos armazenados neste array que são múltiplos de 5.
    */
    public static void main(String[] args) {
        
        int A [] = {2,4,5,10,20,15,7,4,3,1};
        
        int soma = 0;
        
        for (int i = 0; i < A.length; i++) {
            
            if(A[i] % 5 == 0){
                
                soma = soma + A[i];
            
            }
            
        }
        System.out.println(Arrays.toString(A)); 
        System.out.println("A soma dos elemntos do array A que sao multiplos de 5 e" + soma);
    }
}
