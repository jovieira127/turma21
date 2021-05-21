package exemplos;

import java.util.Scanner;

public class Exemplo_while_06_05_21 
{
	//main CTRL + enter 
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int numero=1, somatorio=0, totalValoresLidos=0, qtdVezes=0;
		double media=0.00;
		
		/*enquanto (numero != 0)
		{
			escreva ("Informe um numero positivo: ")
			leia (numero)

		somatorio = somatorio + numero

			se (numero>0)
			{
				totalValoresLidos++
			}

		media = somatorio / totalValoresLidos
		
		}*/
		
		while (numero >= 0)
		{
			System.out.println("Informe um numero positivo: ");
			numero = ler.nextInt();
			
			somatorio = somatorio + numero;
			
			if (numero>0)
			{
				totalValoresLidos++;
			}	
			
		}
		
		media = somatorio / totalValoresLidos;
		
		System.out.printf("\nA soma dos valores informados é de: %d", somatorio);
		System.out.printf("\nA quantidade de vezes que foram informados numeros diferente de 0 foi de: %d vezes",totalValoresLidos);
		System.out.printf("\nA média dos numeros informados é: %.2f ", media);
		ler.close();
	}

}
