package lista3_06_05_21;

import java.util.Locale;
import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade, genero, caracteristica; 
		int NumPessoasCalmas = 0, NumMulheresNervosas = 0, NumHomensAgressivos = 0, NumOutresCalmes = 0, NumPessoasNervosasMais40 = 0, NumPessoasCalmasMenos18 = 0;
		final int populacao = 150;
		int contador = 0;
		
		while(contador<populacao) {
			System.out.print("Informe sua idade: ");
			idade = sc.nextInt();
			System.out.print("Informe o sexo (1-feminino / 2-masculino / 3-Outros): ");
			genero = sc.nextInt();
			if (genero == 1) {
				System.out.print("Informe a característica (1-Calma / 2-Nervosa / 3-Agressiva): ");
				caracteristica = sc.nextInt();
				if(caracteristica == 2) {
					NumMulheresNervosas++;
				}
			}
			else if (genero == 2) {
				System.out.print("Informe a característica (1-Calmo / 2-Nervoso / 3-Agressivo): ");
				caracteristica = sc.nextInt();
				if(caracteristica == 3) {
					NumHomensAgressivos++;
				}
			}
			else {
				System.out.print("Informe a característica (1-Calme / 2-Nervose / 3-Agressive): ");
				caracteristica = sc.nextInt();
				if(caracteristica == 1) {
					NumOutresCalmes++;
				}
			}
			if(caracteristica == 1) {
				NumPessoasCalmas++;
				if(idade < 18) {
					NumPessoasCalmasMenos18++; 
					}
			}
			else if(caracteristica == 2 && idade > 40) {
				NumPessoasNervosasMais40++; 
				
				}
			contador++;
			System.out.println();
			}
		System.out.println("********************* SENSO 2021 *********************");
		System.out.printf("O número de pessoas calmas na população é %d\n",NumPessoasCalmas);
		System.out.printf("O número de mulheres nervosas na população é %d\n",NumMulheresNervosas);
		System.out.printf("O número de homens agressivos na população é %d\n",NumHomensAgressivos);
		System.out.printf("O número de outres calmes na população é %d\n",NumOutresCalmes);
		System.out.printf("O número de pessoas nervosas com mais de 40 anos na população é %d\n",NumPessoasNervosasMais40);
		System.out.printf("O número de pessoas calmas com menos de 18 anos na população é %d\n",NumPessoasCalmasMenos18);
		System.out.println("******************************************************");	
		sc.close();
	}

}
