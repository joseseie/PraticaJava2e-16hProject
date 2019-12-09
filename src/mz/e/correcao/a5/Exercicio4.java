/*
 
4.	Faça um programa que leia o seu nome e imprima em tela
 */
package mz.e.correcao.a5;

import java.io.*;

/**
 *
 * @author Mutole
 */
public class Exercicio4 {
    
    public static void main(String args []) throws IOException
    {
         BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
        String nome;
        
        System.out.println("Escrreva o seu nome:");
        nome= x.readLine();
    }
}
