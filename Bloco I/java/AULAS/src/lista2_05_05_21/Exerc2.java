package lista2_05_05_21;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		//Nome: Ordem crescente de numeros Objetivo: Colocar em ordem crescente 3 n�meros
		// Variaveis
		int numero1, numero2, numero3, primeiro, segundo, terceiro;
		Scanner leia = new Scanner(System.in);
		// Entradas
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		numero3 = leia.nextInt();
		// Processamento
		if(numero1<numero2) {
			if(numero1<numero3) {
				primeiro = numero1;
				if(numero2<numero3) {
					segundo = numero2;
					terceiro = numero3;
				}
				else {
					terceiro = numero2;
					segundo = numero3;
				}
			}
			else {
				primeiro = numero3; 
				terceiro = numero2;
				segundo = numero1;
				
			}
		}
		else {
			if(numero2<numero3) {
				primeiro = numero2;
				if(numero1<numero3) {
					segundo = numero1;
					terceiro = numero3;
				}
				else {
					terceiro = numero1;
					segundo = numero3;
				}
			}
			else {
				primeiro = numero3; 
				terceiro = numero1;
				segundo = numero2;
				
			}
		}
		
		//saida
		System.out.printf("A posi��o dos numeros em ordem crescente � %d, %d e %d.", primeiro, segundo, terceiro);
		leia.close();
	}
}
