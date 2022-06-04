package aula01;

import java.util.Scanner;

public class Exerc49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		short opcao;
		double salario, imposto, novoSalario;
		String classificacao;
		
		do {
			System.out.print("Menu de op��es: \n1 � Imposto, \n2 � Novo Sal�rio, \n3 � Classifica��o, \n4 � Finalizar o programa, "
					+ "\n5 � Finalizar o programa. \nDigite a op��o desejada: ");
			opcao = input.nextShort();
			
			System.out.print("Digite o seu sal�rio bruto: ");
			salario = input.nextDouble();
			
			if (opcao < 1 || opcao > 5) {
				System.out.print("\nOp��o inv�lida!\n"); }		
		} while (opcao < 1 || opcao > 5);
		
		if (opcao == 1) {
			if (salario < 500) {
				imposto = salario * 0.05; }
			else if (salario <= 850) {
				imposto = salario * 0.10; }
			else {
				imposto = salario * 0.15; }
			
			System.out.printf("O valor do imposto sobre o sal�rio R$%.2f � de R$%.2f.", salario, imposto);
		} 
		
		else if (opcao == 2) {
			if (salario > 1500) {
				novoSalario = salario + 250; }
			else if (salario >= 750) {
				novoSalario = salario + 50; }
			else if (salario >= 450) {
				novoSalario = salario + 75; }
			else {
				novoSalario = salario + 100; }
			
			System.out.printf("O novo sal�rio � de R$%.2f.", novoSalario);
		} 
		
		else if (opcao == 3){
			if (salario < 700) {
				classificacao = "mal remunerado"; }
			else {
				classificacao = "bem remunerado"; }
			
			System.out.printf("A classifica��o para o sal�rio R$%.2f � de %s.", salario, classificacao); 
			}
		
		else {
			System.out.print("Programa finalizado."); }
		
		input.close();
	}
}