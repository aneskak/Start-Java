/*
PROPOSTA DO EXERCICIO:
3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/
package ExerciciosJava;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c, d;
		
		Scanner leia = new Scanner(System.in);
		
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		d = leia.nextInt();
		
		a = Math.sqrt(a);
		b = Math.sqrt(b);
		c = Math.sqrt(c);
		d = Math.sqrt(d);
		
		if (c >= 1000) {
			System.out.printf("%.3f", c);
		} else {
			System.out.printf( a + "\n" + b + "\n" + c + "\n" + d);
		}
	
	}
	 
}
