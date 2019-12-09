/*
   6.	Faça um programa que leia dois números e imprima a sua soma
   
 */
package mz.e.correcao.a5;

import java.io.*;

public class Exercicio6 {
    
    public static void main(String args []) throws IOException
    {
       int n1, n2;
       BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("Introduza o primeiro numero:");
       n1= Integer.parseInt(x.readLine());
       
        System.out.println("Introduza o segundo numero:");
       n2= Integer.parseInt(x.readLine());
      
       
       int s= n1+n2; //Melhorar, deves separar declaracao de variaveis das operacoes
       System.out.println("A soma dos numeros que voce introduziu e':" +s);
    }
    
}
