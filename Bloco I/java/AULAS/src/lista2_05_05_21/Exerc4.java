package lista2_05_05_21;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		// Nome: Par ou impar Objetivo: analisar se n�mero � par ou �mpar. 
		//Se for par exiba tamb�m a raiz quadrada do mesmo;
		//se for �mpar exiba o n�mero elevado ao quadrado.
				// variaveis
				int numero;
				double raiz, potencia;
				Scanner leia = new Scanner(System.in);
				//entradas
				System.out.print("Ol�, digite um n�mero: ");
				numero = leia.nextInt();
				//processamento - saidas
				if((numero%2) == 0) {
					raiz = Math.sqrt(numero);
					System.out.printf("O n�mero %d � par\n", numero);
					System.out.printf("A ra�z de %.2f � ", raiz);
				}
				else {
					potencia = (numero*numero);
					System.out.printf("O n�mero %d � �mpar\n", numero);
					System.out.printf("A segunda pot�ncia de %.2f � ", potencia);
					
				}
				leia.close();
	}

}
