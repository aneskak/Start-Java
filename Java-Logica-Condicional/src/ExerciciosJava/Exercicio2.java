/*
PROPOSTA DO EXERCICIO:
2) Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas 
trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. 
Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento armazenando-o na 
vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. No 
final do processamento imprimir o sal�rio total e o sal�rio excedente. 
*/
package ExerciciosJava;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int C=0, N = 0;
		float HE = 0, salarioHE = 0, salario = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o c�digo do oper�rio: ");
		C = leia.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		N = leia.nextInt();
		
		if (N <= 50) {
			salario = N * 10;
		}
		else if (N > 50) {
			salario = 50 * 10;
			HE = N - 50;
			salarioHE = HE * 20; 
		}
		
		System.out.printf("O salario total �: R$ " + "%.2f", salario);
		System.out.printf("\nO valor de horas extras �: R$ " + "%.2f", salarioHE);
		
	}
}
