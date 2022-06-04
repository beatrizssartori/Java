package agenda;

public class Contato {
	private String nome, numero;
	
	public Contato () {
	}
	
	public Contato (String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void print() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: " + this.getNumero());
	}
}