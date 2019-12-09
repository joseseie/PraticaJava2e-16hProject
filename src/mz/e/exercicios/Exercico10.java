/*
 	Faça um algoritmo que leia dois números e mostre qual o maior dos dois
 */
package mz.e.exercicios;

import java.io.*;

public class Exercico10 {
   
    public static void main(String args []) throws IOException
    {
        BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
        
        int n1, n2;
        
        System.out.println("Introduza o primeiro numero:");
        n1= Integer.parseInt(x.readLine());
        
        System.out.println("Introduza o segundo numero:");
        n2= Integer.parseInt(x.readLine());
        
        if(n1>n2){
            System.out.println("O maior numero e' o primeiro que e':" +n1);
        } else System.out.println("O maior numero e' o segundo que e':" +n2);
    }
}
