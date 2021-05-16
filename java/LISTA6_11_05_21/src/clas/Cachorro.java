package clas;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	public void emitirSom() {
		System.out.println("Som do animal: Au Au Au...");
		
	}
	@Override
	public void movimentar() {
		System.out.println("Movimento do animal: Correndo...");
	}
}
