programa
{
	inclua biblioteca Matematica --> mat

	inclua biblioteca Util
	
	funcao inicio()
	{
		tela1()
	}

	funcao tela1(){
		
		inteiro opcao
		caracter inclusaoAluno

		enquanto(verdadeiro){
		imprimeDadosEscola()
		
		escreva("\n----------------------------------------")
		escreva("\n1-BÁSICO\n2-MÉDIO\n3-GRADUAÇÃO\n4-PÓS\n5-MESTRADO\n6-SAIR")
		escreva("\nDIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ")
		leia(opcao)
		
		menu(opcao)
		
		escreva("\nGostaria de incluir outro aluno? [S - SIM |N - NÃO]")
		leia(inclusaoAluno)
		se(inclusaoAluno == 'n' ou inclusaoAluno == 'N'){
			pare
		
		}
	   }
	}


	funcao menu(inteiro opcao) {
		escolha(opcao)
		{
			caso 1:
		       basico()
		       pare
		     caso 2:
		        medio()
		        pare
		     caso 3:
		        graduacao()
		        pare
		     caso 4:
		        pos()
		        pare
		     caso 5:
		        mestrado()
		     caso 6:
		        pare
		}
	}

	funcao imprimeDadosEscola() {
		escreva("\nDream Team G1")
		escreva("\nSeu futuro como prioridade")
	}

	funcao imprimeDadosEstudante(inteiro matricula, cadeia cpf, cadeia status) {
		escreva("\nMatricula: ", matricula)
		escreva("\nCPF: ", cpf)
		escreva("\nStatus: ", status)
	}

	funcao obterDadosEstudante(inteiro &matricula, cadeia &cpf, cadeia &status) {
		escreva("\n\nMatricula: ")
		leia(matricula)
		escreva("CPF: ")
		leia(cpf)
		inteiro statusEmNumero = 0
		escreva("Status: ")
		leia(statusEmNumero)
		se(statusEmNumero == 1) {
			status = "Ativo"
		} senao {
			status = "Inativo"
		}
	}

	funcao tela2(real notas[], inteiro &indiceLaco) {

			real somaNotas = somarNotas(notas)
			caracter movimento = ' '
			real valorMovimento = 0.0
			escreva("\nNota Atual: ", somaNotas)
			escreva("\nMovimento: ", (indiceLaco+1))
			escreva("\nMOVIMENTO - I-inclusão de nota ou R-retirada nota: ")
			leia(movimento)
			escreva("Valor movimento: ")
			leia(valorMovimento)
			se(movimento == 'I' ou movimento == 'i') {
				adicionarNota(notas, indiceLaco, valorMovimento)
			} senao se (movimento == 'R' ou movimento == 'r'){
				se((somaNotas - valorMovimento) >= 0) {
				   tirarNota(notas, indiceLaco,  valorMovimento)
				} senao {
					escreva("\nValor inválido! A nota não pode ficar negativada!")
				}
			} senao {
				escreva("\nResposta inválida! Movimentos possíveis são inclusão ou retirada! ")
				indiceLaco--
			} 
		}
	

funcao basico() {
		real nota[10]
		inteiro diaHoje=0
		inteiro mesAniversario=0
		inteiro diaAniversario=0
		real notaComBonus=0.0
		real somaNotas=0.0
		real notaFinal=0.0
		inteiro mesHoje=0
		inteiro matricula=0
		cadeia cpf=" "
		cadeia status=" "

			imprimeDadosEscola()
            	obterDadosEstudante(matricula,cpf,status) 
            	
            	
			escreva("Que dia você faz aniversário? Escreva somente o número do dia \n")
			leia(diaAniversario)
			escreva("Hoje é qual dia do mês? \n")
			leia(diaHoje)
 
			para(inteiro x=0;x<10;x++){		
				tela2(nota, x)
				somaNotas=somarNotas(nota)
				caracter resposta= ' '
				
				se(x<9){
					escreva("Deseja continuar? S-sim; N-não\n")
					leia(resposta)
				}
				se(x==9  ou (resposta =='n' ou resposta =='N') ){
						se(diaAniversario==diaHoje){
						notaComBonus=mat.arredondar((somaNotas*1.1),2)
						escreva("É seu aniversário! Sua pontuação teve um acréscimo de 10% e agora é:"+notaComBonus+"\n")
						adicionarNota(nota,x,notaComBonus)		
						}
						senao{
							escreva("A nota final é "+somaNotas+"\n")
						}
						pare			
				
					
					
		}
			}
	}





	funcao medio() {

		caracter movimento
		real valorMovimento[10]
		real notas [10]
		real somaNotas=0.00
		real subNotas=0.00
		real total = 0.00
		inteiro matricula = 0
		cadeia cpf = ""
		cadeia status = ""
		
	
			imprimeDadosEscola()
			escreva("\n\nENSINO MÉDIO")
	
			obterDadosEstudante(matricula, cpf, status)		
			
		para (inteiro x=0; x<10; x++){
				tela2(notas, x)
			
				caracter respostaContinuar = ' '
				se(x < 9) {
					escreva("\nDeseja continuar? [S|N] ")
					leia(respostaContinuar)
				}
	
				se(x == 9 ou (respostaContinuar =='n' ou respostaContinuar =='N')){
					pare
				}
				
		
			}
				para (inteiro i = 0; i<2; i++){
	
				caracter respostaBoletim
				escreva("\nDeseja imprimir boletim de notas? ")
				
				leia(respostaBoletim)
				 se(respostaBoletim == 's' ou respostaBoletim == 'S'){
				 
				     para (inteiro x=0; x<10; x++){
				      escreva("\n",notas[x])
				     }
				     
				     }senao {
				 	escreva("FIM")
					 
				}
				
		}	


	}

funcao graduacao() {	
		
			caracter movimento = ' '
			real valorMovimento = 0.0
			real notas [10]
			real somaNotas = somarNotas(notas)
			real totalNotas = 0.0
			real valorBonus = 0.0
			real parametro = 2.0
			inteiro matricula = 0
			cadeia cpf = ""
			cadeia status = ""
			caracter continuar
			imprimeDadosEscola() 
			escreva("\n\nENSINO GRADUAÇÃO")
		 	obterDadosEstudante(matricula, cpf,status)
		 	
			para(inteiro x=0; x<10; x++){
				imprimeDadosEscola()
				escreva("\n\nENSINO GRADUAÇÃO")
				imprimeDadosEstudante(matricula, cpf,status)
				
			somaNotas = somarNotas(notas)
			escreva("\nNota Atual: ", somaNotas)
			escreva("\nMovimento: ", (x+1))
			escreva("\nMOVIMENTO - I-inclusão de nota ou R-retirada nota: ")
			leia(movimento)
			escreva("Valor movimento: ")
			leia(valorMovimento)
			se(movimento == 'I' ou movimento == 'i') {
				adicionarNota(notas, x, valorMovimento)
			} senao se (movimento == 'R' ou movimento == 'r'){
				tirarNota(notas,x,valorMovimento)	
			} 
			senao {
				escreva("\nResposta inválida! Movimentos possíveis são inclusão ou retirada! ")
				x--
			}
			escreva("Continuar S/N: ")
			leia(continuar)
			totalNotas= somarNotas(notas)
			se (totalNotas<0 ){
				se(parametro> 0){
				escreva("digite o valor do bonus de[0 a 2]")
				leia(valorBonus)
				adicionarNota(notas,x,notas[x]+valorBonus)
				parametro-=valorBonus
					
				}
				
			}
			se(continuar == 'N' ou continuar == 'n'){
				se(somarNotas(notas)<0.0){
					imprimeDadosEstudante(matricula, cpf, status)
					escreva("\nNota final : 0.0")
				}
				senao{
				imprimeDadosEstudante(matricula, cpf, status)
				escreva("\nNota final: ", somarNotas(notas))
				}
				pare
			}		
		}
		imprimeDadosEscola()
		escreva("\n\nENSINO GRADUAÇÃO")
		imprimeDadosEstudante(matricula, cpf, status)
		escreva("\nNota final: ", somarNotas(notas))
	}


	funcao pos() {
		caracter movimento
		real valorMovimento
		real notas[10]
		inteiro matricula = 0
		cadeia cpf = ""
		cadeia status = ""

		imprimeDadosEscola()
		escreva("\n\nENSINO PÓS")

		obterDadosEstudante(matricula, cpf, status)

		
		
		para(inteiro i = 0; i < 10; i++) {
			tela2(notas, i)
			caracter respostaContinuar = ' '
			se(i < 9) {
			    escreva("\nDeseja continuar? [S|N] ")
			    leia(respostaContinuar)
			} 
			
			se(i == 9 ou (respostaContinuar == 'n' ou respostaContinuar == 'N')) {
				caracter respostaBonus
				escreva("\nDeseja utilizar o bônus? [S|N] ")
				leia(respostaBonus)
				se (respostaBonus == 'S' ou respostaBonus == 's') {
					real bonus = 0.0
					escreva("\nQual valor que deseja usar do bônus? [Máximo 5] ")
					leia(bonus)
					se(bonus <= 5) {
						adicionarNota(notas, i, notas[i] + bonus)
					} senao {
						escreva("\nVocê perdeu o bônus pois digitou um valor inválido!")
					}
				}
				imprimeDadosEstudante(matricula, cpf, status)
				escreva("\nNota final: ", somarNotas(notas))
				pare
			}
		}
	}

	funcao mestrado() {
		inteiro matricula = 0
		cadeia cpf = ""
		cadeia status = ""
		caracter continuar = ' '
		real creditoMestrado = 10.0
		real notas [10] 
		real creditoAuxiliar = 0.0
		caracter creditoCondicao
		
		imprimeDadosEscola()
		escreva("\n\nENSINO MESTRADO")
		obterDadosEstudante(matricula, cpf, status)
		
		
		para (inteiro x=0; x<10; x++){
			imprimeDadosEscola()
			escreva("\n\nENSINO MESTRADO")
			imprimeDadosEstudante(matricula, cpf, status)
			tela2(notas, x)
			escreva("Continuar S/N: ")
			leia(continuar)
			se(creditoMestrado > 0){
				escreva("Deseja utilizar o crédito mestrado? (S/N): ")
				leia(creditoCondicao)
				se (creditoCondicao == 'S' ou creditoCondicao == 's'){
					escreva("Qual o valor do crédito que deseja utilizar? ")
					leia(creditoAuxiliar)
					creditoMestrado-=creditoAuxiliar
					adicionarNota(notas, x, notas[x] + creditoAuxiliar)
				}
			}
			se(continuar == 'N' ou continuar == 'n'){
				imprimeDadosEstudante(matricula, cpf, status)
				escreva("\nNota final: ", somarNotas(notas))
				pare
			}
		}
		imprimeDadosEscola()
		escreva("\n\nENSINO MESTRADO")
		imprimeDadosEstudante(matricula, cpf, status)
		escreva("\nNota final: ", somarNotas(notas))
	}
	
	funcao adicionarNota(real notas[], inteiro posicao, real valorParaAdicionar) {
		notas[posicao] = valorParaAdicionar
	}

	funcao tirarNota(real notas[], inteiro posicao, real valorParaTirar) {
		notas[posicao] = -valorParaTirar
	}


	funcao real somarNotas(real notas[]){
			real somaNotas=0.0
			para(inteiro x=0;x<Util.numero_elementos(notas);x++){
				somaNotas=somaNotas+notas[x]
			}
			retorne somaNotas
		}

}




/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 48; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */