/*
PROPOSTA DO EXERCICIO:
8) Construa um sistema para ler uma vari�vel num�rica N e imprimi-la somente se a mesma 
for maior que 100, caso contr�rio imprimi-la com o valor zero
*/

package ExerciciosJava;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 0;
		
		Scanner leia = new Scanner(System.in);
		N = leia.nextInt();
		
		if (N > 100) {
			System.out.println(N);
		}
		else {
			System.out.println("N = 0");
		}
	}

}
