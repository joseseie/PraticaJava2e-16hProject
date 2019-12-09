/*

	Informar um saldo e imprimir o saldo com o aumento de 1%.
 */
package mz.e.correcao.a5;

import java.io.*;

public class Exercicio13 {
  public static void main(String args []) throws IOException
  {
      BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Introduza o saldo:");
      float saldo = Float.parseFloat(x.readLine());
      
      float saldoaumento= (float) (saldo+(saldo*0.01)/100); //Melhorar, separar declaracao de variaveis das operacoes
       System.out.println("O seu saldo era:" +saldo+ "Com aumento ele passa a ser de:" +saldoaumento);
      
  }
}
