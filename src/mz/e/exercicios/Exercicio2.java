/*
 2.	Faça um programa que imprima a frase: "Seja bem-vindo ao meu programa!", Em seguida, imprima 
        uma linha em branco e na sequência, imprima as frases e o resultado da expressões matemáticas.
        “O produto de 8 por 90 é igual a:”
        “O quociente de 90 por 30 é igual a:”
        “O quadrado de 9 é: “
    Cada frase e seu resultado devem estar na mesma linha.
    
 */
package mz.e.exercicios;

/**
 *
 * @author Mutole
 */
public class Exercicio2 {
    
    public static void main(String args [])
    {
        //DECLARACOES DAS VARIAVEIS
        byte n1= 8, n2=90;
        int produto= n1*n2;
        
        byte n3= 30;
        float quo= n2/n3;
        
        byte qua= 9*9;
        
       System.out.println("Seja bem vindo ao meu programa");
        
       System.out.println("O produto do numero 8 por 90 e':" +produto);
       
       System.out.println("O quociente do numero 90 por 30 e':" +quo);
       
       System.out.println("O quadrado do numero 9 e':" +qua);
       
        
        
    }
    
}
