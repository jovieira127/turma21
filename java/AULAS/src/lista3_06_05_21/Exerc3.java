package lista3_06_05_21;

import java.util.Scanner;

public class Exerc3 {
	public static void main(String[] args) {
		//Nome: Classificador de idades: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos.
		// parar quando digitar -99
		// Variaveis
		int idade=0, menor21 = 0, maior50 = 0;
		final int FIM=-99, IDADE21 = 21, IDADE50 = 50;
		Scanner leia = new Scanner(System.in);
		
		// Entradas - Processamento
		while(idade != FIM){
			System.out.printf("Digite a idade: \n");
			idade = leia.nextInt();
			if(idade<IDADE21 && idade != FIM) {
				menor21++;
			}
			else if(idade>IDADE50){
				maior50++;
			}
		}
	
		//saida
		System.out.printf("Dentre as idades digitadas, %d pessoas são menores de 21 anos e %d pessoas são maiores de 50 anos", menor21, maior50);
		leia.close();
	}
}

