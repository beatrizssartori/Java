// Fa�a um programa que receba um valor que foi depositado e exiba o valor com rendimento ap�s um m�s. 
// Considere fixo o juro da poupan�a em 0.70% a. m.

package aula01;

import java.util.Scanner;

public class Exerc7 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		 
		 double deposito; // valor depositado  
		 double juros; // juros de 0,70% a.m.
		 double rendimento; // rendimento ap�s um m�s

		 System.out.print("Digite o valor do dep�sito: " );   
		 deposito = input.nextDouble(); 
		 
		 juros = (deposito * 0.70) / 100;
		 rendimento = juros + deposito;
		 
		 System.out.print("O rendimento da poupan�a no m�s foi de " + rendimento + " reais");
		 
		input.close();
	}
}