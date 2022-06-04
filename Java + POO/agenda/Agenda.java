package agenda;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contato> contatos;
	
	public Agenda() {
		this.contatos = new ArrayList<Contato> ();
	}
	
	public void add(Contato c) {
		contatos.add(c);
	}
	
	public void mostrarTodos(){
		for (int i = 0; i < this.contatos.size(); i++) {
			System.out.println("------------");
			contatos.get(i).print(); }
	}
	
	public void remove() {
		int ultimoContato = 0;
		contatos.remove(ultimoContato);
		this.mostrarTodos();
	}

	public void removeTodos() {
		contatos.clear();
		System.out.println("Todos os contatos foram excluídos!");
	}
}