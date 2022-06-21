/* Crie uma classe que aceite a digita��o de dois n�meros e fa�a a divis�o entre eles exibindo seu resultado. Sua classe deve tratar as seguintes exce��es:
ArithmeticException quando ocorrer uma divis�o por zero.
InputMismatchException quando o valor informado n�o � num�rico. */

package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoException {
	// Sinaliza��o da exce��o ArithmeticException. Indica que o m�todo quotient pode lan�ar tal exce��o.
	public static int quotient(int numerator, int denominator) throws ArithmeticException { 
		return numerator / denominator;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String continuar = " ";
		
		do {
			// Regi�o protegida try. Indica que exce��es deste bloco ser�o tratadas.
			try {
				System.out.print("Digite o numerador: ");
				int numerator = input.nextInt();
				System.out.print("Digite o denominador: ");
				int denominator = input.nextInt();
				int result = quotient( numerator, denominator );
				System.out.println("Resultado: " + result);
			}
			
			// Tratadores catch. Indica como cada exce��o deve ser tratada.
			catch (ArithmeticException arithmeticException) {
				System.out.println("Zero � um denominador inv�lido.");
			} 
			
			catch (InputMismatchException inputMismatchException) {
				input.next(); // limpar buffer
				System.out.println("Devem ser digitados n�meros inteiros.");
			}
			
			System.out.print("\nDeseja continuar as divis�es? ");
			continuar = input.next();
			System.out.println("");
			
		} while (!continuar.equals("n�o"));
			
		System.out.println("Voc� saiu do programa!");
		
		input.close();
		
	}
}