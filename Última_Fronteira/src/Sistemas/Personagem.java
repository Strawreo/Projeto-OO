package Sistemas;

public class Personagem {
	
	/*
	 * Criação da classe principal personagem que vai se derivar as classes de cada
	 * personagem criado aqui eu inicializei todos os atributos que cada personagem
	 * terá, mas os valores dos atributos serão atribuídos na classe de cada um
	 */
	String nome;
	int vida;
	int fome;
	int sede;
	int energia;
	int sanidade;
	int tamanhoInv;
	int localização;
	
	
	public Personagem(String nome, int vida, int fome, int sede, int energia, int sanidade, int tamanhoInv, int localização) {
		//Aqui tem o método do personagem com todos os atributos
		
		
		this.nome = nome;
		this.vida = vida;
		this.fome = fome;
		this.sede = sede;
		this.energia = energia;
		this.sanidade = sanidade;
		this.tamanhoInv = tamanhoInv;
		this.localização = localização;
	}
}
