/* As ma��s custam R$ 0,30 cada se forem compradas menos de uma d�zia e R$ 0,25 se forem compradas pelo menos doze. 
 * Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o custo total da compra. */

package aula01;

import java.util.Scanner;

public class Exerc8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		short quantMacas;
		double custo;
		
		System.out.print("Quantas ma��s voc� deseja comprar? ");
		quantMacas = input.nextShort();
		
		if (quantMacas < 12 ) {
			custo = quantMacas * 0.30;
		}
		
		else {
			custo = quantMacas * 0.25; 
		}
		
		System.out.print("Custo total de compra para " + quantMacas + " ma��s: " + custo + " reais.");
		
		input.close();
	}
}