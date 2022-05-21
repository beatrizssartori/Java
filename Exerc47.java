package aula01;

import java.util.Scanner;

public class Exerc47 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float num1, num2;
		short opcao;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = input.nextFloat();
		System.out.print("Digite o segundo n�mero: ");
		num2 = input.nextFloat();
		System.out.print("Escolha uma op��o "
				+ "(1 - m�dia, "
				+ "2 - subtra��o do maior pelo menor, "
				+ "3 - multiplica��o, "
				+ "4 - divis�o do primeiro pelo segundo): ");
		opcao = input.nextShort();
		
		switch(opcao) {
		case 1:
			System.out.print("A m�dia entre os n�meros � de " + (num1 + num2)/2);
		break;
		
		case 2:
			if (num1 > num2) {
				System.out.print("A diferen�a do maior pelo menor � de " + (num1 - num2)); }
			else {
				System.out.print("A diferen�a do maior pelo menor � de " + (num1 - num2)); }
		break;
		
		case 3: 
			System.out.print("O produto entre os n�meros � de " + (num1*num2));
		break;
		
		case 4:
			if (num2 != 0) {
				System.out.print("A divis�o do primeiro pelo segundo � de " + (num1/num2)); }
			else {
				System.out.print("O segundo n�mero deve ser diferente de zero."); }
		break;
		
		default: 
			System.out.print("Op��o inv�lida, por favor digite uma op��o entre 1 e 4!");
		}
		
		input.close();
	}
}