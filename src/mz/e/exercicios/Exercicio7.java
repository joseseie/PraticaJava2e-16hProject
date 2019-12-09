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
        
        byte a, b, s;


        System.out.println("Introduza o valor de A:");
        a=Byte.parseByte(x.readLine());
        
        System.out.println("Introduza o valor de B:");
        b= Byte.parseByte(x.readLine());

        s= (byte) (a+b);
       
        if(s==a){
            System.out.println("A soma dos valores de A e B e' igual a ao Valor de a que e':"      +s+       "e os valores de A e B sao:" +a+     "e:"   +b);
        } else 
            System.out.println("O valor da soma de A com B nao e' igual ao valor de A");

    }
}
