// Fa�a um programa para calcular a �rea de um tri�ngulo e que n�o permita a entrada de dados inv�lidos, ou seja, medidas menores ou iguais a zero.

package aula01;

import java.util.Scanner;

public class Exerc48 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float base, altura;
		
		do {
			System.out.print("Informe a base do tri�ngulo: ");
			base = input.nextFloat();
			
			System.out.print("Informe a altura do tri�ngulo: ");
			altura = input.nextFloat();
			
			if (base <= 0 || altura <= 0) {
				System.out.print("\nEntrada inv�lida!\n");
			}
		} while (base <= 0 || altura <= 0);
		
		System.out.print("\n�rea do tri�ngulo: " + (base*altura)/2 + " cm�.");
		
		input.close();
	}
}