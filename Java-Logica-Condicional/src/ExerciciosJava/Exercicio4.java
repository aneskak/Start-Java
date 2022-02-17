/*
PROPOSTA DO EXERCICIO:
4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este 
número é par ou ímpar, e se é positivo ou negativo.
*/
package ExerciciosJava;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		Scanner leia = new Scanner(System.in);
		n = leia.nextInt();
		
		if (n > 0) {
			if (n % 2 == 0) {
				System.out.println("Este número é positivo e par");
			}
			else {
				System.out.println("Este número é positivo e ímpar");
			}
		}	
		else {
			if (n % 2 == 0)	{
				System.out.println("Este número é negativo e par");
			}
			else {
				System.out.println("Este número é negativo e ímpar");
			}
		}
	}

}
