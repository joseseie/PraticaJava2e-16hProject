/*
 2. Escreva um programa que leia 10 valores reais do teclado e 
 armazene-os num array d e permita que sejam impressos quanto solicitados. 
 */
package mz.e.exercicios.a7;

import java.io.*;

public class Exercicio2 {
    
   public static byte a(byte min, byte max) throws IOException
    {
        BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
        byte b;
        do
        {
            b=Byte.parseByte(x.readLine());
            if(b<min || b>max)
                System.out.println("ERROR!");
        }while(b<min || b>max);
        return b;
    }
    
    public static float[] criararry(byte x) throws IOException
    {
        float [] valores= new float[x];
        BufferedReader z= new BufferedReader(new InputStreamReader(System.in));
        
        for(byte i=(byte)0;i<x;i++)
        {
          System.out.println("Introduza um numero "+(i+1)+": ");
           valores[i]= Byte.parseByte(z.readLine());  
        }
        
        return valores;
    }
    
    
    public static void visualizar(float[] val) throws IOException
    {
        byte op=0;
        int i=0;
        do
        {
            System.out.println("Digite a posicao dio numero(1-10): ");
            op = a((byte)1,(byte)10);
            System.out.println("Numero da posiscao "+op+": "+val[op-1]);
            i++;
        }while(i<10);
    }
    
    public static void main(String args []) throws IOException
    {
       /*BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
       
       byte  numer=0;
        int [] numero = new int[10];
       for(byte i=0; i<2; i++)
       {
           System.out.println("Introduza um numero:");
           numer= Byte.parseByte(x.readLine());
          
       }
       
        System.out.println("OS numeros impressos sao:" +numero); 
         */ 
        
        float[] valores = criararry((byte)10);
        visualizar(valores);
    }
    
  }
