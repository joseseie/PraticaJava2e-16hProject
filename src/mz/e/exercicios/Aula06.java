
package mz.e.exercicios;

import java.io.*;

public class Aula06 {
    
            
    public static void main(String[] args) throws IOException{
        
        // Exercícios. Atenção, depois de resolver todos os erros nesta classe. Execute a mesma para ver se está tudo a funcionar como deve ser.
        BufferedReader l= new BufferedReader(new InputStreamReader(System.in));
        
        
        //01)
        for(int i =0; i< 10|| i> 10; i++) {
            System.out.println("O i ezecutado sai:" +i);
            break;
             //int i = 0;
        }
        
        // 02)
        for(int i =0; i< 10; i++) {
            System.out.println("O i ezecutado sai:" +i);
            break;
            // int i = 0;
             //innt dar = 0;
        } 
        
        // 03) 
        
        char expression;
        do
        {
            System.out.println("Que tipo de expressao deseja ezecutar? Expressao X ou Espressao Y");
            expression= l.readLine().charAt(0);
             if(expression!='x' && expression!='y')
         System.out.println("ERROR!");
        }while(expression!='x' && expression!='y');
        
          
        
        switch(expression) {
            case 'x':
                System.out.println("A expressao ezecutada foi:" +expression);
              // code block
              break;
                
            case 'y':
                System.out.println("A expressao ezecutada foi:" +expression);
              // code block
              break;
            default:
              // code block
        }
        
       //04)
        char resposta;
        do
        {
            System.out.println("Deseja fazer alguma coisa? ");
            resposta= l.readLine().charAt(0);
           if(resposta!='S' && resposta!='s' && resposta!='N' && resposta!='n')
               System.out.println("ERROR!");
        }while(resposta!='S' && resposta!='s' && resposta!='N' && resposta!='n');
        
       switch(resposta)
        {
             case 'S' | 's':
                 System.out.println("A resposta escolhida foi:" +resposta);
             //Java code
             break;
             case 'N' | 'n':
                 System.out.println("A resposta escolhida foi:" +resposta);
             //Java code
             break;
             default:
             //Java code
             ;
        }
        
        // 05)
        if(20 > 18) {
           System.out.println("20 is greater than 18");
        }
        
        // 06)
        int x = 20;
        int y = 18;
        if (x > y) {
          System.out.println("x is greater than y");
        }
        
        // 07)
        boolean canetaaberto= true;
        if(canetaaberto==true) {
            System.out.println("A caneta esta aberta por isso podemos utilizar para escrever");
            //block of code to be executed if the condition is true
        } else {
             System.out.println("A caneta nao esta aberta por isso nao podemos utilizar");
            //block of code to be executed if the condition is false
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
        while(j > 5) {
          System.out.println(i);
          i--;
        }
        boolean proaberto=true;
        while(proaberto==true) {
            //code block to be executed
            System.out.println("Olá Mundo!!"); 
            break;
        }
        
        // 10)
        boolean per=true;
        do {
            if(per!=true)
             System.err.println("Cuidado o computador vai estragar!!!");     
        }
        while(per!=true);
        
        // 11) Coloque o que falta
        for(byte k=0; i<6; k++){
            System.out.println(+k); 
        }
        // 12) Indique a condição de paragem
        for(int m = 0; m < 10; m++) {
            if (m == 5) {   
                System.out.println("A instrucao para por aqui:" +m);

               // ; //parar o loop
            }
            System.out.println(i);
          }
        
        // 13) 
       /* System.out.println ("" + 0 += 10);
        System.out.println ("" + 10 -= 10);
        System.out.println ("" + 4 *== 50);
        System.out.println ("" + 30 /= 11);
        System.out.println ("Eu tenho 15 anos");
        System.out.println ("" + 30 x &= 3);
        System.out.println ("" + 310 |*= 121);
        System.out.println ("", 3 |= 112);
               */
    }
    
}