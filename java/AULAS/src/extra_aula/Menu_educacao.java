package extra_aula;

import java.util.Scanner;

public class Menu_educacao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//public void mestrado() {
			int matricula = 0;
			String cpf = "";
			String status = "";
			char continuar = ' ';
			double creditoMestrado = 10.0;
			double notas[] = new double [10]; 
			double creditoAuxiliar = 0.0;
			char creditoCondicao;
			
			imprimeDadosEscola();
			System.out.println();
			System.out.println();
			System.out.println("ENSINO MESTRADO");
			obterDadosEstudante(matricula, cpf, status);
			
			
			for (int x=0; x<10; x++){
				imprimeDadosEscola();
				System.out.println();
				System.out.println();
				System.out.println("ENSINO MESTRADO");
				imprimeDadosEstudante(matricula, cpf, status);
				tela2(notas, x);
				System.out.print("Continuar S/N: ");
				continuar = leia.next().toUpperCase().charAt(0);
				if(creditoMestrado > 0){
					System.out.print("Deseja utilizar o crédito mestrado? (S/N): ");
					creditoCondicao = leia.next().toUpperCase().charAt(0);;
					if (creditoCondicao == 'S'){
						System.out.print("Qual o valor do crédito que deseja utilizar? ")
						creditoAuxiliar = leia.nextDouble();
						creditoMestrado-=creditoAuxiliar;
						adicionarNota(notas, x, notas[x] + creditoAuxiliar);
					}
				}
				if (continuar == 'N'){
					imprimeDadosEstudante(matricula, cpf, status);
					System.out.println();
					escreva("Nota final: ", somarNotas(notas));
					break;
				}
			}
			imprimeDadosEscola();
			System.out.println();
			System.out.println();
			System.out.print("\n\nENSINO MESTRADO");
			imprimeDadosEstudante(matricula, cpf, status);
			System.out.print("\nNota final: ", somarNotas(notas));
		}

	}

