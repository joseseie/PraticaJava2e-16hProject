/*
 
1.	Crie um programa que calcule a média de um aluno para a disciplina de programação. 
        O aluno deve informar seu nome e as três notas da matéria.
    
 */
package mz.e.exercicios;

import java.io.*;

public class Exercicio11 {
   
    public static void main(String args []) throws IOException
    {
      BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("MEDIA DA DISCIPLINA DE PROGRAMACAO");
       
       System.out.println("Introduza o nome do aluno:");
       String no = x.readLine();
       
       System.out.println("Introduza a primeira nota:");
       float nt1= Float.parseFloat(x.readLine());
       
       System.out.println("Introduza a segundo nota:");
       float nt2= Float.parseFloat(x.readLine());
       
       System.out.println("Introduza a terceira nota:");
       float nt3= Float.parseFloat(x.readLine());
       
       float m= (nt1+nt2+nt3)/3; //Melhorar, separar declaracao de variaveis das operacoes
       
       System.out.println("A media do aluno:" +no+ "e':" +m);
       
    }

   
}
