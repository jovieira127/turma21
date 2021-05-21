package classes;

public class Basico extends Estudante {
	private int diaAniversario;
	// construtor 
	public Basico(int matricula, String cpf, int diaAniversario) {
		super(matricula, cpf);
		this.diaAniversario = diaAniversario;
	}
	// sobrecarga
	public Basico(int matricula, String cpf, boolean status, int diaAniversario) {
		super(matricula, cpf, status);
		this.diaAniversario = diaAniversario;
	}
	public Basico(int matricula, String cpf, double pontos, boolean status, int diaAniversario) {
		super(matricula, cpf, pontos, status);
		this.diaAniversario = diaAniversario;
	}
	// get & set
	public int getDiaAniversario() {
		return diaAniversario;
	}
	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	//metodo
	public void bonusAniversario(int dia) {
		if(diaAniversario == dia) {
			super.adicionarNota((super.getPontos()*0.1));
		}
	}
	

}
