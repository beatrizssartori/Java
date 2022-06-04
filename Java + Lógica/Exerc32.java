/* Desenvolva um programa que dada a idade de uma pessoa, determine sua condi��o de eleitor conforme a tabela:
 * Menor que 16 anos - N�o pode votar; 
 * Maior ou igual a 16 e menor que 18 anos ou maior ou igual a 65 anos - Facultativo;
 * Entre 18 e 64 anos - Obrigat�rio. */

package aula01;

import java.util.Scanner;

public class Exerc32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		short idade;
		
		System.out.print("Digite sua idade: ");
		idade =  input.nextShort();
		
		if (idade < 16) {
			System.out.print("Sua condi��o de eleitor �: 'N�o pode votar'."); }

		else if (idade >= 16 && idade < 18 || idade >= 65) {
			System.out.print("Sua condi��o de eleitor �: 'Voto facultativo'."); }
		
		else {
			System.out.print("Sua condi��o de eleitor �: 'Voto obrigat�rio'."); }
		
		input.close();
	}
}