package classes;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica(String nome, String pais, char genero, int anoNascimento, String cnpj,
			String usuario, String senha) {
		super(nome, pais, genero, anoNascimento, usuario, senha);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
