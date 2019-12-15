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
public class Exerc12a7 {
    /*
    12.	Criar um array A com 10 elementos inteiros. Escrever um programa que 
    calcule e escreva:
    a) a soma de elementos armazenados neste array que são inferiores a 15; 
    b) a quantidade de elementos armazenados no array que são iguais a 15; e 
    c) a média dos elementos armazenados no array que são superiores a 15.
    */
    
    public static void main(String[] args) {
        
        int A[] = {2,4,5,16,20,30,6,17,22,30};
        
        int soma = 0;
        int contador = 0;
        double media = 0;
        
       // public static void valoreInferios15(){
        
        //}
        for (int i = 0; i < A.length; i++) {
            
            if(A[i] < 15){
                
              soma = soma + A[i] ; 
              //System.out.println(" Os elementos inferior a 15 e: " + A[i]);
             
            }
            else if(A[i] == 15){
                
                contador++;
            
            }
            //else if(A[i] > 15){
                
                //soma = soma +A[i];
                //contador++;
                //media = soma / contador;
            
                
            //}
            
            
            
            
        }
        
        System.out.println("A soma dos elementos inferior a 15 e: " + soma);
        System.out.println("quantidade de elementos iguais a 15 e: " + contador);
       // System.out.println("media de elemento superiores a 15 e: " + media);
    }
    
}
