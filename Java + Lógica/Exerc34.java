/* Desenvolva um programa para determinar a m�dia final e a situa��o (Aprovado, Reprovado ou Exame) de um aluno em uma disciplina. 
 * S�o dadas as notas de tr�s provas, o n�mero de aulas ministradas e o n�mero de faltas do aluno. 
 * Sabe-se que a m�dia final � a m�dia aritm�tica dessas tr�s provas e que a m�dia para aprova��o � 7, menor do que 3 para reprova��o e as demais em exame. 
 * Entretanto, o aluno estar� reprovado se tiver faltado a mais do que 25% das aulas. */

package aula01;

import java.util.Scanner;

public class Exerc34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		double nota1, nota2, nota3;
		int numAulas, numFaltas;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = input.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = input.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = input.nextDouble();
		System.out.print("Informe a quantidade de aulas ministradas: ");
		numAulas = input.nextInt();
		System.out.print("Informe a quantidade de faltas: ");
		numFaltas = input.nextInt();
		
		double mediaFinal = (nota1 + nota2 + nota3) / 3;
		double porcentagemFaltas = (numFaltas * 100) / numAulas;
		
		if (mediaFinal >= 7) {
			if (porcentagemFaltas <= 25) {
				System.out.printf("Situa��o do aluno: Aprovado! Sua m�dia final � de %.2f e a porcentagem de faltas � de %.2f.", mediaFinal, porcentagemFaltas); }
				else {
					System.out.printf("Situa��o do aluno: Reprovado! Sua m�dia final � de %.2f, por�m a porcentagem de faltas � de %.2f.", mediaFinal, porcentagemFaltas); }
			}
		
		else if (mediaFinal >= 3) {
			if (porcentagemFaltas <= 25) {
				System.out.printf("Situa��o do aluno: Em exame! Sua m�dia final � de %.2f e a porcentagem de faltas � de %.2f.", mediaFinal, porcentagemFaltas); }
			else {
				System.out.printf("Situa��o do aluno: Reprovado! Sua m�dia final � de %.2f, por�m a porcentagem de faltas � de %.2f.", mediaFinal, porcentagemFaltas); }
		}
		
		else {
			System.out.printf("Situa��o do aluno: Reprovado! Sua m�dia final � de %.2f e a porcentagem de faltas � de %.2f.", mediaFinal, porcentagemFaltas); }
			
		input.close();
	}
}