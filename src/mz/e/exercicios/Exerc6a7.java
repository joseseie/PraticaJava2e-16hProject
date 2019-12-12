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
public class Exerc6a7 {
    
    /*
    6.	Faça um programa que faça a união de dois arrays de mesmo tamanho e mesmo 
    tipo em um terceiro array com dobro do tamanho.
    */
    
    public static void main(String[] args) {
        
        int array1[] = {2,3,4};
        int array2[] = {2,5,6};
        int array3[] = new int[array1.length + array2.length]; 
        
        int k = 0;
        
        for (int i = 0; i < array1.length; i++) {
            array3[k++] = array1[i];
        }
        
        for (int i = 0; i < array2.length; i++) {
            
            array3[k++] = array2[i];
            
        }
                   
       
        System.out.println(Arrays.toString(array3));
    }
}
