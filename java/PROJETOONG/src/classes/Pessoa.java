package classes;

import java.time.Year;

public abstract class Pessoa {
	
	private String nome;
	private String pais;
	private	char genero;
	private int anoNascimento;
	private String usuario;
	private String senha;
	
	
	public Pessoa(String nome, String pais, char genero, int anoNascimento,
			String usuario, String senha) {
		this.nome = nome;
		this.pais = pais;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
		this.usuario = usuario;
		this.senha = senha;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNasc(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public int calcularIdade () {
		return Year.now().getValue() - anoNascimento;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}


