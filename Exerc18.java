/* Uma empresa possui dez funcion�rios com as seguintes caracter�sticas: 
 * c�digo, n�mero de horas trabalhadas no m�s, turno de trabalho (Matutino; Vespertino; Noturno), categoria (Oper�rio; ou Gerente), valor da hora trabalhada.
 */

package aula01;

import java.util.Scanner;

public class Exerc18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int codigo, horasTrabalhadas, qtdeFuncionarios = 10;
		char turno, categoria;
		double valorHora, salarioInicial, auxilioAlimentacao;
		
		/* a) Leia as informa��es dos funcion�rios, exceto o valor da hora trabalhada, n�o permitindo que sejam informa��es dos turnos e nem categorias inexistentes. 
		 * Trabalhe sempre com a digita��o de letras mai�sculas. */
		
		for (int i = qtdeFuncionarios; i > 0; i-- ) {
			turno = 'X';
			categoria = 'X';
		
			System.out.print("Insira o c�digo do funcion�rio: ");
			codigo = input.nextInt();
			
			System.out.print("Turno (M - matutino, V - vespertino ou N - noturno): ");
			
			while (turno != 'M' && turno != 'V' && turno != 'N') {
				turno = input.next().charAt(0);
				
				if (turno != 'M' && turno != 'V' && turno != 'N') {
					System.out.println("Turno inv�lido"); }
			}
			
			System.out.print("Insira a categoria do funcion�rio (O - oper�rio ou G - gerente): ");
			
			while (categoria != 'G' && categoria != 'O') {
				categoria = input.next().charAt(0);
				
				if (categoria != 'G' && categoria != 'O') {
					System.out.println("Categoria inv�lida"); }
			}
			
			// b) Calcule o valor da hora trabalhada, conforme a tabela 1. Adote o valor de R$450,00 para o sal�rio m�nimo.
			
			double salarioMinimo = 450.00;
			
			if (categoria == 'G') {
				if (turno == 'N') {
					valorHora = salarioMinimo * 0.18; }
				else {
					valorHora = salarioMinimo * 0.15; }
			}
			
			else {
				if (turno == 'N') {
					valorHora = salarioMinimo * 0.13; }
				else {
					valorHora = salarioMinimo * 0.10; }
			}
			
			// c) Calcule o sal�rio inicial dos funcion�rios com base no valor da hora trabalhada e no n�mero de horas trabalhadas.
			System.out.print("Quantidade de horas trabalhadas no m�s: ");
			horasTrabalhadas = input.nextInt();
			
			salarioInicial = valorHora * horasTrabalhadas;
			
			// d) Calcule o valor do aux�lio alimenta��o recebido pelo funcion�rio de acordo com seu sal�rio inicial, conforme a tabela 2.
			
			System.out.print("Insira o sal�rio inicial do funcion�rio: ");
			salarioInicial = input.nextDouble();
			
			if (salarioInicial < 300.00) {
				auxilioAlimentacao = salarioInicial * 0.2; }
			else if (salarioInicial >= 300.00 && salarioInicial <= 600.00) {
				auxilioAlimentacao = salarioInicial * 0.15; }
			else {
				auxilioAlimentacao = salarioInicial * 0.05; }
			
			double salarioFinal = salarioInicial + auxilioAlimentacao;
			
			System.out.println("\nC�digo: " + codigo);
			System.out.println ("N� de horas trabalhadas: " + horasTrabalhadas);
			System.out.println ("Valor da hora trabalhada: " + valorHora);
			System.out.println ("Sal�rio inicial: " + salarioInicial);
			System.out.println ("Aux�lio alimenta��o: " + auxilioAlimentacao);
			System.out.println ("Sal�rio final: " + salarioFinal);
			
			System.out.println();
			}
		input.close();
	} 
}