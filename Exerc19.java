// Escreva um programa para ler 2 valores (considere que n�o ser�o informados valores iguais) e escrever o maior deles.

package aula01;

import java.util.Scanner;

public class Exerc19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		short a, b;
		
		System.out.print("Digite o primeiro valor: ");
		a = input.nextShort();
		
		System.out.print("Digite o segundo valor: ");
		b = input.nextShort();
		
		if (a > b) {
			System.out.println("O maior �: " + a); }
		
		if (a < b) {
			System.out.println("O maior �: " + b); }
		
		else {
			System.out.println("Os valores s�o iguais!"); }
		
		input.close();
	}
}