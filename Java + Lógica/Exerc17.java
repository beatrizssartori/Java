/* Fa�a um programa que leia um conjunto n�o determinado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. 
 * Finalize a entrada de dados com um valor negativo ou zero. */

package aula01;

import java.util.Scanner;
import java.lang.Math;

public class Exerc17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = 0;
        
        System.out.print("Digite um n�mero (para finalizar a entrada de dados, digite um valor negativo ou 0): ");
        num = input.nextInt();
        
            while (num > 0) {
                System.out.println ("O quadrado � " + Math.pow(num, 2));
                System.out.println ("O cubo � " + Math.pow(num, 3));
                System.out.printf ("A ra�z quadrada � %.2f \n", Math.sqrt(num));
                System.out.print("\nDigite outro n�mero (para finalizar a entrada de dados, digite um valor negativo ou 0): ");
                num = input.nextInt();
                }
            
            System.out.print("Entrada de dados finalizada!");
            
        input.close();
    }
}