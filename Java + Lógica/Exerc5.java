// Ler uma temperatura em graus Celsius e apresent�-la convertida em graus Fahrenheit. 
// A f�rmula de convers�o �:  F= (9*C+160) / 5,  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 

package aula01;

import java.util.Scanner; 

public class Exerc5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double C, F; 
		
		 System.out.print("Digite a temperatura em Graus Celsius: ");
		 C = input.nextDouble();
		 
		 F = (9 * C + 160) / 5;

		 System.out.print("A temperatura convertida para Fahrenheit �: " +F +"�F");
		 
		 input.close();
	}
}
