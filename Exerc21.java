/* Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio. A senha v�lida � o n�mero 1234. 
 * Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja v�lida e  ACESSO NEGADO caso a senha seja inv�lida. */

package aula01;

import java.util.Scanner;

public class Exerc21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		short senha;
		
		System.out.print("Digite a senha de acesso: ");
		senha = input.nextShort();
		
		if (senha == 1234) {
			System.out.print("Acesso permitido!"); }
		
		else {
			System.out.print("Acesso negado!");
		}
		
		input.close();
	}
}