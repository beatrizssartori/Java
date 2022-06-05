package polimorfismo;
public class Reptil extends Animal {
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo vegetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("som de r�ptil");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}