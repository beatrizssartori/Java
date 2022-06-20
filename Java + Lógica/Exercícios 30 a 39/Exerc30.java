/* A StackX abriu uma linha de cr�dito para os alunos. O valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto. 
 * Fazer um programa que permita entrar com o sal�rio bruto, o valor do empr�stimo e o n�mero de parcelas e informar o valor da parcela 
 * e se o empr�stimo pode ou n�o ser concedido. 
 * Caso o empr�stimo n�o possa ser concedido, informar ainda o valor m�ximo da presta��o. */

package aula01;

import java.util.Scanner;

public class Exerc30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		double salarioBruto, emprestimo, valorParcela;
		int numParcelas;
		
		System.out.print("Informe o valor do sal�rio bruto: ");
		salarioBruto = input.nextDouble();
		
		System.out.print("Qual seria o empr�stimo necess�rio para voc�? ");
		emprestimo = input.nextDouble();
		
		System.out.print("Em quantas parcelas voc� deseja pagar? ");
		numParcelas = input.nextInt();
		
		valorParcela = (emprestimo + emprestimo * 0.05) / numParcelas;
		
		if (valorParcela <= 0.3 * salarioBruto) {
			System.out.print("O empr�stimo poder� ser concedido, e o valor de cada parcela ser� de: " + valorParcela + " reais.");
		}
		
		else {
			System.out.print("O empr�stimo n�o poder� ser concedido, pois o valor m�x. de sua presta��o � de " + 0.3 * salarioBruto + " reais.");
		}
		
		input.close();
	}
}