package poo;

public class Carro {
	//Atributos
	String modelo;
	int ano;
	
	// Construtores	
	Carro(){
	}
    Carro(String modelo){
    	this.modelo=modelo;
    }
    Carro(String modelo,int ano) {
    	this.modelo=modelo;
    	this.ano=ano;
    }
}
