/*
 1. Crie uma classe Lâmpada cujos atributos são: cor, estado, tipo, voltagem, grau de luminosidade (de 0 a 100)
a) Adicione os construtores necessários 
b) Adicione os getters e setters 
c) Adicione o método toString 
d) Adicione métodos para ligar, desligar a luz 
e) Adicione um método que mostre a mensagem “Luz Ligada” ou “Luz Desligada”. 
f) Adicione um método que verifica se a lâmpada esta fundida 
g) Adicione um método para verificar se 2 lâmpadas têm a mesma voltagem 
h) Adicione um método que verifica se 2 lâmpadas são iguais 
i) Adicione um método que aumente ou reduz o grau de luminosidade (de 5 em  
j) Quando uma lâmpada ultrapassa o grau de luminosidade máximo (100) 
funde (isto é, não pode ligar ou desligar mais). 
1.1 Crie uma classe para testar a classe acima. 
 
 */
package lampada;
import java.io.*;
/**
 *
 * @author Mutole
 */
public class Lampada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        Lampada1 lam1= new Lampada1();
        lam1.cor= "Azul";
        lam1.estado= true;
        lam1.luminosidade= 50;
        lam1.tipo1= "grande";
        lam1.tipo2= "pequeno";
        lam1.voltagem1= 60;
        lam1.voltagem2=6;
        lam1.visualizacoes();
        lam1.fundide();
        lam1.ligar();
        lam1.tipo(null, null);
        lam1.voltagem();
        
        
       /* Lampada1 lam2= new Lampada1();
        lam2.cor= "Azul";
        lam2.estado= true;
        lam2.luminosidade= 50;
        lam2.tipo= "Pequeno";
        lam2.voltagem= 60;
        lam2.visualizacoes();
        */
        
        
        
      
    }
    
}
