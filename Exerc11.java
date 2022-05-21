// Fa�a um programa que receba um n�mero inteiro entre 1 e 7 e informe o dia da semana correspondente (1 = domingo, 2 = segunda).

package aula01;

import java.util.Scanner;

public class Exerc11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int num;
		
		System.out.print("Digite o n�mero do dia da semana desejado: ");
		num = input.nextInt();
		
		switch (num) {
			case 1: 
				System.out.println("O dia � domingo!");
			break;
			
			case 2: 
				System.out.println("O dia � segunda-feira!");
			break;
		
			case 3: 
				System.out.println("O dia � ter�a-feira!");
			break;
			
			case 4: 
				System.out.println("O dia � quarta-feira!");
			break;
			
			case 5: 
				System.out.println("O dia � quinta-feira!");
			break;
			
			case 6: 
				System.out.println("O dia � sexta-feira!");
			break;
			
			case 7: 
				System.out.println("O dia � s�bado!");
			break;
		
			default:
				System.out.println("N�o existe um dia correspondente a este n�mero! Escolha de 1 a 7.");
		}
				
		input.close();
	}
}