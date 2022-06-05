package veiculo;

public class Caminhao extends Veiculo {
	private int eixos;
	
	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}
	
	public Caminhao() {
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	public void exibirDados() {
		System.out.println("A placa do veículo é " + placa + ", o ano de fabricação é " + ano + " e a quantidade de eixos é " + eixos);
	}
}