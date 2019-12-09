
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
    
    //public static void main(String[] args)
            
    public static void main(String[] args) {
        
        // Exercícios. Atenção, depois de resolver todos os erros nesta classe. Execute a mesma para ver se está tudo a funcionar como deve ser.
        
        //01)
        for (int i =0; i > 10; i++) {
             //int i = 0
        }
        
        // 02)
        for (int i =0; i< 10; i++) {
             //int i = 0;
             int dar = 0;
        }
        
        // 03) 
        char expression = 'x';
        
        switch(expression) {
            case 'x':
               //code block;
              break;
            case 'y':
               //code block;
              break;
            default:
               //code block;
        }
        
       //04)
       
       String variable = "constant";
       
       switch (variable){
        
             case "constant":
             //Java code
             ;
             case "variavel":
             //Java code
             ;
             default:
             //Java code
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
        
        if (true) {
           // block of code to be executed if the condition is true;
           
        } else {
            //block of code to be executed if the condition is false;
           
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
        while (i < 5) {
          System.out.println(i);
          i++;
        }
        int j = 5;
        while (j > 5) {
          System.out.println(j);
          j--;
        }
        
        while (true) {
            //code block to be executed
            System.out.println("Olá Mundo!!"); 
            
            break;
        }
        
        // 10)
        do {
            System.out.println("Cuidado o computador vai estragar!!!");
        }
        while (true);
        
        // 11) Coloque o que falta
        int numero = 3;
        
        if (numero < 6) {
            
            System.out.println("bom preco"); 
              
        }
        
        // 12) Indique a condição de paragem
        for (int z = 0; z < 10; z++) {
            if (z == 5) {   

                 //parar o loop
            }
            System.out.println(z);
          }
        
        // 13) 
        System.out.println ("" + 0 += 10);
        System.out.println ("" + 10 -= 10);
        System.out.println ("" + 4 *== 50);
        System.out.println ("" + 30 /= 11);
        System.out.println ("Eu tenho", 15 anos);
        System.out.println ("" + 30 x &= 3);
        System.out.println ("" + 310 |*= 121);
        System.out.println ("", 3 |= 112);
    }
    
}
