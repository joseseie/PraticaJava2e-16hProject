/*
 

    14.	Escreva uma classe ConversaoDeUnidadesDeTemperatura que contenha métodos estáticos para 
        calcular a conversão entre diferentes escalas de temperatura. Considere as fórmulas de conversão abaixo: 
    a)	De graus Celsius (C) para graus Fahrenheit (F): F = (9 × C/5) + 32) 
    b)	De graus Fahrenheit (F) para graus Celsius (C): C = (F − 32) × +5/9 
    c)	De graus Celsius (C) para graus Kelvin (K): K = C + 273.15 
    d)	De graus Kelvin (K) para graus Celsius (C): C = K − 273.15 
    e)	De graus Celsius (C) para graus Réaumur (Re): Re = C ∗ 4/5 
    f)	De graus Réaumur (Re) para graus Celsius (C): C = Re ∗ 5/4 
    g)	De graus Kelvin (K) para graus Rankine (R): R = K ∗ 1.8 
    h)	De graus Rankine (R) para graus Kelvin (K): K = R/1.8

 */
package mz.e.exercicios;

import java.io.*;

public class Exercicio14 {
    
   public static byte a(byte min, byte max) throws IOException
   {
        BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
        byte b;
        
        do
        {
            b= Byte.parseByte(x.readLine());
            if(b<min || b>max)
                System.out.println("ERROR");
        }while(b<min || b>max);
        return b;
   }
    
   public static void c() throws IOException
   {
        BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
         byte d=0;
         
         do
         {
           System.out.println("SISTEMA DE CONVERSSAO DE TEMPERATURA");
           System.out.println("1.  De graus Celsius (C) para graus Fahrenheit");
           System.out.println("2.  De graus Fahrenheit (F) para graus Celsius (C)");
           System.out.println("3.  De graus Celsius (C) para graus Kelvin (K)");
           System.out.println("4.  De graus Kelvin (K) para graus Celsius (C):");
           System.out.println("5.  De graus Celsius (C) para graus Réaumur (Re)");
           System.out.println("6.  De graus Réaumur (Re) para graus Celsius (C)");
           System.out.println("7.  De graus Kelvin (K) para graus Rankine (R)");
           System.out.println("8.  De graus Rankine (R) para graus Kelvin (K)");
           System.out.println("9. SAIR DO PROGRAMA");
           
           d= a((byte)1, (byte)9);
           
           switch(d)
           {
               
               //INICIO C PARA F
               case 1:
                   
                   do
                   {
                      System.out.println("1. Intrada dos graus Celsius");
                      System.out.println("2. Voltar ao menu  principal"); 
                      d=a((byte)1, (byte)2);
                      switch(d)
                      {
                          case 1:
                              System.out.println("Introduza os graus que voce pretende converter:");
                              float c= Float.parseFloat(x.readLine());
                              float f= (9*c/5) +32;
                              System.out.println("A conversao de graus celsius para Fahrenheit e':" +f);
                              break;
                      }
                   }while(d!=2);
                   
               break;
               //FIM DE F PARA C
               
               //INICIO DE F PARA C
               case 2:
                    do
                   {
                      System.out.println("1. Intrada dos graus Celsius");
                      System.out.println("2. Voltar ao menu  principal"); 
                      d=a((byte)1, (byte)2);
                      switch(d)
                      {
                          case 1:
                              System.out.println("Introduza os graus que voce pretende converter:");
                              float f= Float.parseFloat(x.readLine());
                              float c = ((f - 32) + 5/9);
                              System.out.println("A conversao de graus Fahrenheit  para celsius e':" +c);
                              break;
                      }
                   }while(d!=2);
               break;
               //FIM DE K PARA F
                   
               //INICIO DE C PARA K
               case 3:
                   do
                   {
                      System.out.println("1. Intrada dos graus Celsius");
                      System.out.println("2. Voltar ao menu  principal"); 
                      d=a((byte)1, (byte)2);
                      switch(d)
                      {
                          case 1:
                              System.out.println("Introduza os graus que voce pretende converter:");
                              float c= Float.parseFloat(x.readLine());
                              float k = (float) (c + 273.15);
                              System.out.println("A conversao de graus Fahrenheit  para celsius e':" +k);
                              break;
                      }
                   }while(d!=2); 
               break;
                //FIM DE C PARA K
                
                   //INICIO DE K PARA C
               case 4:
                    do
                   {
                      System.out.println("1. Intrada dos graus Celsius");
                      System.out.println("2. Voltar ao menu  principal"); 
                      d=a((byte)1, (byte)2);
                      switch(d)
                      {
                          case 1:
                              System.out.println("Introduza os graus que voce pretende converter:");
                              float k= Float.parseFloat(x.readLine());
                              float c = (float) (k - 273.15);
                              System.out.println("A conversao de graus kelvi para celsius e':" +c);
                              break;
                      }
                   }while(d!=2); 
               break;
                //FIM DE K PARA C
                   
               //INICIO DE C PARA REAUMUR
               case 5:
                  do
                   {
                      System.out.println("1. Intrada dos graus Celsius");
                      System.out.println("2. Voltar ao menu  principal"); 
                      d=a((byte)1, (byte)2);
                      switch(d)
                      {
                          case 1:
                              System.out.println("Introduza os graus que voce pretende converter:");
                              float c= Float.parseFloat(x.readLine());
                              float r = c * 4/5 ;
                              System.out.println("A conversao de graus celsius para reaumur e':" +r);
                              break;
                      }
                   }while(d!=2);    
               break;
                 //FIM DE C PARA REA  
              
               //INICIO DE R PARA C    
               case 6:
                   do
                   {
                      System.out.println("1. Intrada dos graus Celsius");
                      System.out.println("2. Voltar ao menu  principal"); 
                      d=a((byte)1, (byte)2);
                      switch(d)
                      {
                          case 1:
                              System.out.println("Introduza os graus que voce pretende converter:");
                              float r= Float.parseFloat(x.readLine());
                              float c = r * 5/4;
                              System.out.println("A conversao de graus  reaumur para celsius e':" +c);
                              break;
                      }
                   }while(d!=2);   
               break;
                //FIM DE R PARA C 
                   
               //INICIO DE K PARA RANKINE
               case 7:
                   do
                   {
                      System.out.println("1. Intrada dos graus Celsius");
                      System.out.println("2. Voltar ao menu  principal"); 
                      d=a((byte)1, (byte)2);
                      switch(d)
                      {
                          case 1:
                              System.out.println("Introduza os graus que voce pretende converter:");
                              float k= Float.parseFloat(x.readLine());
                              float r= (float) (k*1.8);
                              System.out.println("A conversao de graus  reaumur para celsius e':" +r);
                              break;
                      }
                   }while(d!=2);   
                   
               break;
                 //FIM DE K PARA R 
                   
                   //INICIO DE RANKINE PARA K
               case 8:
                    do
                   {
                      System.out.println("1. Intrada dos graus Celsius");
                      System.out.println("2. Voltar ao menu  principal"); 
                      d=a((byte)1, (byte)2);
                      switch(d)
                      {
                          case 1:
                              System.out.println("Introduza os graus que voce pretende converter:");
                              float r= Float.parseFloat(x.readLine());
                              float k = (float) (r/1.8);
                              System.out.println("A conversao de graus Rankine para kelvin  e':" +k);
                              break;
                      }
                   }while(d!=2);   
                   break;
                //FIM DE R PARA K    
               
           }
           
         }while(d!=9);
   }
    public static void main(String args []) throws IOException
    {
        c();
        System.out.println("Foi um prazer ajudar volte sempre");
    }
}
