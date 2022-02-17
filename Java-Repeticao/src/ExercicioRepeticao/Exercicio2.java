/*
 PROPOSTA DO EXERCICIO:
 Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

package ExercicioRepeticao;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> pares = new ArrayList<Integer>();
		ArrayList<Integer> impares = new ArrayList<Integer>();
		
		int par = 0, impar = 0, x;
		
		Scanner leia = new Scanner(System.in);
		for(x = 0 ; x < 10; x++)
		{
			if (x % 2 == 0) {
				pares.add(x);
				par++;
			}
			else {
				impares.add(x);
				impar++;
			}
		}
		System.out.println("\nPares: " + pares + "\nQuantidade de Pares: " + par + "\n\nImpares: " + impares + "\nQuantidade de Impares: " + impar);
	}

}
