// Desenvolva um programa que dado um n�mero, imprima uma das mensagens: � m�ltiplo de 3 ou n�o � m�ltiplo de 3. 

package aula01;

import java.util.Scanner;

public class Exerc29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int num; 
		
		System.out.print("Digite o n�mero: ");
		num = input.nextInt();
		
		if (num % 3 == 0) {
			System.out.print("O n�mero " + num + " � m�ltiplo de 3.");
		}
		
		else {
			System.out.print("O n�mero " + num + " n�o � m�ltiplo de 3.");
		}
		
		input.close();
	}
}