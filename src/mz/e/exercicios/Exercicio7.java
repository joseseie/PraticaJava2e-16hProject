/*
 Faça um programa que leia os valores A e B. Mostre uma mensagem que informe se a soma
    de A com B.

 */
package mz.e.exercicios;

import java.io.*;
public class Exercicio7 {
 
    public static void main(String args []) throws IOException
    {
        BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
        
        byte a, b;
        System.out.println("Introduza o valor de A:");
        a=Byte.parseByte(x.readLine());
        
        System.out.println("Introduza o valor de B:");
        b= Byte.parseByte(x.readLine());
        //Melhorar, e o exercicio nao foi terminado...
    }
}
