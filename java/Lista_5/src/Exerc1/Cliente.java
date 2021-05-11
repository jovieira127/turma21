package Exerc1;

public class Cliente {
	public String nome;
	public char genero;
	public int idade;
	public String cartao;
	public String cpf;
	public String setor;
	public String produto;
	
	public Cliente(String nome, char genero, String cpf, String cartao) {
		this.nome = nome;
		this.genero = genero;
		this.cpf = cpf;
		this.cartao = cartao;
	}
	void calcularIdade(int anoDeNasc) {
		idade = 2021 - anoDeNasc;
	}
	void escolherSetor(String setor) {
		this.setor = setor;
	}
	void escolherProduto(String produto) {
		this.produto = produto;
	}
	void imprimeFicha() {
		System.out.println("*********DADOS PESSOAIS*********");
		System.out.printf("Nome: %s\n", nome);
		System.out.printf("CPF: %s\n", cpf); 
		System.out.printf("idade: %d\n", idade);
		System.out.printf("Gênero: %s\n", genero);
		System.out.println("*********DADOS COMPRA*********");
		System.out.printf("Nº Cartão: %s\n", cartao);
		System.out.printf("Setor: %s\n", setor);
		System.out.printf("Produto: %s\n", produto);
	}
}
