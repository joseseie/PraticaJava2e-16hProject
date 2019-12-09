/*
 	Faça um programa em leia seu nome e apelido e imprima o seu nome completo
 */
package mz.e.exercicios;

import java.io.*;

public class Exercicio5 {
    
    public static void main(String args []) throws IOException
    {
         BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
        
        String nome, apelido;
        
        System.out.println("Qual e' o seu nome?");
        nome= x.readLine();
        
        System.out.println("Qual e' o seu apelido?");
        apelido= x.readLine();
        
        System.out.println(""+ "O seu nome e':" +nome                 +apelido);
        // Melhorar, deve imprimir nome completo e nao as duas coisa separadas
        
    }
    
}
