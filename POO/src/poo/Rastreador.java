package poo;

public class Rastreador extends Personagem {
	public Rastreador() {
		/*
		 *  super que chama os atributos da classe "pai" que seria personagem
		 */
		super("Diego", 100, 0, 0, 100, 100, "Vazio", 22);
	}
	
	
	/*
	 * Aqui tem o método sentir fome, onde eu pego os atributos que iniciei e coloco
	 * uma condicional para sentir fome ao longo do tempo, mas só para testar por
	 * enquanto
	 */
	
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
	
	
	/*
	 * Aqui eu criei o método para ver as stats atuais do personagem para verificar
	 * se tudo foi inicializado corretamente e etc...
	 */
	
	
	/*
	 * public void stats() { System.out.println(nome);
	 * System.out.println(vidaAtual); System.out.println(fomeAtual);
	 * System.out.println(sedeAtual); System.out.println(energia);
	 * System.out.println(sanidade); System.out.println(inventário);
	 * System.out.println(localização); }
	 */
	public String toString() {
		return nome + "\n" + vida + "\n" + fome + "\n" + sede + "\n" + energia + "\n" + sanidade + "\n" + inventário + "\n" + localização + "\n";
		
	}
}
