package Exerc2;

public class Aviao {
	public String tipoDeAviao;
	public double velocidadeAtual;
	public double velocidadeMax;
	public double quantidadeCombustivel;
	public double pesAltura;
	
	public Aviao(String tipoDeAviao,double velocidadeAtual,double quantidadeCombustivel,double pesAltura) {
		this.tipoDeAviao = tipoDeAviao;
		this.velocidadeAtual = velocidadeAtual;
		this.pesAltura = pesAltura;
	}
	void aumentarVelocidade(double aceleracao) {
		double vf = 0.00;
		vf = velocidadeAtual*aceleracao;
		velocidadeAtual = vf;	
	}
	void definirVelocidadeMax() {
		if(tipoDeAviao == "PAULISTINHA") {
			velocidadeMax = 155;
		}
		if(tipoDeAviao == "AIRBUS") {
			velocidadeMax = 875;
		}
		if(tipoDeAviao == "BOIENG") {
			velocidadeMax = 278;
		}
	}
	void mostrarSituacao() {
		System.out.println("----------- PAINEL DE CONTROLE -----------");
		System.out.printf("Avião %s -> V máx = %.2f km/h\n",tipoDeAviao, velocidadeMax);
		System.out.printf("%.3f litros de querosene\n", quantidadeCombustivel);
		System.out.printf("%.2f pés de altura\n",pesAltura);
		System.out.println("\n");
	}
}
	
