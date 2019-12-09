/*

	Faça um programa que leia 3 números inteiros distintos e escreva o menor deles.
 */
package mz.e.exercicios;

import java.io.*;

public class Exercicio9 {

    public static void main(String args []) throws IOException
    {
        BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
        
        int n1, n2, n3;
        
        System.out.println("Introduza o primeiro numero:");
        n1= Integer.parseInt(x.readLine());
        
        System.out.println("Introduza o segundo numero:");
        n2= Integer.parseInt(x.readLine());
        
        System.out.println("Introduza o terceiro numero:");
        n3= Integer.parseInt(x.readLine());
        
        if(n1<n2 && n1<n3)
        {
            System.out.println("O menor numero e' o primeiro numero que e':" +n1);
        } else if(n2<n1 && n2<n3)
        {
            System.out.println("O menor numero e' o segundo numero que e':" +n2);
        } else System.out.println("O menor numero e' o terceiro numero que e':" +n3);
    }
}
