package lista4_07_05_21;

import java.util.Scanner;

public class Exerc3 {
	public static void main(String[] args) {
		//Nome: exercicio 3 Objetivo: Percorrer uma matriz 3x3 e contar os elementos com valor maior que 10
		Scanner leia = new Scanner(System.in);
		int A[][] = new int[3][3];
		int contador=0;
		final int parametro = 10;
		//entradas processamento
		for(int i = 0; i < A.length; i++ ) {
			for(int j = 0; j < A[0].length; j++ ) {
				System.out.printf("Digite o elemento da linha %d coluna %d da matriz: ", (i+1), (j+1));
				A[i][j]= leia.nextInt();
				if(A[i][j]>parametro) {
					contador++;
				}
			}
		}
		//saida
		System.out.printf("O número de elementos com valor maior que 10, na matriz, é %d \n", contador);
		System.out.printf("Os elementos da matriz são:\n");
		for(int i = 0; i < A.length; i++ ) {
			for(int j = 0; j < A[0].length; j++ ) {
				System.out.printf("%d\t", A[i][j]);
			}
			System.out.println();
		}
			
	}

}
