/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.e.exercicios;
import java.util.Arrays;

/**
 *
 * @author Aly Macome
 */
public class Exerc18a7 {
    
    /*
    18.	Criar um array A com 15 elementos inteiros. Construir um array B de mesmo 
        tipo e tamanho, sendo que cada elemento do array B deverá ser o quadrado do
        respectivo elemento de A, ou seja: B[i] = A[i] * A[I].
    */
    public static void main(String[] args) {
        
        int A[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        
        int B[] = new int[A.length];
        
        for (int i = 0; i < A.length; i++) {
            
            B[i] = A[i]*A[i];
            
        }
        
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
 
          
}
