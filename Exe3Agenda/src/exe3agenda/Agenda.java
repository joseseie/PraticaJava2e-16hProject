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
public class Agenda {
    Scanner y= new Scanner(System.in);
    int x;
    String agenda;
    void vi(){
       
              System.out.println("O numero de agendas a fazer e':" +getAgenda());
        
       
       
    }

    void agenda(){
        int i=0;
            System.out.println("Introduza a agenda da pessoa na posicao: " +(i+1));
            agenda= y.toString();
        
    }

    

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }
    
    
}
