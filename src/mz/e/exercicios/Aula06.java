
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
            
    public static void main(String[] args) 
    {
        
        // Exercícios. Atenção, depois de resolver todos os erros nesta classe. Execute a mesma para ver se está tudo a funcionar como deve ser.
        
        //01)
        for (int i =0; i > 10; i++) 
        {
             i = 0;
        }
        
        // 02)
        for (int i =0; i< 10; i++) 
        {
             i = 0;
             int dar = 0;
        }
       
        // 03)
        int expression=3;
        switch(expression) 
        {
            case 1:
              // code block
              break;
            case 2:
              // code block
              break;
            default:
              // code block
        }
        
       //04)
       int variable=4;
       switch (variable)
           
        {
             case 1:
             //Java code
             ;
             case 2:
             //Java code
             ;
             default:
             //Java code
             ;
        }
        
        // 05)
        if (20 > 18) 
        {
           System.out.println("20 is greater than 18");
        }
        
        // 06)
        int x = 20;
        int y = 18;
        if (x > y) 
        {
          System.out.println(x+" is greater than"+ y);
        }
        
        // 07) 
        boolean a=true; 
        if (a)
        {
            //block of code to be executed if the condition is true
        } 
        else
        {
            //block of code to be executed if the condition is false
        }
        
        // 08)
        int time = 22;
        if (time < 10)
        {
          System.out.println("Good morning.");
        } 
        else if (time < 20) 
        {
          System.out.println("Good day.");
        } 
        else 
        {
          System.out.print("Good evening.");
        }
        // Outputs "Good evening."
        
        // 09)
        int i = 0;
        while (i < 5) 
        {
          System.out.println(i);
          i++;
        }
        int j = 0;
        while (j > 5) 
        {
          System.out.println(i);
          --j;
        }
        
        while(a) 
        {
            //code block to be executed
            System.out.println("Olá Mundo!!");     
        }
        
        // 10)
        do 
        {
            if(true)
            {
            System.err.println("Cuidado o computador vai estragar!!!");
            break;
            }
        }
        while(true);  
        
         //11) Coloque o que falta
            
            if (i < 6) 
            {
                System.out.println(i); 
                
            }
              
       
        // 12) Indique a condição de paragem
        
        for (int k=0; k<10; k++) 
        {
            if (k == 5) 
            {   
                break;
                //parar o loop
            }
            System.out.println(i);
          }
        
        // 13) 
        System.out.println (" 10 +" +0+" = "+10 );
       /* System.out.println ("" + 10 -= 10);
        System.out.println ("" + 4 *== 50);
        System.out.println ("" + 30 /= 11);
        System.out.println ("Eu tenho 15 anos");
        System.out.println ("" + 30 x &= 3);
        System.out.println ("" + 310 |*= 121);
        System.out.println ("", 3 |= 112);
*/
    }
    
}
