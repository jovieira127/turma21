package exercicios;

import java.util.Scanner;

public class Litas1_exerc1_04_05_21 {
	public static void main(String[] args) {
		//Nome:Calculadora de sistemas lineares Objetivo: resolver um sistema linear 2x2
		// vari�veis
		double a, b, c, d, e, f, x, y;
		Scanner leia = new Scanner(System.in);
		//entradas
		System.out.println("Digite o coeficiente a1 da primeira equa��o linear: ");
		a = leia.nextDouble();
		System.out.println("Digite o coeficiente b1 da primeira equa��o linear: ");
		b = leia.nextDouble();
		System.out.println("Digite o resultado da primeira equa��o linear: ");
		c = leia.nextDouble();
		System.out.println("Digite o coeficiente a2 da segunda equa��o linear: ");
		d = leia.nextDouble();
		System.out.println("Digite o coeficiente b2 da segunda equa��o linear: ");
		e = leia.nextDouble();
		System.out.println("Digite o resultado da segunda equa��o linear: ");
		f = leia.nextDouble();
		//processamento
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		//sa�da
		System.out.println("Resolu��o do sistema linear:");
		System.out.println("("+a+")x + ("+b+")y = "+c);
		System.out.println("("+d+")x + ("+e+")y = "+f);
		System.out.println("x = "+x);
		System.out.println("x = "+y);
		//fim
	}

}
