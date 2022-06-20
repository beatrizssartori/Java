package agenda;

public class Contato {
	private String nome;
	private int idade;
	private float altura;
	
	// Método construtor
	public Contato () {
	}

	// Getters e setters 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
}