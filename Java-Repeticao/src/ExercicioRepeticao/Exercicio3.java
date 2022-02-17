/*
PROPOSTA DO EXERCÍCIO:
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
O programa termina quando idade for =-99. (WHILE)
*/
package ExercicioRepeticao;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade=0, menosde21=0, maisde50=0;
		
		Scanner leia = new Scanner(System.in);
		
		while (idade != -99) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			if (idade > 0 && idade < 21) {
				menosde21++;
			}
			else if (idade > 50) {
				maisde50++;
			}
			
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + menosde21 + "\n\nTotal de pessoas com mais de 50 anos: " + maisde50);
	}

}
