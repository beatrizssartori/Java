/* Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poder� ou n�o votar este ano 
 * (n�o � necess�rio considerar o m�s em que ela nasceu). */

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
			System.out.print("Voc� poder� votar! :)"); }
		
		else {
			System.out.print("Voc� n�o poder� votar! :("); }
		
		input.close();
	}
}