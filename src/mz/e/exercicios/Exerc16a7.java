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
public class Exerc16a7 {
    
    /*
    16.	Criar um array A com 5 elementos inteiros. Construir um array B de mesmo
        tipo e tamanho e com os "mesmos" elementos do array A, ou seja, B[i] = A[i].


    */
    public static void main(String[] args) {
        
        int A[] = {1,2,3,4,5};
        int B[] = new int[A.length];
        
        for (int i = 0; i < A.length; i++) {
            
            B[i] = A[i];
            
        }
        
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(A));
    }
            
    
}
