/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.e.exercicios;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Aly Macome
 */
public class Exerc2a7 {
    /*
    2.	Escreva um programa que leia 10 valores reais do teclado e armazene-os 
    num array d e permita que sejam impressos quanto solicitados.
    */
    public static void main(String[] args) {
        int x = 10;
        System.out.println("indique os numeros");
        
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        
        int d[] = new int[x];
        
        for (int i = 0; i < d.length; i++) {
           d[i]=y; 
           
           
        }
        
        
       // System.out.println(d[]);
      
       
        
        
        
    }
}
