package classes;

public class PessoaFisica extends Pessoa {
	private String cpf;

	public PessoaFisica(String nome, String pais, char genero, int anoNascimento, String cpf,
			String usuario, String senha) {
		super(nome, pais, genero, anoNascimento, usuario, senha);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
