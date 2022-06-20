/* Escreva um programa para ler o n�mero de lados de um pol�gono regular e a medida do lado (em cm).
 * Calcular e imprimir o seguinte:
 * Se o n�mero de lados for igual a 3 escrever TRI�NGULO e o valor da �rea.
 * Se o n�mero de lados for igual a 4 escrever QUADRADO e o valor da sua �rea.
 * Se o n�mero de lados for igual a 5 escrever PENT�GONO. */

package aula01;

import java.util.Scanner;

public class Exerc24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sexo;
		double altura, pesoIdeal = 0;
		
		System.out.print("Digite o sexo (1 - feminino, 2 - masculino): ");
		sexo = input.nextInt();
		
		System.out.print("Digite a altura: ");
		altura = input.nextDouble();
		
		if (sexo == 1) {
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.printf("O peso ideal para esta altura e sexo � de %.2f kg.", pesoIdeal);
		}
		
		else if (sexo == 2) {
			pesoIdeal = (72.7 * altura) - 58;
			System.out.printf("O peso ideal para esta altura e sexo � de %.2f kg.", pesoIdeal);
		}
		
		else {
			System.out.print("Sexo inv�lido, por favor insira 1 ou 2.");
		}
		
		input.close();
	}
}