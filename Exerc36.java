/* Depois da libera��o do governo para as mensalidades dos planos de sa�de, as pessoas come�aram a fazer pesquisas para descobrir um bom plano, n�o muito caro. 
 * Um vendedor de um plano de sa�de apresentou a tabela a seguir. 
 * At� 10 anos: R$ 30,00; Acima de 10 at� 29 anos: R$ 60,00; Acima de 29 at� 45 anos: R$ 120,00; Acima de 45 at� 59 anos: R$ 150,00; Acima de 59 at� 65 anos: R$ 250,00; Maior que 65 anos: R$ 400,00.
 */

package aula01;

import java.util.Scanner;

public class Exerc36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		short idade;
		
		System.out.print("Digite a idade: ");
		idade = input.nextShort();
		
		if (idade <= 10) {
			System.out.print("O valor a ser pago ser� de R$30,00."); }
		
		else if (idade <= 29) {
			System.out.print("O valor a ser pago ser� de R$60,00."); }
		
		else if (idade <= 45) {
			System.out.print("O valor a ser pago ser� de R$120,00."); }
		
		else if (idade <= 59) {
			System.out.print("O valor a ser pago ser� de R$150,00."); }
		
		else if (idade <= 65) {
			System.out.print("O valor a ser pago ser� de R$250,00"); }
		
		else {
			System.out.print("O valor a ser pago ser� de R$400,00"); }
	
		input.close();
	}
}