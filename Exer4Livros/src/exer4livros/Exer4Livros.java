/*
4. Faça um programa para controle de empréstimo de livros,
 com as classes Empréstimo, Livro e Pessoa. 
 */
package exer4livros;

/**
 *
 * @author Mutole
 */
public class Exer4Livros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Pessoa p = new Pessoa();
        p.setNome("Efraime");
        p.vi();
        
        Emprestimo e= new Emprestimo();
        e.setEmprestar(" um livro");
        e.vi();
        
        Livro l= new Livro();
        l.setLivro("Matematica");
        l.vi();
        
      
    }
    
}
