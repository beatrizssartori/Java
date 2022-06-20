/* Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:

void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
void imprimeAgenda();
void imprimePessoa(int index); 
void removeTodos(); */

package agenda;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String opcao;
		Agenda t = new Agenda();
		Contato a = new Contato();
		
		do {
			
			System.out.println("Escolha a sua ação: Incluir - Excluir - Resetar - Listar - Procurar - Sair");
			opcao = input.next();
			input.nextLine();
			
			switch (opcao) {
			
			case "Incluir":
				
				System.out.print("\nDigite o nome: ");
				a.setNome(input.next());
				
				System.out.print("Digite a idade: ");
				a.setIdade(input.nextInt());
				
				System.out.print("Digite a altura: ");
				a.setAltura(input.nextFloat());
				
				System.out.println("\nNome: " + a.getNome());
				System.out.println("Idade: " + a.getIdade());
				System.out.printf("Altura: " + a.getAltura() + " metros \n");
				System.out.print("\n");
				
				t.armazenaPessoa(a.getNome(), a.getIdade(), a.getAltura());
				
				break;
				
			case "Excluir":
				t.removePessoa(a.getNome());
				System.out.print("\n");
				break;
				
			case "Resetar":
				t.removeTodos();
				System.out.print("\n");
				break;
				
			case "Listar":
				t.imprimeAgenda();
				System.out.print("\n");
				break;

			case "Procurar":
				t.imprimePessoa(0);
				System.out.print("\n");
				break;
				
			case "Sair":
				System.out.print("Você saiu da agenda!");
				break;
				
			default:
				System.out.println("Opcao inválida! Tente novamente. :)\n");
				break;
			} 
		} while (!opcao.equals("Sair"));
		
		input.close();
	}
}