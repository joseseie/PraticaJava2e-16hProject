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
    
    public static int[] b(int y) throws IOException
    {
        BufferedReader t= new BufferedReader(new InputStreamReader(System.in));
        
        int [] vectorB = new int[y];
        for(int j= (int)0; j<y; j++)
        {
            System.out.println("Introduza o" +(j+1)+ "* valor");
            vectorB[j] = Integer.parseInt(t.readLine());
        }
        return vectorB;
    }
    
    /*public static void cal( int vectorA, int vectorB) throws IOException
    {
        BufferedReader t= new BufferedReader(new InputStreamReader(System.in));
        
        int [] vectorC= new int[2];
        for(int k=0; k<vectorC.length; k++)
        {
            vectorC[k] = vectorA + vectorB;
            
            System.out.println("OS valores do vector c e':" +vectorC);
            
        }
        
        
    }*/
     public static void main(String args []) throws IOException
     {
         
     }
    public static void main(String args [],int vectorA, int vectorB ) throws IOException
    {
        
       BufferedReader t= new BufferedReader(new InputStreamReader(System.in));
        
        int [] vectorC= new int[2];
        for(int k=0; k<vectorC.length; k++)
        {
            vectorC[k] = vectorA + vectorB;
            
            System.out.println("OS valores do vector c e':" +vectorC);
            
        }
        
    }
    
}
