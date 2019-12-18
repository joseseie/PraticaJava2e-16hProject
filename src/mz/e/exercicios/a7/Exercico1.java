/*
 O sistema de admissão à UEM da maior parte dos cursos de engenharias é composto por dois exames, Matemática e Física. 
Supondo que o primeiro exame tem peso 70%, e o segundo tem peso 30%.
Faça um porgrama para calcular a média final de 10 alunos nestas disciplinas. 
 
 */
package mz.e.exercicios.a7;

import java.io.*;
public class Exercico1 {
    
    public static void main(String args []) throws IOException
    {
        BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
      
        float [] mate= new float[10];
        float [] fisica= new float[10];
        float [] media1= new float [mate.length];
       float [] media2= new float [fisica.length];
        
        for(int i=0; i<mate.length; i++)
        {
            System.out.println("Introduza a nota do:" +(i+1)+ "* aluno a matematica");
            mate[i]= Float.parseFloat(x.readLine());
            media1[i] = (float)(mate[i]*0.7);
            System.out.println("A media do aluno:" +(i+1)+ "* a matematica e' de':" +media1[i]);
            
             System.out.println("Introduza a nota do:" +(i+1)+ "* aluno a fisica");
             fisica[i]= Float.parseFloat(x.readLine());
             media2[i] = (float) (fisica[i]*0.3);
             System.out.println("A media do aluno:" +(i+1)+ "* a fisica e' de:" +media2[i]);
        }
        
        
        
        
        
        
        
        
        
        
        
        /*int nalunos;
        System.out.println("Introduza o numero de alunos:");
        nalunos= Integer.parseInt(x.readLine());
        
        float [] notalunos= new float[nalunos];
       // System.out.println("O numero de alunos e':" +alunos.length);
        for(int i=0; i<nalunos; i++)
        {
            System.out.println("Introduza a nota do"      +(i+1)+     "* aluno");
            notalunos [i]= Float.parseFloat(x.readLine());
        }
        for(int i=0; i<nalunos; i++)
        {
            System.out.println("AS notas dos alunos sao:" +notalunos[i]);
        }*/
    }
    
}
