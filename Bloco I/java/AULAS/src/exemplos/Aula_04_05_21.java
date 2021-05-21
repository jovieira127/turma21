package exemplos;

import java.util.Scanner;

public class Aula_04_05_21 {
	public static void main(String[] args) {
		//Variaveis
		String nome="";
		int anoNascimento=0;
		char genero=' ';
		
		Scanner leia = new Scanner(System.in);
		
		//Entradas
		System.out.println("Escreva seu nome: ");
		nome = leia.next();
		System.out.println("Ano nascimento: ");
		anoNascimento = leia.nextInt();
		
		anoNascimento = 2021 - anoNascimento;
		
		System.out.println("Genero: M-masculino F-feminino O-outro: ");
		genero = leia.next().charAt(0);
		
		System.out.println("Ola "+nome+" você tem "+anoNascimento+" anos, e se identifica como "+genero);
	}
}
