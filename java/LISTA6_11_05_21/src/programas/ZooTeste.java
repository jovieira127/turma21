package programas;

import clas.Animal;
import clas.Cachorro;
import clas.Cavalo;
import clas.Preguica;

public class ZooTeste {
	public static void main(String[] args) {
		Cavalo cavalo1 = new Cavalo("Alasão", 10);
		Animal cachorro1 = new Cachorro("Bob", 5);
		Animal preguica1 = new Preguica("Flash", 7);
		System.out.println("Cavalo com nome "+cavalo1.getNome()+" e idade "+cavalo1.getIdade());
		cavalo1.emitirSom();
		cavalo1.movimentar();
		System.out.println();
		System.out.println("Cachorro com nome "+cachorro1.getNome()+" e idade "+cachorro1.getIdade());
		cachorro1.emitirSom();
		cachorro1.movimentar();
		System.out.println();
		System.out.println("Preguiça com nome "+preguica1.getNome()+" e idade "+preguica1.getIdade());
		preguica1.emitirSom();
		preguica1.movimentar();
	}
	
	
}
