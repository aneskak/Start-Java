/*
 PROPOSTA DO EXERCICIO:
1) Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de
R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P
(peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na
vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com
o conte�do ZERO.
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
		
		System.out.printf("O valor a ser pago �: R$ " + "%.2f",  M);
	}

}
