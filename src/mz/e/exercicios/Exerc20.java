/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.e.exercicios;
import java.util.Scanner;
/**
 *
 * @author Aly Macome
 */
public class Exerc20 {
    /*
    Faça um programa de consulta pela posição numérica da pessoa: leia nomes de pessoas,
    sendo a quantidade determinada pelo usuário. Logo após a entrada pergunte ao usuário
    o número do nome que ele gostaria de consultar. Após sua resposta, exiba o nome que 
    fica na posição informada.
    Chame atenção do usuário em caso de uma consulta inválida, ou seja, com números menores
    ou iguais a zero, ou maiores do que a quantidade cadastrada.

    */
    
    
    public static void main(String[] args) {
        int x ;
        int posicao;
        System.out.println("Digitr o tamanho: ");
        Scanner s =new Scanner(System.in);
        x = s.nextInt();
        
        String [] nome = new String[x];
        
        for (int i = 0; i < nome.length; i++) {
            
            System.out.println("digite o nome: ");
            nome[i] = s.next();
            
        }
        
        System.out.println("digite o numero da posicao pretendida: ");
        
        posicao = s.nextInt();
        
        if(posicao > x){
            
             System.out.println("posicao invalida: ");
        
        } 
        else {
            System.out.println("Nome: "+ nome[posicao]);
        }
         
        
        
       
            
        
    }
}
