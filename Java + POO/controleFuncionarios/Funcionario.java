package controleFuncionarios;

public class Funcionario {
	
	//Atributos da classe
	private String matricula, nome, cargo;
	private double salario;
	
	//Construtor
	public Funcionario() {
	}
	
	//Métodos getters e setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void reajustarSalario() {
		if (this.cargo.equalsIgnoreCase("Gerente")) {
			this.salario = this.salario * 1.10; }
		else if (this.cargo.equalsIgnoreCase("Vendedor")) {
			this.salario = this.salario * 1.05; }
		else {
			this.salario = this.salario * 1.01; }
	}
}