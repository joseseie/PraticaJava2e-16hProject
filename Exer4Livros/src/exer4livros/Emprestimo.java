/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer4livros;

/**
 *
 * @author Mutole
 */
public class Emprestimo {
    String emprestar;
    void vi(){
        System.out.println("A pessoa foi emprestado:" +getEmprestar());
    }
     public String getEmprestar(){
         return emprestar;
     }
     
     public void setEmprestar(String emprestar){
         this.emprestar= emprestar;
     }
    
}
