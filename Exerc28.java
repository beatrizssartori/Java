/* Escreva um programa que leia o valor de 3 �ngulos de um tri�ngulo e escreva se o tri�ngulo � Acut�ngulo, Ret�ngulo ou Obtus�ngulo.
* Tri�ngulo Ret�ngulo: possui um �ngulo reto. (igual a 90�)
* Tri�ngulo Obtus�ngulo: possui um �ngulo obtuso. (maior que90�)
* Tri�ngulo Acut�ngulo: possui tr�s �ngulos agudos. (menor que 90�) */

package aula01;

import java.util.Scanner;

public class Exerc28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double angulo1, angulo2, angulo3;
		
		System.out.println("Digite os tr�s �ngulos do tri�ngulo: ");
		angulo1 = input.nextDouble();
		angulo2 = input.nextDouble();
		angulo3 = input.nextDouble();
		
		if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
			System.out.print("Este tri�ngulo � acut�ngulo!");
		}
		
		else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			System.out.print("Este tri�ngulo � ret�ngulo!");
		}
		
		else {
			System.out.print("Este tri�ngulo � obtus�ngulo!");
		}
		
		input.close();
	}
}