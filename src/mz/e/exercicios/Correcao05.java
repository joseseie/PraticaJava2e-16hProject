
package mz.e.exercicios;

import java.util.Arrays;

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
public class Correcao05 {
    
    /*
        Criar dois arrays A e B cada um com 10 elementos inteiros. 
        Construir um array C, onde cada elemento de C é a soma dos respectivos 
        elementos em A e B, ou seja:
        
        C[i] = A[i] + B[i].
    */
    public static void main(String[] args) {
        
        // # Algoritmo:
        //1. Criar dois arrays A e B e inicializar com 10 elementos inteiros
        //2. Construir o array C.
        //3. Somar os valores de cada posicao de A e B e guardar no C.
        
        int[] A = {2, 1, 8, 3, 8, 12, 10, 2, 7, 9};
        int[] B = {3, 12, 86, 13, 28, 2, 0, 12, 47, 90};
        
        int[] C = new int[A.length];
        
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }
        
        System.out.println("Array C: " + Arrays.toString(C));
        
    }
    
}
