
package mz.e.exercicios;

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
    
    
            
    public static void main(String[] args) {
        
        // Exercícios. Atenção, depois de resolver todos os erros nesta classe. Execute a mesma para ver se está tudo a funcionar como deve ser.
        
        //01)
        for (int i =0; i > 10; i++) {
          
        }
        
        // 02)
        for (int i =0; i< 10; i++) {
            
             int dar = 0;
        }
        
        // 03) 
        char sexo = 'z';
        switch(sexo) {
            case 'x':
                System.out.println("Mascolino");
              
              break;
            case 'y':
              
                System.out.println("Femenino");
              break;
            default:
              
                System.out.println("outro");
        }
        
       //04)
       int day = 6;
       switch (day)
        {
             case 6:
             
                 System.out.println("Meu aniversario");
             ;
             case 7:
            
                 System.out.println("Ontei foi meu aniversario");
             ;
             default:
             
                 System.out.println("Ainda nao e meu aniversario");
             ;
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
        if (x < y) {
            
            System.out.println("y e maior que x");
        } else {
            
            System.out.println("x e maior que y");
        }
        
        // 08)
        int time = 22;
        if (time < 10) {
          System.out.println("Good morning.");
        } else if (time < 20) {
          System.out.println("Good day.");
        } else {
          System.out.print("Good evening.");
        }
        // Outputs "Good evening."
        
        // 09)
        int i = 0;
        while(i < 5) {
          System.out.println(i);
          i++;
        }
        int j = 0;
        while (j > 5) {
          System.out.println(i);
          i--;
        }
        
        int a = 2;
        int b = 4;
        while (a < b ) {
            //code block to be executed
            System.out.println("Olá Mundo!!"); 
            break;
        }
        
        // 10)
        do {
            System.err.println("Cuidado o computador vai estragar!!!");
            break;
        }
        while (true);
            
        
        // 11) Coloque o que falta
        if (i < 6) {
            System.out.println(i); 

          
        }
        
        // 12) Indique a condição de paragem
        for (int k = 0; k < 10; k++) {
            if (k == 5) {   

                break; //parar o loop
            }
            System.out.println(k);
          }
        
        // 13) 
        System.out.println ("");
        System.out.println ("");
        System.out.println ("" );
        System.out.println ("" );
        System.out.println ("Eu tenho, 15 anos");
        System.out.println ("");
        System.out.println ("");
        System.out.println ("");
    }
    
}
