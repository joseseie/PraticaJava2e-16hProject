/*
  3.	Escreva um pequeno programa que peça o seu nome, sua ocupação e ano de nascimento. Em seguida, 
        imprima na tela as 2 informações a seguir:
                Eu chamo me xxxxx de idade xxxxx anos de idade, estudante de xxxxx.
 */
package mz.e.correcao.a5;

import java.io.*;

/**
 *
 * @author Mutole
 */
public class Exercicio3 {
    
    public static void main(String args []) throws IOException
    {
        BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
        
        String nome;
        String ocupacao;
        int ano, idade;
        
         System.out.println("Por favor escreva o seu nome:");
         nome= x.readLine();
         
         System.out.println("Qual e' a sua ocupacao?");
         ocupacao= x.readLine();
         
         System.out.println("Qual e' o seu ano de nascimento?");
         ano= Integer.parseInt(x.readLine());
         
         idade= 2019-ano;
         
         System.out.println("O nome do uutilizador e':" +nome);
         System.out.println("A ocupacao do utilizador e':" +ocupacao);
         System.out.println("A sua idade  e':" +idade);
         //Melhorar a impressao do texto segundo o que vem no exercicio, e deve imprimir a idade nao ano de nascimento.
         
         
         
         
    }
    
}
