package poo;

public class Médico extends Personagem{

	public Médico(String nome, int vida, int fome, int sede, int energia, int sanidade, String inventário, int localização) {
		super(nome, vida, fome, sede, energia, sanidade, inventário, localização);
	}
	
	void sentirFome() {
		System.out.println("Sentindo fome...");
		fome += 10;
		if(fome >= 40) {
			vida-= 2;
		}else {
			
		}
		System.out.println("Vida atual é " + vida);
		System.out.println("Fome atual é " + fome);
		
	}
	void sentirSede() {
		 System.out.println("Sentindo sede...");
		 sede += 20;
		 if(sede >= 40) {
			 vida -=2;
		 }else {
			 
		 }
		 System.out.println("A vida atual é " + vida);
		 System.out.println("A sede atual é " + sede);
	}
	public String toString() {
		return super.toString();
		
	}
}