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
public class Exerc4a7 {
    
    /*
    4.	Faça um programa que copie o conteúdo de um array para um segundo array.
    */
    public static void main(String[] args) {
        
        String paises[] = {"Mocambique","Angola",};
        
        String copiaPaises [] = new String[2];
        
        for (int i = 0; i < paises.length; i++) {
            
            for (int j = 0; j < copiaPaises.length; j++) {
                
                copiaPaises[j] = paises[i];
                
                
                //melhorar so mostra o ultimo elemento do array paises 
                
               
            }
              
        }
              System.out.println("Array copia : " + Arrays.toString(copiaPaises));
    }
}
