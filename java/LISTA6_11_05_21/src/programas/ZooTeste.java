package programas;

import clas.Animal;
import clas.Cachorro;
import clas.Cavalo;
import clas.Preguica;

public class ZooTeste {
	public static void main(String[] args) {
		Cavalo cavalo1 = new Cavalo("Alas�o", 10);
		Animal cachorro1 = new Cachorro("Bob", 5);
		Animal preguica1 = new Preguica("Flash", 7);
		System.out.println("Cavalo com nome "+cavalo1.getNome()+" e idade "+cavalo1.getIdade());
		System.out.println("Som caracter�stico:");
		cavalo1.emitirSom();
		System.out.println("A��o caracter�stica:");
		cavalo1.acionarMovimento();
		System.out.println();
		System.out.println("Cachorro com nome "+cachorro1.getNome()+" e idade "+cachorro1.getIdade());
		System.out.println("Som caracter�stico:");
		cachorro1.emitirSom();
		System.out.println();
		System.out.println("Pregui�a com nome "+preguica1.getNome()+" e idade "+preguica1.getIdade());
		System.out.println("Som caracter�stico:");
		preguica1.emitirSom();
		
	}
	
	
}
