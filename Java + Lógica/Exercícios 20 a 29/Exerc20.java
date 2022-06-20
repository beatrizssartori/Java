/* Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano 
 * (não é necessário considerar o mês em que ela nasceu). */

package aula01;

import java.util.Scanner;

public class Exerc20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		short anoNascimento, esteAno;
		
		System.out.print("Em que ano estamos? ");
		esteAno = input.nextShort();
		
		System.out.print("Digite seu ano de nascimento: ");
		anoNascimento = input.nextShort();
		
		if (esteAno - anoNascimento >= 16) {
			System.out.print("Você poderá votar! :)"); }
		
		else {
			System.out.print("Você não poderá votar! :("); }
		
		input.close();
	}
}