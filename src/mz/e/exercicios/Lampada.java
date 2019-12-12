/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mz.e.exercicios;

import jdk.nashorn.internal.ir.WhileNode;

/**
 * Crie uma classe Lâmpada cujos atributos são: cor, estado, tipo, voltagem, grau
 * de luminosidade (de 0 a 100)
 */
public class Lampada {
    private String cor;
    private String estado;
    private String tipo;
    private String voltagem;
    private int luminosidade;

    public Lampada() {
    }

    public Lampada(String cor, String estado, String tipo, String voltagem, int luminosidade) {
        this.cor = cor;
        this.estado = estado;
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.luminosidade = luminosidade;
    }

    public int getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(int luminosidade) {
        this.luminosidade = luminosidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return "Lampada{" + "cor=" + cor + ", estado=" + estado + ", tipo=" + tipo + ", voltagem=" + voltagem + ", luminosidade=" + luminosidade + '}';
    }
    public void ligar(){
        System.out.println("A lampada esta ligada!");        
    }
    public void desligar(){
        System.out.println("A lampada esta desligada");
                
    }
    public void apagada(){
        System.out.println("Luz desligado");
           }
 public void acender(){
        System.out.println("Luz Ligado");
           }

}
