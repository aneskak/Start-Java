/*
PROPOSTA DO EXERCICIO:
5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de
ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel
varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a
suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o 
intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser 
notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o 
medido e emita a notifica��o adequada aos diferentes grupos de empresas. 
*/
package ExerciciosJava;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Indique o �ndice de poluic�o: ");
		float i = leia.nextFloat();
		
		if (i <= 0.25) {
			System.out.println("As atividades podem continuar normalmente");
		}
		if (i > 0.25 && i < 0.40) {
			System.out.println("Aten��o! As ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades!");
		}
		if (i > 0.40 && i < 0.50) {
			System.out.println("Aten��o! As industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades!");
		}
		if ( i >= 0.50) {
			System.out.println("Aten��o! Todos os grupos devem s�o notificados a paralisarem suas atividades!");
		}
	}
}
