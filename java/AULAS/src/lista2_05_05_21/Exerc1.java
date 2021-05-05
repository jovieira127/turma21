package lista2_05_05_21;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		//Nome: Encontrar o maior Objetivo: Encontrar o maior inteiro dentre 3 numeros
		// Variaveis
		int numero1, numero2, numero3, maior;
		Scanner leia = new Scanner(System.in);
		// Entradas
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		// Processamento
		maior = numero1;
		if(numero2>maior) {
			maior = numero2;
		}
		else if(numero3>maior){
			maior = numero3;
		}
		//saida
		System.out.printf("O maior número entre %d, %d e %d é %d.", numero1, numero2, numero3, maior);
		leia.close();
	}

}
