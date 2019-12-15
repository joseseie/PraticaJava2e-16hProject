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
public class Exerc19a7 {
    
    /*
    19.	Criar dois arrays A e B cada um com 10 elementos inteiros. Construir 
        um array C, onde cada elemento de C é a divisão dos respectivos elementos 
        em A e B, ou seja: C[i] = A[i] / float(B[i]).
    */
    
    public static void main(String[] args) {
        
        int A[] = {4,5,6,7,8,9,10,2,3,11,25,40,13,24,28};
        int B[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        float C[] = new float[A.length];
        
        for (int i = 0; i < A.length; i++) {
            
            C[i] = A[i] / B[i];
            
           // for (int j = 0; j < B.length; j++) {
               
                //C[i] = A[i] / B[j];
                
                
           // }
            
        }
        
        System.out.println(Arrays.toString(C));
    }
}
