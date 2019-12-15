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
public class Exerc17a7 {
    
    /*
    17.	Criar um array A com 8 elementos inteiros. Construir um array B de mesmo
        tipo e tamanho e com os elementos do array A multiplicados por 2, 
        ou seja: B[i] = A[i] * 2.
    */
    
    public static void main(String[] args) {
        
        int A[] = {1,2,3,4,5,6,7,8};
        
        int B[] = new int[A.length];
        
        for (int i = 0; i < A.length; i++) {
            
            B[i] = A[i]*2;
            
        }
        
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
}
