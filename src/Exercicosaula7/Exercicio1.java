/*
    O sistema de admissão à UEM da maior parte dos cursos de engenharias é
    composto por dois exames, Matemática e Física. Supondo que o primeiro 
    exame tem peso 70%, e o segundo tem peso 30%. Faça um porgrama para 
    calcular a média final de 10 alunos nestas disciplinas. 
 */
package Exercicosaula7;

import java.io.*;

public class Exercicio1 {
    public static void main(String args []) throws IOException      
            
    {
      BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
      
      int w;
      System.out.println("Introduza o numero de alunos:");
      w= Integer.parseInt(x.readLine());
      
      float [] tam = new float[w];
      float [] notaMatematica= new float[w];
      float [] notaFisica= new float[w];
      float [] mediaM= new float[w];
      float [] mediaF = new float[w];
      float [] mediatotal= new float [w];
      
      for(int i=0; i<tam.length; i++)
      {
          System.out.println("Introduza a nota do" +(i+1)+ "* aluno a matematica:");
          notaMatematica[i] = Integer.parseInt(x.readLine());
          mediaM[i] = (float)(notaMatematica[i]*0.7);
          System.out.println("A media do" +(i+1+ "* aluno em matematica e'" +mediaM[i]));
          
          System.out.println("Introduza a nota do" +(i+1)+ "* aluno a fisica:");
          notaFisica[i] = Integer.parseInt(x.readLine());
          mediaF[i] = (float)(notaFisica[i]*0.7);
          System.out.println("A media do" +(i+1+ "* aluno em matematica e'" +mediaF[i]));
          
          
          mediatotal[i]= mediaM[i] +mediaF[i];
          if(mediatotal[i]>14)
          {
              System.out.println("O ALUNO DESPENSOU ");
          }else if(mediatotal[i]<14){
              System.out.println("O ALUNO ESTA ADMITIDO PARA O EXAME");
          } else System.out.println("O ALUNO ESTA REPROVADO");
      }
    }
}
