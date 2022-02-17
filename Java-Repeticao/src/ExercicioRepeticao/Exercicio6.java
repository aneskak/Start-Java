/*
PROPOSTA DO EXERCICIO
Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. 
Para sair digitar 0(zero).(DO...WHILE)
*/

package ExercicioRepeticao;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int soma =0, media=0,num =0, qtd=0;
		
		Scanner leia = new Scanner(System.in);
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if (num % 3 == 0) {
				soma += num;
				qtd++;
			}
		}
		while (num != 0); {
	
		}
		
		media = soma / (qtd-1);
		System.out.println("A média dos números múltiplos de 3 é: " + media);
	}

}


