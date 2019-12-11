/*
   5. Criar dois arrays A e B cada um com 10 elementos inteiros. 
Construir um array C, onde cada elemento de C é a soma dos respectivos 
elementos em A e B, ou seja:  
 
C[i] = A[i] + B[i]. 
 */
package mz.e.exercicios.a7;

import java.io.*;

public class Exercicio3 {
    
    public static int[] a(int x) throws IOException
    {
        
        int [] vectorA= new int[x];
        BufferedReader t= new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=(int)0; i<x; i++){
        System.out.println("introduza o " +(i+1)+"* valor:");
        vectorA[i]= Byte.parseByte(t.readLine());
                }
        return vectorA;  
    }
    public static void main(String args []) throws IOException
    {
        
        
    }
    
}
