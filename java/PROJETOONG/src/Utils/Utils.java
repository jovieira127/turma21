package Utils;
import classes.Administrador;
import classes.Doacao;
import classes.PessoaFisica;

public class Utils {

	public static void iniciarDoacoes(Administrador adm) {
		Doacao doacao1 = new Doacao(1111, 400,
				new PessoaFisica("Jonathan Almeira", "Brasil", 'M', 1995,
						"222.222.222-22", "jonathan", "123"));
		Doacao doacao2 = new Doacao(222, 500,
				new PessoaFisica("Maria Luiza", "Brasil", 'F', 1999,
						"111.111.111-11", "maria", "123"));
		Doacao doacao3 = new Doacao(3333, 600,
				new PessoaFisica("Vinicius Lopes", "Brasil", 'M', 1981,
						"333.333.333-33", "vinicius", "123"));
		Doacao doacao4 = new Doacao(1111, 400,
				new PessoaFisica("Fernanda Almeida", "Brasil", 'F', 1988,
						"444.444.444-44", "fernanda", "123"));
		adm.fazerDoacao(doacao1);
		adm.fazerDoacao(doacao2);
		adm.fazerDoacao(doacao3);
		adm.fazerDoacao(doacao4);
	}
}