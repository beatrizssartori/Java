package agenda;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int opcao;
		Agenda a = new Agenda();
		
		do {
			System.out.println("---------- Agenda Telefônica ---------");
			System.out.println("\n1 - Adicionar contato");
			System.out.println("2 - Mostrar todos");
			System.out.println("3 - Apagar o último contato adicionado");
			System.out.println("4 - Apagar todos");
			System.out.println("0 - Sair");
			System.out.print("\nEscolha a sua ação: ");
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				Contato c = new Contato();
				System.out.print("\nDigite o nome: ");
				c.setNome(input.next());
				System.out.print("Digite o número: ");
				c.setNumero(input.next());
				System.out.print("\n");
				a.add(c);
				break;
			case 2:
				a.mostrarTodos();
				System.out.print("\n");
				break;
			case 3:
				a.remove();
				System.out.print("\n");
				break;
			case 4: 
				a.removeTodos();
				System.out.print("\n");
				break;
			}
		} while (opcao != 0);
	
		System.out.print("Você saiu da agenda telefônica!");
		
		input.close();
	}
}