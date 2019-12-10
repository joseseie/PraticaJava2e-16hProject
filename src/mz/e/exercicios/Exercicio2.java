/*
 2.	Faça um programa que imprima a frase: "Seja bem-vindo ao meu programa!", Em seguida, imprima 
        uma linha em branco e na sequência, imprima as frases e o resultado da expressões matemáticas.
        “O produto de 8 por 90 é igual a:”
        “O quociente de 90 por 30 é igual a:”
        “O quadrado de 9 é: “
    Cada frase e seu resultado devem estar na mesma linha.
    
 */
package mz.e.exercicios;
import java.lang.Math;


/**
 *
 * @author Mutole
 * @author Filipe Mangue
 * @author José Seie
 * @author Aly Macome
 * @author Adriano Uaeca
 * @author Valter Massango
 * 
 */
public class Exercicio2 {
    
    public static void main(String args [])
    {
        //DECLARACOES DAS VARIAVEIS
        byte n1= 8, n2=90, n4=9;
        int produto;
        produto= n1*n2; //Por melhorar
        
        byte n3= 30;
        float quo;
        quo= n2/n3;//Por melhorar
        
        
        
        
       System.out.println("Seja bem vindo ao meu programa");
        
       System.out.println("O produto do numero 8 por 90 e':" +produto);
       
       System.out.println("O quociente do numero 90 por 30 e':" +quo);
       
       System.out.println("O quadrado do numero 9 e':" +Math.pow(n4,2));
       
       // TPC: Calcular o quadrado usando a classe Math de java.
        
        
    }
    
}
