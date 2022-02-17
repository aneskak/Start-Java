/*
PROPOSTA DO EXERCICIO:
6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes 
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
*/
package ExerciciosJava;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int i = leia.nextInt();
		
		if (i < 5) {
			System.out.println("Não há turma para bebês.");
		}
		else if (i > 4 && i < 8) {
			System.out.println("Infantil A");
		}
		else if (i > 7 && i < 12) {
			System.out.println("Infantil B");
		}
		else if (i > 11 && i < 14) {
			System.out.println("Juvenil A");
		}
		else if (i > 13 && i < 18) {
			System.out.println("Juvenil B");
		}
		else if (i > 17 && i < 120 ){
			System.out.println("Adultos");
		}
		else if (i > 119 ){
			System.out.println("Digite uma idade válida.");
		}
	}

}
