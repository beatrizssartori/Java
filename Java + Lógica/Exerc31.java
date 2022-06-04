// Desenvolva um programa que dados tr�s n�meros inteiros, informe quantos s�o negativos.

package aula01;

import java.util.Scanner;

public class Exerc31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = input.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = input.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		num3 = input.nextInt();
		
		// Somente um n�mero negativo.
		
		if (num1 < 0 && num2 > 0 && num3 > 0) {
			System.out.printf("O n�mero %d � negativo.", num1); }
		else if (num1 > 0 && num2 < 0 && num3 > 0) {
			System.out.printf("O n�mero %d � negativo.", num2); }
		else if (num1 > 0 && num2 > 0 && num3 < 0) {
			System.out.printf("O n�mero %d � negativo.", num3); }
		
		// Dois n�meros negativos.
		
		else if (num1 < 0 && num2 < 0 && num3 > 0) {
			System.out.printf("Os n�meros %d e %d s�o negativos.", num1, num2); }
		else if (num1 < 0 && num2 > 0 && num3 < 0) {
			System.out.printf("Os n�meros %d e %d s�o negativos.", num1, num3); }
		else if (num1 > 0 && num2 < 0 && num3 < 0) {
			System.out.printf("Os n�meros %d e %d s�o negativos.", num2, num3); }
		
		// Todos negativos.
		
		else if (num1 < 0 && num2 < 0 && num3 < 0) {
			System.out.printf("Todos os n�meros s�o negativos."); }
		
		// Nenhum.
		
		else {
			System.out.print("N�o h� n�meros negativos."); }
		
		input.close();
	}
}