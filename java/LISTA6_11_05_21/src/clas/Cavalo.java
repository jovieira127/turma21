package clas;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	public void emitirSom() {
		System.out.println("Som do animal: Hiin in in...");
		
	}
	@Override
	public void movimentar() {
		System.out.println("Movimento do animal: Correndo...");
	}
}
