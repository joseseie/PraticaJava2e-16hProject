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
public class Livro {
    String livro;
    void vi(){
        System.out.println("O livro escolhedo e':" +getLivro());
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }
    
    
}
