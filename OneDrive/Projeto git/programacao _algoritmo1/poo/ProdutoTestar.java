package poo;

public class ProdutoTestar {
	public static void main(String[] args) {
		// construtor padrão
		Produto p1 = new Produto();
		p1.nome = "Caneta Preta";
		p1.marca = "Bic";
		p1.valor = 1.50f;
		
		//construtor de dois parâmetros
		Produto p2 = new Produto("Caneta", "Faber");
		p2.valor = 1.67f;
		
		// construtor com três parâmetros
		Produto p3 = new Produto("Borracha", "Mercur",1.86f);
		
		
		// Objeto
		System.out.println("Nome: " + p1.nome + "/" + "marca:" + p1.marca + "/" + "valor:" + p1.valor + "/");
		
		System.out.println("Nome: " + p2.nome + "/" + "marca:" + p2.marca + "/" + "valor:" + p2.valor + "/");
		
		System.out.println("Nome: " + p3.nome + "/" + "marca:" + p3.marca + "/" + "valor:" + p3.valor + "/");
		
		
	}

}
