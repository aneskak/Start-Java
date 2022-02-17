/*
PROPOSTA DO EXERCICIO:
5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são 
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser 
notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição 
medido e emita a notificação adequada aos diferentes grupos de empresas. 
*/
package ExerciciosJava;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Indique o índice de poluicão: ");
		float i = leia.nextFloat();
		
		if (i <= 0.25) {
			System.out.println("As atividades podem continuar normalmente");
		}
		if (i > 0.25 && i < 0.40) {
			System.out.println("Atenção! As indústrias do 1º grupo são intimadas a suspenderem suas atividades!");
		}
		if (i > 0.40 && i < 0.50) {
			System.out.println("Atenção! As industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades!");
		}
		if ( i >= 0.50) {
			System.out.println("Atenção! Todos os grupos devem são notificados a paralisarem suas atividades!");
		}
	}
}
