// Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usu�rio n�o informar� valores iguais.

package aula01;

import java.util.Scanner;

public class Exerc26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Digite o primeiro valor: ");
		a = input.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = input.nextInt();
		System.out.print("Digite o terceiro valor: ");
		c = input.nextInt();
		
		if (a > b && a > c) {
			System.out.print("O maior valor �: " + a);
		}
		
		else if (b > a && b > c) {
			System.out.print("O maior valor �: " + b);
		}
		
		else {
			System.out.print("O maior valor �: " + c);
		}
		
		input.close();
	}
}