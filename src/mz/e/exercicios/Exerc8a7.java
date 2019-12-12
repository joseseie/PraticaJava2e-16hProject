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
public class Exerc8a7 {
    
    /*
    8.	Criar um array A com 10 elementos inteiros. Implementar um programa que
        defina e escreva a soma de todos os elementos armazenados neste array.
    */
    
    public static void main(String[] args) {
        
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        
        int soma = 0;
        
        for (int i = 0; i < A.length; i++) {
            
            soma = soma + A[i];
            
        }
        
        System.out.println(Arrays.toString(A));
        System.out.println("A soma dos elemento do Aray A e: " + soma);
    }
    
}
