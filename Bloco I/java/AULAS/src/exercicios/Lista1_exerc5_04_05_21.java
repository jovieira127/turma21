package exercicios;

import java.util.Scanner;

public class Lista1_exerc5_04_05_21 {
	public static void main(String[] args) {
	//Nome:Calculadora de notas Objetivo: Calcular a média ponderada a partir de 3 notas (pesos:2, 3 e 5) 
		// variáveis
			double nota1, nota2, nota3, media;
			final double peso1 = 2;
			final double peso2 = 3;
			final double peso3 = 5;
			Scanner leia = new Scanner(System.in);
		//entradas
			System.out.println("Digite a primeira nota: ");
			nota1 = leia.nextDouble();
			System.out.println("Digite a segunda nota: ");
			nota2 = leia.nextDouble();
			System.out.println("Digite a terceira nota: ");
			nota3 = leia.nextDouble();
		//processamento
			media = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1+peso2+peso3);
			//saída
			System.out.println("A média ponderada entre "+nota1+", "+nota2+", e " +nota3+ " é: "+media);
			//fim
	}

}
