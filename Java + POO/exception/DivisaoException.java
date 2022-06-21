/* Crie uma classe que aceite a digitação de dois números e faça a divisão entre eles exibindo seu resultado. Sua classe deve tratar as seguintes exceções:
ArithmeticException quando ocorrer uma divisão por zero.
InputMismatchException quando o valor informado não é numérico. */

package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoException {
	// Sinalização da exceção ArithmeticException. Indica que o método quotient pode lançar tal exceção.
	public static int quotient(int numerator, int denominator) throws ArithmeticException { 
		return numerator / denominator;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String continuar = " ";
		
		do {
			// Região protegida try. Indica que exceções deste bloco serão tratadas.
			try {
				System.out.print("Digite o numerador: ");
				int numerator = input.nextInt();
				System.out.print("Digite o denominador: ");
				int denominator = input.nextInt();
				int result = quotient( numerator, denominator );
				System.out.println("Resultado: " + result);
			}
			
			// Tratadores catch. Indica como cada exceção deve ser tratada.
			catch (ArithmeticException arithmeticException) {
				System.out.println("Zero é um denominador inválido.");
			} 
			
			catch (InputMismatchException inputMismatchException) {
				input.next(); // limpar buffer
				System.out.println("Devem ser digitados números inteiros.");
			}
			
			System.out.print("\nDeseja continuar as divisões? ");
			continuar = input.next();
			System.out.println("");
			
		} while (!continuar.equals("não"));
			
		System.out.println("Você saiu do programa!");
		
		input.close();
		
	}
}