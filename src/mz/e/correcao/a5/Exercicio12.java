/*
  12.	Fazer um programa que imprima a média aritmética dos números 8,9 e 7. 
        A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
    

 */
package mz.e.correcao.a5;

import java.io.*;

public class Exercicio12 {
   
    public static void main(String args []) throws IOException{
         float m1= (8+9+7)/3; //Melhorar, separar declaracao de variaveis das operacoes
         float m2= (4+5+6)/3; //Melhorar, separar declaracao de variaveis das operacoes
         float mt= (m1+m2)/2; //Melhorar, separar declaracao de variaveis das operacoes
        
        System.out.println("A media aritmetica dos numero 8, 9 e 7 e': " +m1);
         System.out.println("A media aritmetica dos numeros 4, 5 e 6 e': " +m2);
          System.out.println("A media aritmetica total e': " +mt);
    }
}
