/* Fa�a um programa que receba o sal�rio de um funcion�rio chamado Carlos. Sabe-se que outro funcion�rio, Jo�o, tem sal�rio equivalente a um ter�o do sal�rio de Carlos. 
 * Carlos aplicar� seu sal�rio integralmente na caderneta de poupan�a, que rende 2% ao m�s, e Jo�o aplicar� seu sal�rio integralmente no fundo de renda fixa, que rende 5% ao m�s. 
 * O programa dever� calcular e mostrar a quantidade de meses necess�rios para que o valor pertencente a Jo�o iguale ou ultrapasse o valor pertencente a Carlos. */

package aula01;

import java.util.Scanner;

public class Exerc16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salarioCarlos, salarioJoao;
		short meses = 0;
		
		System.out.print("Digite o valor do sal�rio de Carlos: ");
		salarioCarlos = input.nextDouble();
		
		salarioJoao = salarioCarlos / 3;
		
		while (salarioJoao <= salarioCarlos) {
			salarioCarlos = salarioCarlos * 1.02;
			salarioJoao = salarioJoao * 1.05;
			meses++; }
		
		System.out.print("O valor de Jo�o se igualar� ao valor de Carlos em " + meses + " meses.");
		
		input.close();
	}
}