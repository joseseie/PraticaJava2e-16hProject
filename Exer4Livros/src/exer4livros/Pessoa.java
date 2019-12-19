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
public class Pessoa {
    String nome;
    void vi(){
        System.out.println("O nome da pessoa e':" +getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
