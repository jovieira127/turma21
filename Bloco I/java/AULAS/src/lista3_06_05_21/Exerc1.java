package lista3_06_05_21;

import java.util.Scanner;

public class Exerc1 {
	public static void main(String[] args) {
		//Nome: Numeros divisiveis por 11 Objetivo: Informar todos os números de 1000 a 1999 que quando divididos por 11
		//obtemos resto = 5.
		// Variaveis
		final int LIMITE_INFERIOR = 1000;
		final int LIMITE_SUPERIOR = 1999;
		final int resto = 5;
		int divisivel;
		Scanner leia = new Scanner(System.in);
		// Processamento - saída
		for(int i = LIMITE_INFERIOR; i<=LIMITE_SUPERIOR; i++) {
			if((i%11)==resto) {
				System.out.printf("%d\n", i);
			}
		}
		
		leia.close();
	}

}
