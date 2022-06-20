/* Fa�a um programa que receba o sal�rio bruto de um funcion�rio e, usando a tabela a seguir, calcule e mostre o valor a receber. 
 * Sabe-se que este � composto pelo sal�rio bruto acrescido de gratifica��o e descontado o imposto de 7% sobre o sal�rio.
 * Sal�rio at� 350 reais - 100 gratifica��o, sal�rio de 351 a 600 - gratifica��o 75, sal�rio de 601 a 900 - gratifica��o 50, acima de 901 - gratifica��o de 35. */

package aula01;

import java.util.Scanner;

public class Exerc15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double salarioBruto, salarioFinal, gratificacao, salarioComDesconto, desconto;
		
		System.out.print("Digite o sal�rio bruto: ");
		salarioBruto = input.nextDouble();
		
		if (salarioBruto <= 350) {
			gratificacao = 100; }
		
		else if (salarioBruto <= 600) {
			gratificacao = 75; }
		
		else if (salarioBruto <= 900) {
			gratificacao = 50; }
		
		else {
			gratificacao = 35; }
		
		desconto = salarioBruto * 0.07;
		salarioComDesconto = salarioBruto - desconto;
		salarioFinal = salarioComDesconto + gratificacao;
		
		System.out.println("Sal�rio a receber: " + salarioFinal + " reais.");
		
		input.close();
	}
}