
package mz.e.exercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author joseseie
 * @author Filipe Mangue
 * @author Horcha Chambule
 * @author Valter Massango
 * @author Aly Macome
 * @author Efraime Mutola
 * 
 */
public class Correcao01 {
    
    /*
    1. O sistema de admissão à UEM da maior parte dos cursos de engenharias 
    é composto por dois exames, Matemática e Física. Supondo que o primeiro 
    exame tem peso 70%, e o segundo tem peso 30%. Faça um porgrama para 
    calcular a média final de 10 alunos nestas disciplinas.

    */
    public static void main(String[] args) {
        
        // # Algoritmo
        // 1. Media de cada aluno
        // 2. Media final de 10 alunos.
        
        double[] medias = new double[3];
        
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < medias.length; i++) {
            
            System.out.print("Nota de Matemática, para o aluno[" + i + "] : ");
            double notaMat = s.nextDouble();
            
            System.out.print("Nota de Fisica, para o aluno[" + i + "] : ");
            double notaFisica = s.nextDouble();
            
            System.out.println("");
            
            double media = notaMat * 0.7 + notaFisica * 0.3;
            medias[i] = media;
            
        }
        
        System.out.println("Medias: " + Arrays.toString(medias));
        
        
    }
    
}
