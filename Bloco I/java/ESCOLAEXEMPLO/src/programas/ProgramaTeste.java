package programas;

import java.util.Scanner;

import classes.Basico;

public class ProgramaTeste {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		/* Estudante aluno1 = new Estudante(1234, "123.456.789-00");
		Estudante aluno2 = new Estudante(456, "789.123.456-11", true);
		Estudante aluno3 = new Estudante(456, "789.123.456-11", 32.5, true);
		
		System.out.println(aluno1.getCpf());
		
		aluno1.setCpf("789.456.123-99");
		System.out.println(aluno1.getCpf());
		
		System.out.println("digite a nota do aluno 1");
		double nota = leia.nextDouble();
		aluno1.adicionarNota(nota);
		System.out.printf("A nota do aluno cuja matricula é %d é %.2f", aluno1.getMatricula(), aluno1.getPontos());*/
		System.out.println("digite o numero da matricula");
		int matricula = leia.nextInt();
		System.out.println("digite o cpf");
		String cpf = leia.next();
		System.out.println("digite o dia de aniversário");
		int dia = leia.nextInt();
		System.out.println("digite a nota inicial");
		double nota = leia.nextDouble();
		
		Basico aluno1 = new Basico(matricula, cpf, dia);// instancia 
		aluno1.adicionarNota(nota);
		System.out.printf("Pontos atuais do aluno = %.2f\n", aluno1.getPontos());
		System.out.println("digite o dia de hoje");
		int diaAtual = leia.nextInt();
		aluno1.bonusAniversario(diaAtual);
		System.out.printf("Pontos atuais do aluno = %.2f (com bônus)", aluno1.getPontos());
		
	}

}
