package exercicios;

import java.util.Scanner;

public class Lista1_exerc2_04_05_21 {
	public static void main(String[] args) {
		//Nome:Calculadora de idade Objetivo: Converter dias totais para anos, meses e dias  
			// variáveis
				int diasEntrada,aux, idadeAnos, idadeDias, idadeMeses;
				final int ANO = 365;
				final int MES = 30;
				Scanner leia = new Scanner(System.in);
			//entradas
				System.out.println("Digite a sua idade em dias: ");
				diasEntrada = leia.nextInt();
			//processamento
				idadeAnos = diasEntrada/ANO;
				aux = diasEntrada%ANO;
				idadeMeses = aux/MES;
				idadeDias = aux%MES;
				
			//saída
				System.out.println("A sua idade é "+idadeAnos+" ano(s) "+idadeMeses+" mes(es) " +idadeDias+ " dia(s) ");
			//fim
	}

}
