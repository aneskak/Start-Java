/*
PROPOSTA DO EXERCICIO:
7) Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos 
(positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.
*/
package ExerciciosJava;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub7
		
		int a, b, area=0;
		 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor da altura em cm: ");
		a = leia.nextInt();
		System.out.println("Digite o valor da base em cm: ");
		b = leia.nextInt();
		
		if (a > 0 && b > 0) {
			area = b * a / 2;
		}
		else {
			System.out.println("Valores inv�lidos");
		}
		
		System.out.println("A �rea do triangulo �: " + area + "cm�");
	}

}
