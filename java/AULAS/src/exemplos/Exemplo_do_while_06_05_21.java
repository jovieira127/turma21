package exemplos;

import java.util.Scanner;

public class Exemplo_do_while_06_05_21 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		int numero = 233;
		
		/*
		 * faca 
		{ 
			se(numero >= 300 e numero <=400){

				escreva(numero , " + 3 = ")
			numero = numero +3
			escreva(numero,"\n")
			}
			
			se (numero >=233 e numero <300 ou numero >400 e numero < 456)
			{
				escreva(numero , " + 5 = ")
				numero = numero +5
		escreva(numero,"\n") 
				}
				
			
		} enquanto (numero >= 233 e numero <456)
		 */
		
		do 
		{
			if(numero >= 300 && numero <=400){

			System.out.printf(" + 3 = %d ", numero);
			numero = numero +3;
			System.out.println();
			}
			
			if (numero >=233 && numero <300 || numero >400 && numero < 456)
			{
				System.out.printf( " + 5 = %d", numero);
				numero = numero +5;
				System.out.println();
			}
			
		} while (numero >= 233 && numero <456);
		
		ler.close();
	}

}
