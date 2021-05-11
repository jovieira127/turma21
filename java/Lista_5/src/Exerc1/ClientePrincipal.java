package Exerc1;

public class ClientePrincipal {
 public static void main(String[] args) {
	Cliente cliente1 = new Cliente("Jonatas",'M',"123.123.123-12", "123456789");
	cliente1.calcularIdade(1994);
	cliente1.escolherSetor("Informática");
	cliente1.escolherProduto("Notebook");
	cliente1.imprimeFicha();	
}
}
