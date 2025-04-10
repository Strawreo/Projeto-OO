package poo;

public class Rastreador extends Personagem {


	public Rastreador(String nome, int vida, int fome, int sede, int energia, int sanidade, String inventário, int localização,int peso, int defesa) {
		/*
		 *  super que chama os atributos da classe "pai" que seria personagem
		 */
		super(nome, vida, fome, sede, energia, sanidade, inventário, localização,peso,defesa);
	}
	
	
	/*
	 * Aqui tem o método sentir fome, onde eu pego os atributos que iniciei e coloco
	 * uma condicional para sentir fome ao longo do tempo, mas só para testar por
	 * enquanto
	 */
	
	
	public void sentirFome(int dano) {
		
	}
	
	public void sentirSede() {
		
	 }
	public void mostrarFome() {
		System.out.println("A fome do personagem é: " + super.getFome());
	}
	public void perderVida() {
	
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
		return super.toString();
		
	}
}
