/* Com o uso de heran�a e polimorfismo, crie um programa que calcule a �rea de uma figura geom�trica. 
Aceite quatro tipos de figura geom�trica: quadrado, ret�ngulo, tri�ngulo e c�rculo. */

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