package contaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.println("-------------");
		System.out.print("Número: ");
		int number = input.nextInt();
		input.nextLine();
		
		System.out.print("Titular: ");
		String holder  = input.nextLine();
		
		System.out.print("Saldo inicial: ");
		double balance  = input.nextDouble();

		System.out.print("Limite de saque: ");
		double withDrawLimit  = input.nextDouble();
		
		Account acc = new Account(number, holder, balance, withDrawLimit);
		
		System.out.println();
		System.out.print("Informe a quantia para sacar: ");
		double amount = input.nextDouble();
		
		try {
			acc.withDraw(amount);
			System.out.printf("Novo saldo: %.2f%n", acc.getBalance()); 
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		input.close();
	}
}