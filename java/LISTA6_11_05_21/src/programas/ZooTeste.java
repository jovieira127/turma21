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
		System.out.println("Som característico:");
		cavalo1.emitirSom();
		System.out.println("Ação característica:");
		cavalo1.acionarMovimento();
		System.out.println();
		System.out.println("Cachorro com nome "+cachorro1.getNome()+" e idade "+cachorro1.getIdade());
		System.out.println("Som característico:");
		cachorro1.emitirSom();
		System.out.println();
		System.out.println("Preguiça com nome "+preguica1.getNome()+" e idade "+preguica1.getIdade());
		System.out.println("Som característico:");
		preguica1.emitirSom();
		
	}
	
	
}
