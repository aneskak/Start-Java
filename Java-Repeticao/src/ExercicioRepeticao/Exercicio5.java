/*
 PROPOSTA DO EXERCICIO:
 Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */
package ExercicioRepeticao;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int soma =0;
		int num = 0;
		Scanner leia = new Scanner(System.in);
		do {
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			soma += num;
		}
		while (num != 0); {
	
		}
		
		System.out.println("A soma de todos os n�meros digitados �: " + soma);
	}

}
