/*
PROPOSTA DO EXERCICIO
Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
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
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			if (num % 3 == 0) {
				soma += num;
				qtd++;
			}
		}
		while (num != 0); {
	
		}
		
		media = soma / (qtd-1);
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + media);
	}

}


