package classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Doacao {
	private int codigo;
	private double valor;
	private LocalDateTime dataHora;
	private Pessoa autor;

	public Doacao() {

	}

	public Doacao(int codigo, double valor, Pessoa autor) {
		this.codigo = codigo;
		this.valor = valor;
		this.autor = autor;
		this.dataHora = LocalDateTime.now();

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;

	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Pessoa getPessoa() {
		return autor;
	}

	public void setPessoa(Pessoa autor) {
		this.autor = autor;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public double converterMoeda() {
		return 0;
	}

	@Override
	public String toString() {
		String hora = dataHora.format(DateTimeFormatter.ofPattern("HH:mm"));
		String data = dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return codigo + " " + autor.getNome() + " " + valor + " " + data + " " + hora;
	}
}
