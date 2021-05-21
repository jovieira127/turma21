package classes;
import java.util.ArrayList;
import java.util.List;

public class Administrador extends Pessoa {

	private List<Doacao> doacoes = new ArrayList<>();

	public Administrador(String nome, String pais, char genero, int anoNascimento, String usuario,
			String senha) {
		super(nome, pais, genero, anoNascimento, usuario, senha);
	}

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void exibirDoacoes() {
		System.out.println("CÓDIGO | NOME | VALOR | DATA | HORA ");
		for (Doacao doacao : doacoes) {
			System.out.println(doacao);
		}

	}

	public int totalDoadores() {

		List<Doacao> compDoacao = new ArrayList<Doacao>(doacoes);
		for (int i = 0; i < doacoes.size(); i++)
			if (compDoacao.get(i).equals(doacoes.get(i))) {
				compDoacao.remove(i);
			}
		return compDoacao.size();

	}

	public Doacao maiorDoacao () {
		double maiorDoacao=0;
		Doacao dinheiro= new Doacao();
		for(Doacao cao: doacoes) {
			if(cao.getValor()>maiorDoacao) {
				maiorDoacao=cao.getValor();
				dinheiro=cao;
		}	
		}

		return dinheiro;
	}

	public void fazerDoacao(Doacao dinheiro) {
		doacoes.add(dinheiro);
	}

	public double somaDoacoes() {
		double somaDoacoes = 0;
		for (Doacao doacao : doacoes) {
			// somaDoacoes = (somaDoacoes + doacao.getValor());
			somaDoacoes += doacao.getValor();
		}
		return somaDoacoes;
	}
}
