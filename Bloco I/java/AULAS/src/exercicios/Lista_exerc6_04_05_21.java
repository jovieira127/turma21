package exercicios;

import java.util.Scanner;

public class Lista_exerc6_04_05_21 {
	public static void main(String[] args) {
		//Nome:Calculadora de distancia entre pontos Objetivo: Calcular a distancia entre 2 pontos dados
		// variáveis
		double x1, y1, x2, y2, d;
		Scanner leia = new Scanner(System.in);
		//entradas
		System.out.println("Digite a coordenada x do ponto P1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite a coordenada y do ponto P1: ");
		y1 = leia.nextDouble();
		System.out.println("Digite a coordenada x do ponto P2: ");
		x2 = leia.nextDouble();
		System.out.println("Digite a coordenada y do ponto P2: ");
		y2 = leia.nextDouble();
		//processamento
		d = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) );
		//saída
		System.out.println("A distância entre P1("+x1+","+y1+") e P2("+x2+","+y2+") é: "+d);
		//fim
	}

}
