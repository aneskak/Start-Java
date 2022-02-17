/*
 PROPOSTA DO EXERCICIO:
 Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
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
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			soma += num;
		}
		while (num != 0); {
	
		}
		
		System.out.println("A soma de todos os números digitados é: " + soma);
	}

}
