// Elaborar um programa que efetue a apresenta��o do valor da convers�o em real (R$) de um valor lido em d�lar (US$). 
// O algoritmo dever� solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�veis com o usu�rio.

package aula01;

import java.util.Scanner;

public class Exerc6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double real;
		double dolar;
		double cotacao;
		
		 System.out.print("Digite a quantidade em reais: ");    
		 real = input.nextDouble();
		 
		 System.out.print("Digite a cota��o do dolar: ");    
		 cotacao = input.nextDouble();

		 dolar = real / cotacao;
		 
		 System.out.printf("Voc� possui %.2f d�lares", dolar);
		 
		 input.close();
	}
}
