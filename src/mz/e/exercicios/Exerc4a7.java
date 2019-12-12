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
        
        String paises[] = {"Mocambique","Angola" ,"Cabo Verde"};
        
        String copiaPaises [] = new String[3];
        
        int k =0;
        
        for (int i = 0; i < paises.length; i++) {
           
            copiaPaises[k++] = paises[i];
                       
              
        }
              System.out.println("Array copia : " + Arrays.toString(copiaPaises));
    }
}
