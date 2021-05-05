package exemplos;

import java.util.Scanner;

public class Exemplo_Se_05_04_21 {

	public static void main(String[] args) {
		// Nome: Par ou impar Objetivo: analisar se o número é par ou impar
		// variaveis
		int numero;
		Scanner leia = new Scanner(System.in);
		//entradas
		System.out.print("Olá, digite um número: ");
		numero = leia.nextInt();
		//processamento
		if (numero==0) {
			System.out.println("O número é neutro");
		}
		else if((numero%2) == 0) {
			System.out.println("O número que você digitou é par");
		}
		else if (numero<0) {
			System.out.println("O número é negativo");
		}
		else {
			System.out.println("O número que você digitou é impar");
		}
	}

}
