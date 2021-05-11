package classes;

public class Estudante {
	//atributos
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	
	//construtores
	public Estudante(int matricula, String cpf) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}
	//sobrecarga de construtor

	public Estudante(int matricula, String cpf, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.status = status;
	}

	public Estudante(int matricula, String cpf, double pontos, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.pontos = pontos;
		this.status = status;
	}
	// encapsulamento - get & set
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getPontos() {
		return pontos;
	}

	public void setPontos(double pontos) {
		this.pontos = pontos;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	// metodo
	public void adicionarNota(double pontos) {
		this.pontos += pontos;
	}
	public void tirarNotas(double pontos) {
		this.pontos -= pontos;
		
	}
	
	
	

}
