package lista2_05_05_21;

import java.util.Scanner;

public class Exerc3 {
	public static void main(String[] args) {
		//Nome: Classificador de idade Objetivo: Colocar faixas de idade (10-14 infantil, 15-17 juvenil, 18-25 adulto) a idade recebida
		// Variaveis
		int idade;
		Scanner leia = new Scanner(System.in);
		// Entradas
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		// Processamento - saida
		if(idade>= 10 && idade<=14) {
			System.out.println("Você está na faixa infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Você está na faixa juvenil");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("Você está na faixa adulto");
		}
		else {
			System.out.println("A idade está fora das faixas de classificação");
		}
		leia.close();
	}

}
