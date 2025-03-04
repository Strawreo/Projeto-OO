package poo;

public class Médico extends Personagem{

	public Médico() {
		super("Erick", 150, 0, 0, 100, 100, "Vazio", 22);
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
		return nome + "\n" + vida + "\n" + fome + "\n" + sede + "\n" + energia + "\n" + sanidade + "\n" + inventário + "\n" + localização + "\n";
		
	}
}