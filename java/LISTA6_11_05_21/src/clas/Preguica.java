package clas;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	public void emitirSom() {
		System.out.println("Som do animal: Grrr Grrau...");
		
	}
	@Override
	public void movimentar() {
		System.out.println("Movimento do animal: Subindo em árvores...");
		}
}
