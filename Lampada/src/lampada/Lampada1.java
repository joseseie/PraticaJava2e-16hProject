
package lampada;

/**
 *
 * @author Mutole
 */
public class Lampada1 {
    String cor;
    String tipo1;
    String tipo2;
    float voltagem1;
    float voltagem2;
    float luminosidade;
    boolean estado;
    
    void visualizacoes(){
        System.out.println("A cor da lampada e'" +getCor());
        System.out.println("A lampada 1 e' do tipo" +getTipo1());
         System.out.println("A lampada 2 e' do tipo" +getTipo2());
        System.out.println("A lampada 1 tem uma voltagem de" +getVoltagem1());
         System.out.println("A lampada 2 tem uma voltagem de" +getVoltagem2());
        System.out.println("A lampada tem uma luminosidade de " +getLuminosidade()+ "wts");
        
    }
    
    void ligar(){
        if(estado==true){
            System.out.println("A lampada esta ligada");
        } else System.out.println("A lampdad esta desligada");
    }
    
    void fundide(){
        if(luminosidade==100){
            System.out.println("A lampada eesta fundida por isso nao pode ser ligada");
        }else System.out.println("A lampada nao esta fundida por isso pode ser ligada");
    }
    void tipo(String tipo1, String tipo2){
        if(this.tipo1==this.tipo2)
        {
            System.out.println("As lampadas sao do mesmo tipo");
        } else System.out.println("AS lampadas nao sao do mesmo tipo");
    }
    
    void voltagem(){
        if(this.voltagem1==this.voltagem2){
            System.out.println("AS dua lampadas tem a mesma voltagem");
        }else System.out.println("AS lampadas nao tem a mesma voltagem");
    }
    /*
  1. Crie uma classe Lâmpada cujos atributos são: cor, estado, tipo, voltagem, grau de luminosidade (de 0 a 100)
c) Adicione o método toString 
g) Adicione um método para verificar se 2 lâmpadas têm a mesma voltagem 
h) Adicione um método que verifica se 2 lâmpadas são iguais 
i) Adicione um método que aumente ou reduz o grau de luminosidade (de 5 em  
j) Quando uma lâmpada ultrapassa o grau de luminosidade máximo (100) 
funde (isto é, não pode ligar ou desligar mais). 
1.1 Crie uma classe para testar a classe acima. 
 */

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    
    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo1) {
        this.tipo1 = tipo2;
    }
    
    public float getVoltagem1() {
        return voltagem1;
    }

    public void setVoltagem1(float voltagem1) {
        this.voltagem1 = voltagem1;
    }
    
     public float getVoltagem2() {
        return voltagem2;
    }

    public void setVoltagem2(float voltagem2) {
        this.voltagem2 = voltagem2;
    }
    
    public float getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(float luminosidade) {
        this.luminosidade = luminosidade;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
