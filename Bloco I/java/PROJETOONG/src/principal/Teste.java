package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Utils.Utils;
import classes.Administrador;
import classes.Doacao;
import classes.Pessoa;
import classes.PessoaFisica;
import classes.PessoaJuridica;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Administrador adm = new Administrador("Adm", "Brasil", 'M', 1989, "admin", "admin");
		List<Pessoa> usuarios = new ArrayList<>();
		Utils.iniciarDoacoes(adm);
		System.out.println("==== SEJA BEM VINDO - ONG GIRL POWER ====");
		char opcaoSair = ' ';
		while(opcaoSair != 'S') {
			System.out.println("\n1- Entrar como ADM\n2- Entrar\n3-Cadastrar");
			char opcao = leia.next().toUpperCase().charAt(0);
			if(opcao == '1') {
				String usuario;
				String senha;
				do {
					System.out.print("Usuário: ");
					usuario = leia.next();
					System.out.print("Senha: ");
					senha = leia.next();
				} while(!(usuario.equals(adm.getUsuario())) && !(senha.equals(adm.getSenha())));
				
				System.out.println("\n==== SEJA BEM VINDO ADMIN ====");
				System.out.printf("TOTAL DE DOAÇÕES: %.2f", adm.somaDoacoes());
				System.out.println("\n1-Ver Doacoes");
				char opAdmin = leia.next().toUpperCase().charAt(0);
				
				if(opAdmin == '1') {
					adm.exibirDoacoes();
				}
			} else if(opcao == '3') {
				
				System.out.println("Você é uma pessoa física ou jurídica? [1 - SIM | 2 - NÃO] ");
				char opcaoPessoa = leia.next().toUpperCase().charAt(0);
				
				System.out.print("Nome: ");
				leia.nextLine();
				String nome = leia.nextLine();
				
				System.out.print("País: ");
				String pais = leia.next();
				
				System.out.print("Gênero: ");
				char genero = leia.next().toUpperCase().charAt(0);
				
				System.out.print("Ano nascimento: ");
				int anoNasc = leia.nextInt();
				
				System.out.print("Usuário: ");
				String usuario = leia.next();
				
				System.out.print("Senha: ");
				String senha = leia.next();
				
				if(opcaoPessoa == '1') {
					System.out.print("CPF: ");
					String cpf = leia.next();
					usuarios.add(new PessoaFisica(nome, pais, genero,
							anoNasc, cpf, usuario, senha));
				} else {
					System.out.print("CNPJ: ");
					String cnpj = leia.next();
					usuarios.add(new PessoaJuridica(nome, pais, genero,
								anoNasc, cnpj, usuario, senha));
				}
				
			} else {
				String usuario;
				String senha;
				Pessoa pessoa;
				do {
					System.out.print("Usuário: ");
					usuario = leia.next();
					System.out.print("Senha: ");
					senha = leia.next();
					pessoa = fazerLogin(usuarios, usuario, senha);
				} while(pessoa == null);
				
				System.out.print("1- Fazer doação ");
				char opcaoDoacao = leia.next().toUpperCase().charAt(0);
				if(opcaoDoacao == '1') {
					System.out.print("\nValor: ");
					double valor = leia.nextDouble();
					
					adm.fazerDoacao(new Doacao(adm.getDoacoes().size() + 2,
							valor, pessoa));
					System.out.println("\nObrigado...");
				} 
			}
		}
	}
	
	public static Pessoa fazerLogin(List<Pessoa> usuarios,
			String usuario, String senha) {
		for(Pessoa pessoa : usuarios) {
			if(pessoa.getUsuario().equals(usuario) && pessoa.getSenha().equals(senha)) {
				return pessoa;
			}
		}
		return null;
	}

}
