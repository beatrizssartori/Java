package veiculo;

public class Onibus extends Veiculo {
	private int assentos;
	
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("A placa do ve�culo � " + placa + ", o ano de fabrica��o � " + ano + " e o n�mero de assentos � " + assentos);
	}
}