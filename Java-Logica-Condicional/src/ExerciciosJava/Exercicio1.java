/*
 PROPOSTA DO EXERCICIO:
1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de
R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P
(peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na
variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com
o conteúdo ZERO.
*/


package ExerciciosJava;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int P = 0, E = 0;
		double M = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("P: ");
		P = leia.nextInt();
		
		
		if (P > 50) {
			E = P - 50;
			M = E * 4.00;
		} 
		
		System.out.printf("O valor a ser pago é: R$ " + "%.2f",  M);
	}

}
