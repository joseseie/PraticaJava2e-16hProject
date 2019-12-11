/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.e.exercicios;

/**
 *
 * @author Aly Macome
 */
public class Exerc3a7 {
    
    /*
    3.	Crie um array capaz de armazenar 50 números inteiros. Em seguida faça o seu
    preenchimento automático com os números de 101 a 150, ou seja, na posição número 
    0 ponha 101, na posição 1 ponha o número 102, e assim sucessivamente. Em seguida 
    exiba os valores deste vector

    
    */
    
    public static void main(String[] args) {
        
        int [] x = new int [50];
        int y = 101;
        
        for (int i = 0; i < x.length; i++) {
            x[i]=y;
            
            y++;
            
            System.out.println(x[i]);
        }
        
        
    }
    
}
