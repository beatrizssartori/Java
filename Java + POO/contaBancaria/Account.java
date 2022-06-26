/* Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta, mostrando o novo saldo. 
Um saque não pode ocorrer se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta. 

Baseado no código de DevSuperior: https://github.com/acenelio/exceptions2-java */

package contaBancaria;

public class Account {
	// Atributos de Account
	private Integer number;
	private String holder; // titular da conta
	private Double balance; // saldo
	private Double withDrawLimit; // limite de saque

	// Método construtor
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	// Getters e setters
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	// Métodos de Account
	public void deposit(double amount) {
		balance += amount; // somar quantia depositada ao saldo pré-existente
	}
	
	public void withDraw(double amount) {
		validateWithDraw(amount);
		balance -= amount; // saque
	}
	
	private void validateWithDraw(double amount) {
		if (amount > getWithDrawLimit()) {
			throw new BusinessException ("Erro de saque: A quantia excede o limite de saque!"); }
		if (amount > getBalance()){
			throw new BusinessException ("Erro de saque: Saldo insuficiente!"); }
	}
}