// Escreva um programa que entre com um n�mero e o imprima caso seja maior do que 20. 

package aula01;

import java.util.Scanner;

public class Exerc3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um n�mero:");
		x = input.nextInt();
		
		if (x > 20) {
			System.out.print("o n�mero " + x + " � maior do que 20");
		}
		
		else {
			System.out.print("o n�mero " + x + " � menor do que 20");
		}

		input.close();
	}
}