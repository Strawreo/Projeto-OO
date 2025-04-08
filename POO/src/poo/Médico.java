package poo;

public class Médico extends Personagem{

	public Médico(String nome, int vida, int fome, int sede, int energia, int sanidade, String inventário, int localização) {
		super(nome, vida, fome, sede, energia, sanidade, inventário, localização);
	}
	
	
	public String toString() {
		return super.toString();
		
	}
}