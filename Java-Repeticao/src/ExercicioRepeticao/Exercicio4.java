/*
 PROPOSTA DO EXERCICIO:
 Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
 Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.

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

			System.out.println("Com qual genero você de identifica: \n\n1 - feminino\n2 - masculino \n3 - outros");

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
			
			System.out.println("Qual caracteristica psicologica você se identifica? \n\n1 - Calmo(a) \n2 - Nervoso(a) \n3 - Agressivo(a)");
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
		
		System.out.println("Número de pessoas calmas: " + pessoasCalmas + "\nNúmero de mulheres nervosas: " + mulheresNervosas + 
			"\nNúmero de homens agressivos: " + homensAgressivos + "\nNúmero de outros calmos: " + outrosCalmos + "\nNúmero de pessoas nervosas com mais de 40 anos: " + 
			nervosasMaisDe40 + "\nNúmero de pessoas calmas com menos de 18 anos: " + calmasMenosDe18);
	}

}
