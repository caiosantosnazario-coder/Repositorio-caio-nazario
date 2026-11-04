package poo;

public class TestarCarro {

	public static void main(String[] args) {
		// Constutor padrão
		Carro p1 = new Carro();
		p1.modelo = "Corvette C8 Z06";
		p1.ano = 2023;
		
		//construtor
		Carro p2 = new Carro("McLaren Senna");
		p2.ano = 2018;
		
		//construtor com dois parâmetros
		Carro p3 = new Carro("Ferrari", 1996);
		
		//Objeto
		System.out.println("Modelo: " + p1.modelo + "/" + "ano: " + p1.ano + "/" );
		
		System.out.println("Modelo: " + p2.modelo + "/" + "ano: " + p2.ano + "/" );
		
		System.out.println("Modelo: " + p3.modelo + "/" + "ano: " + p3.ano + "/" );

	}

}
