/* Escreva um programa que leia as medidas dos lados de um tri�ngulo e escreva se ele � Equil�tero, Is�sceles ou Escaleno.
 * Tri�ngulo Equil�tero: possui os 3 lados iguais.
 * Tri�ngulo Is�sceles: possui 2 lados iguais.
 * Tri�ngulo Escaleno: possui 3 lados diferentes. */

package aula01;

import java.util.Scanner;

public class Exerc27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.println("Digite os 3 lados do tri�ngulo:");
		lado1 = input.nextInt();
		lado2 = input.nextInt();
		lado3 = input.nextInt();
		
		if (lado1 == lado2) {
			if (lado1 == lado3) {
				System.out.print("Este tri�ngulo � equil�tero!"); }
			
			else {
				System.out.print("Este tri�ngulo � is�sceles!"); }
		}
		
		else if (lado2 == lado3) {
			System.out.print("Este tri�ngulo � is�sceles!"); }
		
		else {
			System.out.print("Este tri�ngulo � escaleno!"); }
		
		input.close();
	}
}