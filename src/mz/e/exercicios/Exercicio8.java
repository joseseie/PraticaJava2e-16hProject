/*a
 Desenvolva um programa que leia um número inteiro e imprima o seu antecessor e seu sucessor.
 */
package mz.e.exercicios;

import java.io.*;
public class Exercicio8 {
    
    public static void main(String args []) throws IOException
    {
        BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
        int nu;
        
        System.out.println("Introduza um numero:");
        nu= Integer.parseInt(x.readLine());
        
        int ant= nu-1;
        int su= nu+1;
        
        System.out.println("O numero que voce digitou foi:" +nu);
        System.out.println("O antecessor do numero que voce colocou e':" +ant );
        System.out.println("O sucessor do numero que voce colocou e':" +su);
    }
}