package poo;

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
	String inventário;
	int localização;
	
	
	 Personagem(String nome, int vida, int fome, int sede, int energia, int sanidade, String inventário, int localização) {
		//Aqui tem o método do personagem com todos os atributos
		
		
		this.nome = nome;
		this.vida = vida;
		this.fome = fome;
		this.sede = sede;
		this.energia = energia;
		this.sanidade = sanidade;
		this.inventário = inventário;
		this.localização = localização;
	}
	 void sentirFome() {
		 System.out.println("Sentindo fome");
		 fome += 10;
		 if(fome >= 40) {
			 vida -=2;
		 }else {
			 
		 }
		 System.out.println("A vida atual é " + vida);
		 System.out.println("A fome atual é " + fome);
		 
	 }
	 void sentirSede() {
		 System.out.println("Sentindo sede");
		 sede += 10;
		 if(sede >= 40) {
			 vida -=2;
		 }else {
			 
		 }
		 System.out.println("A vida atual é " + vida);
		 System.out.println("A sede atual é " + sede);
		 
	 }
}
