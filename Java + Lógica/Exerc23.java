package aula01;

import java.util.Scanner;

public class Exerc23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		short numLados;
		float base, altura;
		
		System.out.print("Digite o n�mero de lados do pol�gono regular: ");
		numLados = input.nextShort();
		
		if (numLados == 3) {
			System.out.print("Digite o valor da base: ");
			base = input.nextFloat();
			
			System.out.print("Digite o valor da altura: ");
			altura = input.nextFloat();
			
			System.out.print("Este pol�gono � um tri�ngulo, e sua �rea � de " + (base * altura) / 2 + " cm�."); }
		
		else if (numLados == 4) {
			System.out.print("Digite o valor da base: ");
			base = input.nextFloat();
			
			System.out.print("Digite o valor da altura: ");
			altura = input.nextFloat();
			
			System.out.print("Este pol�gono � um quadrado, e sua �rea � de " + (base * altura) + " cm�.");
		}
		
		else if (numLados == 5) {
			System.out.print("Este pol�gono � um pent�gono!");
		}
		
		else {
			System.out.print("N�mero de lados inv�lido, por favor insira 3, 4 ou 5.");
		}
		
		input.close();
	}
}