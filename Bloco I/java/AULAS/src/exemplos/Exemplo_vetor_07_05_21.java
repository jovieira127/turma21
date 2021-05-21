package exemplos;

import java.util.Scanner;

public class Exemplo_vetor_07_05_21 {
	public static void main(String[] args) {
		//Nome: exercicio 1 Objetivo: armazenar 6 numeros e fazer soma de posições especificas
		//A[0], A[1] e A[5]
		//variaveis
		Scanner leia = new Scanner(System.in);
		int A[] = new int[6];
		int resultado=0;
		//entradas processamento
		for(int i = 0; i < A.length; i++ ) {
			System.out.println("Digite um número: ");
			A[i]= leia.nextInt();
			if(i == 0 || i == 1|| i == 5) {
				resultado+=A[i];
			}
		}
		System.out.printf("A soma dos elementos da posição A[0] = %d, A[1] = %d e A[5] = %d é %d ",A[0], A[1], A[5], resultado );
	}

}
