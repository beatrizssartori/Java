// Escrever um programa que receba dois n�meros e ao final mostre a soma, subtra��o, multiplica��o e a divis�o dos n�meros lidos.

package aula01;

import java.util.Scanner; 

public class Exerc1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);   
		 
		 int x, y; // primeiro n�mero e segundo n�mero 
		 int soma, subt, div, mult; // opera��es  
		 
		 System.out.print("Digite o primeiro n�mero:" );   
		 x = input.nextInt();   
		 System.out.print("Digite o segundo n�mero:" );   
		 y = input.nextInt();   
		 
		 soma = x + y;   
		 subt = x - y;   
		 div = x / y;   
		 mult = x * y;   
		 
		 System.out.println("A soma �:" +soma);   
		 System.out.println("A subtra��o �:" +subt);               
		 System.out.println("A divis�o �:" +div);               
		 System.out.println("A multiplica��o �:" +mult); 
		 
		 input.close();
	}
}