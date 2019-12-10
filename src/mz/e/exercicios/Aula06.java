
package mz.e.exercicios;

import java.util.Scanner;

/**
 *
 * @author joseseie
 * @author Filipe Mangue
 * @author Aly Macome
 * @author Efraime Mutole
 * @author Adriano Uaeca
 * @author Valter Massango.
 * 
 */
public class Aula06 {
    
    //public static void main(String[] args)
            
    public static void main(String[] args) {
        
        // Exercícios. Atenção, depois de resolver todos os erros nesta classe. Execute a mesma para ver se está tudo a funcionar como deve ser.
        
        //01)
        for(int i =0; i < 10; i++){
             System.out.println(i);
        }
        
        // 02)
         for(int i =0; i< 10; i++) {
             int dar = i;
             System.out.println(dar);
        }
        
        // 03) 
        
        System.out.println("Por favor introduza um carater, x, y ou outro");
        Scanner holder = new Scanner(System.in);
        
        String caracter = holder.nextLine();
        
        String expression = caracter;
            
        switch(expression){
            case "x":
              // code block
              break;
            case "y":
              // code block
              break;
            default:
              // code block
               break;
        }
        
       //04)
              System.out.println("Por favor introduza um numero inteiro, 1, 2 ou outro");
        Scanner holder2 = new Scanner(System.in);
        
        int numero = holder2.nextInt();
        
        int choice = numero;
            
       
       switch(choice){
             case 1:
             //Java code
             break;
             case 2:
             //Java code
             break;
             default:
             //Java code
             break;
        }
        
        // 05)
        if (20 > 18) {
           System.out.println("20 is greater than 18");
        }
        
        // 06)
        int x = 20;
        int y = 18;
        if (x > y) {
          System.out.println("x is greater than y");
        }
        
        // 07) 
        
        int a = 20;
        int b = 10;
        
        if (a > b) {
            System.out.println("a e maior que b");
        } else {
            System.out.println("a nao e maior que b");
        }
        
        // 08)
        int time = 22;
        if (time < 10) {
          System.out.println("Good morning.");
        } else if (time < 20) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }
        // Outputs "Good evening."
        
        // 09)
        int i = 0;
        while(i < 5) {
          System.out.println(i);
          i++;
        }
        int j = 10;
        while(j > 5) {
          System.out.println(i);
          j--;
        }
        
        int k = 0;
        while (k < 2) {
            //code block to be executed
            System.out.println("Olá Mundo!!");  
            k++;
        }
        
        
        // 10)
        int l = 0;
        do {
            System.err.println("Cuidado o computador vai estragar!!!");
            l++;
        }
        while (l < 3);
        
        // 11) Coloque o que falta
        for(i =0; i < 6; i++) {
            System.out.println(i); 
        }
        
        // 12) Indique a condição de paragem
        for (int m = 0; m < 10;m++) {
            if (m == 5) {   

                System.out.println("A condicao de paragem e: m = 10");; //parar o loop
            }
            System.out.println(i);
          }
        
        // 13) 
        System.out.println("" + (0+10));
        System.out.println("" + (10-10));
        System.out.println("" + (4*50));
        System.out.println("" + (30/11));
        System.out.println("Eu tenho" + 15+ " anos");
        System.out.println("" + (30*3));
        System.out.println ("" + (310 * 121));
        System.out.println (""+ (3/ 112));
    }
    
}
