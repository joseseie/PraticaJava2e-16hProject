/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.e.exercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aly Macome
 */
public class Exerc13a7 {
    
    /*
    13.	Ler um array A com 10 elementos inteiros correspondentes as idades de um 
    grupo de pessoas. Escreva um programa que determine e escreva a quantidade de
    pessoas que possuem idade superior a 35 anos.
    */
    
    public static void main(String[] args) {
        
        int x = 5;
        
       
        int contador = 0;
        int k = 0;
        
        //System.out.println("indique a idade: ");
        
        //Scanner s = new Scanner(System.in);
        
        //idade = s.nextInt();
         
        int idade[]= new int[x];
        int idadeSperior35 [] = new int[x];
        
        for (int i = 0; i < idade.length; i++) {
            
            System.out.println("indique a idade: ");
            
            Scanner s = new Scanner(System.in);
            idade[i] = s.nextInt();
            
            if (idade[i] > 35) {
                
                contador++;
                
                idadeSperior35[k++]= idade[i];
                               
                                
            }
            
             
        }
        
        System.out.println("A quantidade de idades superiores a 35 anos e : " + contador);
        System.out.println("As idades superiores a 35 anos sao: " + Arrays.toString(idadeSperior35 )); 
        //melhorar para imprimir apenas o tamanho do array com as idaes pretendidas.
    }
    
}
