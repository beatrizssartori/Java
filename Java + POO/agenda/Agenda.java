package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda extends Contato {	
			//Criar ArrayList
			private ArrayList<String> contatos;
			
			Scanner input = new Scanner(System.in);
			
			public Agenda () {
				this.contatos = new ArrayList<String> (); }
			
			public void armazenaPessoa(String nome, int idade, float altura) {
				if (contatos.size() < 11) {
					contatos.add(nome); }
				else {
					System.out.println("O armazenamento máximo é de 10 pessoas!"); }
			}
			
			public void removePessoa (String nome) {
			//Remover objetos (remove)
			System.out.print("\nContato a ser removido: ");
			String removerContato = input.next();
			
			for (int i = 0; i < contatos.size(); i++) { 
				
				if (contatos.get(i).equalsIgnoreCase(removerContato)) {
					contatos.remove(i); 
					System.out.println("Lista atual de contatos: " + contatos); }
			} }
			
			public void removeTodos() {
				contatos.clear();
				System.out.println("Todos os contatos foram excluídos!");
			}
			
			public void imprimeAgenda() {
				for (String contato : contatos) {
					System.out.println("Nome do contato: " + contato); }
			}
			
			public void imprimePessoa(int index) {
				System.out.print("\nDigite o nome do contato que você deseja: ");
				String contatoQueDesejo = input.next();
				
				for (index = 0; index < contatos.size(); index++) {
					if (contatos.get(index).equals(contatoQueDesejo)) {
						System.out.println(contatos.indexOf(contatoQueDesejo)); }
				}
			}
			
	}