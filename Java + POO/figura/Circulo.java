package figura;

public class Circulo extends Figura {
	private double raio;
	
	public Circulo (String cor, double raio) {
		super(cor);
		this.raio = raio;
	}
	
	public Circulo() {
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public String toString() {
		return "Círculo (raio = " + raio + ", cor = " + super.getCor() + ")";
	}
	
	@Override
	public double area() {
		return raio * 3.14 * 2;
	}
}