/*
3. Faça um programa de agenda telefónica, com as classes Agenda e Contacto. 
 */
package exe3agenda;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Mutole
 */
public class Exe3Agenda {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner d= new Scanner(System.in);
        // TODO code application logic here
       Agenda a= new Agenda();
       a.setAgenda("compras");
       a.vi();
       
       Contacto c= new Contacto();
       c.contactos();
       c.vi();
    }
    
}
