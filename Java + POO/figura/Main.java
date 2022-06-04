/* Com o uso de herança e polimorfismo, crie um programa que calcule a área de uma figura geométrica. 
Aceite quatro tipos de figura geométrica: quadrado, retângulo, triângulo e círculo. */

package figura;

public class Main {
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo();
		Retangulo retangulo = new Retangulo();
		Circulo circulo = new Circulo();
		
		quadrado.setCor("Roxo");
		quadrado.setLado1(4);
		triangulo.setAltura(10);
		triangulo.setBase(5);
		retangulo.setCor("Verde");
		circulo.setRaio(8);
		
		System.out.println(quadrado);
		System.out.println(triangulo);
		System.out.println(retangulo);
		System.out.println(circulo);
	}
}