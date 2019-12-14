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
public class Exerc10a7 {
    
    /*
    10.	Criar um array A com 10 elementos inteiros. Implementar um programa 
        que defina e escreva a média aritmética simples dos elementos ímpares 
        armazenados neste array.
    */
    public static void main(String[] args) {
        
        //int A [] = {2,4,5,10,20,15,7,4,3,1};
        int B [] = {1,2,3,4,5,6,7,8,9,10};
        
        int soma  = 0;
        double media = 0;
        int k = 0;
        int n = 0;
        
        int ementosImpares [] = new int [B.length];
        
        for (int i = 0; i < B.length; i++) {
            
            if(B[i] % 2 != 0){
                
                //ementosImpares[k++] = B[i];
                soma = soma + B[i];
                
                n++;
            
            }
             ementosImpares[k++] = B[i];
        }
        
        media = soma / n;
        
        System.out.println(Arrays.toString(B));
        System.out.println(" elementos impares: " + n );
        System.out.println(" soma dos elementos impares: " + soma );
       
        System.out.println("A media artimetrica dos elemntos impares do array e: " + media );
    }
}
