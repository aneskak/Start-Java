/*
 PROPOSTA DO EXERCICIO:
 Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
 Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o n�mero de pessoas calmas; 
o n�mero de mulheres nervosas; 
o n�mero de homens agressivos; 
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos; 
o n�mero de pessoas calmas com menos de 18 anos.

 * */
package ExercicioRepeticao;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t = 0, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, nervosasMaisDe40 = 0, calmasMenosDe18 = 0;
		
		int idade, gen = 0, op;
		String sexo = " ";
		String caracteristica = " ";

		Scanner leia = new Scanner(System.in);

		while (t < 2) {
			System.out.println("Entre com a sua idade: ");
			idade = leia.nextInt();

			System.out.println("Com qual genero voc� de identifica: \n\n1 - feminino\n2 - masculino \n3 - outros");

			gen = leia.nextInt();
		
			switch(gen)
			{
			case 1:
				sexo = "feminino";
				break;
			case 2:
				sexo = "masculino";
				break;
			case 3:
				sexo = "outros";
				break;		
			}
			
			System.out.println("Qual caracteristica psicologica voc� se identifica? \n\n1 - Calmo(a) \n2 - Nervoso(a) \n3 - Agressivo(a)");
			op = leia.nextInt();
		
			switch(op)
			{
			case 1:
				caracteristica = "Calmo(a)";
				break;
			case 2:
				caracteristica = "Nervoso(a)";
				break;
			case 3:
				caracteristica = "Agressivo(a)";
				break;		
			}
			t++;
			if (gen == 1 && op == 2) {
				mulheresNervosas++;
			}
			if (gen == 2 && op == 3) {
				homensAgressivos++;
			}
			if (op == 1 && gen == 3) {
				outrosCalmos++;
				pessoasCalmas++;
			}
			if (op == 2 && idade > 40) {
				nervosasMaisDe40++;
			}
			if (op == 1 && idade < 18) {
				calmasMenosDe18++;
				pessoasCalmas++;
			}
		}
		
		System.out.println("N�mero de pessoas calmas: " + pessoasCalmas + "\nN�mero de mulheres nervosas: " + mulheresNervosas + 
			"\nN�mero de homens agressivos: " + homensAgressivos + "\nN�mero de outros calmos: " + outrosCalmos + "\nN�mero de pessoas nervosas com mais de 40 anos: " + 
			nervosasMaisDe40 + "\nN�mero de pessoas calmas com menos de 18 anos: " + calmasMenosDe18);
	}

}
