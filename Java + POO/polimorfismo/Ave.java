package polimorfismo;
public class Ave extends Animal {
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("voando");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("som de ave");
	}
	
	public void fazerNinho() {
		System.out.println("construiu um ninho");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}