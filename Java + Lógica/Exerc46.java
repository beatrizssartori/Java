package aula01;

import java.util.Scanner;

public class Exerc46 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		short codigo;
		float preco;
		
		System.out.print("Digite o pre�o do produto: ");
		preco = input.nextFloat();
		System.out.print("Digite seu c�digo de origem: ");
		codigo = input.nextShort();
		
		switch (codigo) {
		case 1:
			System.out.println("Pre�o: R$" + preco + " - produto do Sul");
		break;
		
		case 2:
			System.out.println("Pre�o: R$" + preco + " - produto do Norte");
		break;
		
		case 3:
			System.out.println("Pre�o: R$" + preco + " - produto do Leste");
		break;
		
		case 4:
			System.out.println("Pre�o: R$" + preco + " - produto do Oeste");
		break;
		
		case 5, 6:
			System.out.println("Pre�o: R$" + preco + " - produto do Nordeste");
		break;
		
		case 7, 8, 9:
			System.out.println("Pre�o: R$" + preco + " - produto do Sudeste");
		break;
		
		case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
			System.out.println("Pre�o: R$" + preco + " - produto do Centro-Oeste");
		break;
		
		case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30:
			System.out.println("Pre�o: R$" + preco + " - produto do Nordeste");
		break;
		
		default:
			System.out.println("Pre�o: R$" + preco + " - produto importado");
		}
		
		input.close();
	}
}