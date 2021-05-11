package Exerc2;

public class AviaoPrincipal {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao("PAULISTINHA",200,100,25000);
		Aviao aviao2 = new Aviao("AIRBUS",100,150,30000);
		Aviao aviao3 = new Aviao("BOIENG",150,110,27000);
		aviao1.aumentarVelocidade(60);
		aviao2.aumentarVelocidade(47);
		aviao3.aumentarVelocidade(51);
		aviao1.mostrarSituacao();
		aviao2.mostrarSituacao();
		aviao3.mostrarSituacao();
	}

}
