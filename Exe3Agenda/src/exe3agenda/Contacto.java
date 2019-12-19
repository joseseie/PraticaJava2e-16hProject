/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3agenda;

import java.util.Scanner;

/**
 *
 * @author Mutole
 */
public class Contacto {
    Scanner y= new Scanner(System.in);
    int contacto;
    void vi(){
      System.out.println("O contactos da pessoa e':" +getContacto());  
    }
    void contactos(){
        System.out.println("Introduza os contactos");
        contacto= y.nextInt();
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }
    
    
    
}
