package lista3_06_05_21;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		//Nome: separar numeros entre par e impar Objetivo: Digitar 10 numeros e quantificar quantidade de pares e impares
		// Variaveis
		int numeros, par = 0, impar = 0;
		final int PARAMETRO=2;
		Scanner leia = new Scanner(System.in);
		// Entradas - Processamento
		for(int i = 0; i<10; i++) {
			if(i==0) {
				System.out.printf("Olá, digite o numero %d da sequência: \n",(i+1));
				numeros = leia.nextInt();
			}
			else {
				System.out.printf("Digite o numero %d da sequência: \n",(i+1));
				numeros = leia.nextInt();
			}
			if((numeros%PARAMETRO)==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		//saida
		System.out.printf("Na sequência digitada, %d numeros são pares e %d numeros são impares", par, impar);
		leia.close();
	}
}
