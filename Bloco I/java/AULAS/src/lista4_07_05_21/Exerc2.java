package lista4_07_05_21;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		//Nome: exercicio 2 Objetivo: armazenar 6 numeros 
		//identificar se � par ou impar e armazenar
		// somar os pares - pares e impares - impares -> imprimir na tela
		//variaveis
		Scanner leia = new Scanner(System.in);
		int numeros[] = new int[6];
		char classifica[] = new char[6];
		int somaPares=0, somaImpares=0;
		//entradas processamento
		for(int i = 0; i < numeros.length; i++ ) {
			System.out.println("Digite um n�mero: ");
			numeros[i]= leia.nextInt();
			if((numeros[i]%2==0)) {
				classifica[i]= 'P';
				somaPares+=numeros[i];
			}
			else {
				classifica[i]= 'I';
				somaImpares+=numeros[i];
			}
		}
		//saida
		System.out.printf("Os n�meros pares digitados s�o:\n");
		for(int i = 0; i < numeros.length; i++ ) {
			if(classifica[i] == 'P') {
				System.out.print(numeros[i]+" ");	
			}
		}
		System.out.println("\n");
		System.out.printf("A soma dos n�meros pares digitados �: %d\n", somaPares);
		System.out.printf("Os n�meros impares digitados s�o:\n");
		for(int i = 0; i < numeros.length; i++ ) {
			if(classifica[i] == 'I') {
				System.out.print(numeros[i]+" ");	
			}
		}
		System.out.println();
		System.out.printf("A soma dos n�meros impares digitados �: %d\n", somaImpares);
	}
}
