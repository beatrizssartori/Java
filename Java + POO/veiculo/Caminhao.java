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
		System.out.println("A placa do ve�culo � " + placa + ", o ano de fabrica��o � " + ano + " e a quantidade de eixos � " + eixos);
	}
}