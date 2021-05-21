package lista3_06_05_21;

import java.util.Scanner;

public class Exerc6 {
	public static void main(String[] args) {
		//Nome: Média dos multiplos de 3 Objetivo: Receber numeros, calcular media dos numeros multiplos de 3 e sair quando digitar 0
		int numeros;
		double media= 0.0, multiplos = 0.0, digitados = 0.0;
		final int PARAMETRO=3;
		Scanner leia = new Scanner(System.in);
		// Entradas - Processamento
		do {
			System.out.printf("Digite o numero da sequência: \n");
			numeros = leia.nextInt();
			if((numeros%PARAMETRO) == 0  && numeros != 0) {
				multiplos++;
			}
			if (numeros != 0) {
				digitados++;
			}
		}while(numeros != 0);
		
		media = (multiplos/digitados);
		
		//saida
		System.out.printf("Na sequência digitada, a media de números que são multiplos de 3 é %.3f", media);
		leia.close();
	}

}
