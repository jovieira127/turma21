package lista2_05_05_21;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		// Nome: Par ou impar Objetivo: analisar se número é par ou ímpar. 
		//Se for par exiba também a raiz quadrada do mesmo;
		//se for ímpar exiba o número elevado ao quadrado.
				// variaveis
				int numero;
				double raiz, potencia;
				Scanner leia = new Scanner(System.in);
				//entradas
				System.out.print("Olá, digite um número: ");
				numero = leia.nextInt();
				//processamento - saidas
				if((numero%2) == 0) {
					raiz = Math.sqrt(numero);
					System.out.printf("O número %d é par\n", numero);
					System.out.printf("A raíz de %.2f é ", raiz);
				}
				else {
					potencia = (numero*numero);
					System.out.printf("O número %d é ímpar\n", numero);
					System.out.printf("A segunda potência de %.2f é ", potencia);
					
				}
				leia.close();
	}

}
