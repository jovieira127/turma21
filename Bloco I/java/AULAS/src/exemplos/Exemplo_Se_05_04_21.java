package exemplos;

import java.util.Scanner;

public class Exemplo_Se_05_04_21 {

	public static void main(String[] args) {
		// Nome: Par ou impar Objetivo: analisar se o n�mero � par ou impar
		// variaveis
		int numero;
		Scanner leia = new Scanner(System.in);
		//entradas
		System.out.print("Ol�, digite um n�mero: ");
		numero = leia.nextInt();
		//processamento
		if (numero==0) {
			System.out.println("O n�mero � neutro");
		}
		else if((numero%2) == 0) {
			System.out.println("O n�mero que voc� digitou � par");
		}
		else if (numero<0) {
			System.out.println("O n�mero � negativo");
		}
		else {
			System.out.println("O n�mero que voc� digitou � impar");
		}
	}

}
