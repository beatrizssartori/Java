/* Fa�a um programa que leia um conjunto n�o determinado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. 
 * Finalize a entrada de dados com um valor negativo ou zero. */

package aula01;

import java.util.Scanner;
import java.lang.Math;

public class Exerc17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		double quadrado, cubo, raiz;
		
		System.out.print("Digite um n�mero maior do que 0: ");
		num = input.nextInt();
		
		quadrado = Math.pow(num, 2);
		cubo = Math.pow(num, 3);
		raiz = Math.sqrt(num);
		
			while (num > 0 && num < 10) {
				System.out.println ("O quadrado � " + quadrado);
				System.out.println ("O cubo � " + cubo);
				System.out.printf ("A ra�z quadrada � %.2f \n", raiz);
				num++;}
		
			if (num <= 0) {
				System.out.print("Entrada de dados finalizada");
			}
			
		input.close();
	}
}