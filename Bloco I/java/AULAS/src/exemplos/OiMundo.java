package exemplos;

import java.util.Scanner;

public class OiMundo {
	public static void main(String[] args) {
		System.out.println("Oi mundo!!!");
		System.out.println("Jonatas Michel Cardoso Vieira");
		// variaveis
		int numero1=10;
		int numero2=30;
		double salario = 1225.25;
		char op = 'S';
		String nome;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Soma "+(numero1+numero2));
		
		System.out.println("Digito o nome: ");
		nome = leia.next();
		System.out.println("digite o numero 1: ");
		numero1 = leia.nextInt();
		System.out.println("digite o numero 2: ");
		numero2 = leia.nextInt();
		System.out.println("digite o salario: ");
		salario = leia.nextDouble();
		
		System.out.println(nome+" a soma é "+(numero1+numero2)+" e o salário é R$ "+salario);
		
		
	}

}
