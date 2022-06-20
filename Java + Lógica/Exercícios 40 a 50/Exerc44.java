package aula01;

import java.util.Scanner;

public class Exerc44 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		short categoria;
		double preco, valorAumento = 0, valorImposto, novoPreco;
		char situacao;
		
		System.out.print("Digite o n�mero da categoria (1 - limpeza, 2 - alimenta��o, 3 - vestu�rio): ");
		categoria = input.nextShort();
		System.out.print("Digite o pre�o: ");
		preco = input.nextDouble();
		System.out.print("Digite a letra da situa��o (R - produtos que necessitam de refrigera��o, N - n�o necessitam): ");
		situacao = input.next().charAt(0);
		
		if (preco <= 25) {
			switch(categoria) {
				case 1:
					valorAumento = preco * 0.05;
				break;
				
				case 2:
					valorAumento = preco * 0.08;
				break;
				
				case 3: 
					valorAumento = preco * 0.10;
				break;
			
				default:
					System.out.print("N�mero de categoria inv�lido, escolha 1, 2 ou 3."); }
		}
			
		else {
			switch(categoria) {
				case 1:
					valorAumento = preco * 0.12;
				break;
					
				case 2:
					valorAumento = preco * 0.15;
				break;
					
				case 3: 
					valorAumento = preco * 0.18;
				break;
				
				default:
					System.out.print("N�mero de categoria inv�lido, escolha 1, 2 ou 3."); }
			}
		
		if (categoria == 1 || categoria == 2 || categoria == 3) {
		
		System.out.printf("\nValor do aumento: R$%.2f", valorAumento);
		
		if (categoria == 2 || situacao == 'R') {
			valorImposto = preco * 0.05; }
		
		else {
			valorImposto = preco * 0.08; }

		System.out.printf("\nValor do imposto: R$%.2f", valorImposto);
		
		novoPreco = preco + valorAumento - valorImposto;
		System.out.printf("\nNovo pre�o: R$%.2f", novoPreco);
		
		if (novoPreco <= 50) {
			System.out.print("\nClassifica��o: Barato"); }
		
		else if (novoPreco < 120) {
			System.out.print("\nClassifica��o: Normal"); }
		
		else {
			System.out.print("\nClassifica��o: Caro"); }
		}
		
		input.close();
	}
}