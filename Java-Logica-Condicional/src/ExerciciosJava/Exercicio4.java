/*
PROPOSTA DO EXERCICIO:
4) Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este 
n�mero � par ou �mpar, e se � positivo ou negativo.
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
				System.out.println("Este n�mero � positivo e par");
			}
			else {
				System.out.println("Este n�mero � positivo e �mpar");
			}
		}	
		else {
			if (n % 2 == 0)	{
				System.out.println("Este n�mero � negativo e par");
			}
			else {
				System.out.println("Este n�mero � negativo e �mpar");
			}
		}
	}

}
