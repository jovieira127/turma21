package lista4_07_05_21;

import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {
		//Nome: exercicio 3 Objetivo: Percorrer uma matriz 3x3 e contar os elementos com valor maior que 10
		Scanner leia = new Scanner(System.in);
		double A[][] = new double[2][2];
		double B[][] = new double[2][2];
		double soma[][] = new double[2][2];
		double subtrai[][] = new double[2][2];
		double constante;
		char opcao = ' ';
		//entradas 
		System.out.println("******* Escolha a operação *******");
		System.out.println("(1) somar as duas matrizes");
		System.out.println("(2) subtrair a primeira matriz da segunda");
		System.out.println("(3) adicionar uma constante as duas matrizes");
		System.out.println("(4) imprimir as matrizes");
		opcao = leia.next().charAt(0);
		
		
		for(int i = 0; i < A.length; i++ ) {
			for(int j = 0; j < A[0].length; j++ ) {
				System.out.printf("Digite o elemento da linha %d coluna %d da matriz A: ", (i+1), (j+1));
				A[i][j]= leia.nextDouble();
			}
		}
		for(int i = 0; i < B.length; i++ ) {
			for(int j = 0; j < B[0].length; j++ ) {
				System.out.printf("Digite o elemento da linha %d coluna %d da matriz B: ", (i+1), (j+1));
				B[i][j]= leia.nextDouble();
			}
		}
		//processamento e saidas
		if(opcao == '1') {
			for(int i = 0; i < soma.length; i++ ) {
				for(int j = 0; j < soma[0].length; j++ ) {
					soma[i][j] = A[i][j]+B[i][j];
				}
			}
			System.out.printf("Os elementos da soma das matrizes A e B são:\n");
			for(int i = 0; i < soma.length; i++ ) {
				for(int j = 0; j < soma[0].length; j++ ) {
					System.out.printf("%.2f\t", soma[i][j]);
				}
				System.out.println();
			}
		}
		else if(opcao == '2') {
			for(int i = 0; i < subtrai.length; i++ ) {
				for(int j = 0; j < subtrai[0].length; j++ ) {
					subtrai[i][j] = A[i][j]-B[i][j];
				}
			}
			System.out.printf("Os elementos da subtração das matrizes A e B são:\n");
			for(int i = 0; i < subtrai.length; i++ ) {
				for(int j = 0; j < subtrai[0].length; j++ ) {
					System.out.printf("%.2f\t", subtrai[i][j]);
				}
				System.out.println();
			}
		}
		else if(opcao == '3') {
			System.out.println("Digite uma constante: ");
			constante = leia.nextDouble();
			for(int i = 0; i < subtrai.length; i++ ) {
				for(int j = 0; j < subtrai[0].length; j++ ) {
					A[i][j] += constante;
					B[i][j] += constante;
				}
			}
			System.out.printf("Os elementos da matriz A, somados com a constante, são:\n");
			for(int i = 0; i < A.length; i++ ) {
				for(int j = 0; j < A[0].length; j++ ) {
					System.out.printf("%.2f\t", A[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.printf("Os elementos da matriz B, somados com a constante, são:\n");
			for(int i = 0; i < B.length; i++ ) {
				for(int j = 0; j < B[0].length; j++ ) {
					System.out.printf("%.2f\t", B[i][j]);
				}
				System.out.println();
			}
		}
		else {
			System.out.printf("Os elementos da matriz A são:\n");
			for(int i = 0; i < A.length; i++ ) {
				for(int j = 0; j < A[0].length; j++ ) {
					System.out.printf("%.2f\t", A[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.printf("Os elementos da matriz B são:\n");
			for(int i = 0; i < B.length; i++ ) {
				for(int j = 0; j < B[0].length; j++ ) {
					System.out.printf("%.2f\t", B[i][j]);
				}
				System.out.println();
			}
			
		}
	}
}
