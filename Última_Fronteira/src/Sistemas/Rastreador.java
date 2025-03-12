package Sistemas;

public class Rastreador extends Personagem {
	public Rastreador() {
		/*
		 * // super que chama os atributos da classe "pai" que seria personagem
		 */
		super("Diego", 100, 0, 0, 100, 100, "Vazio", 22);
	}
	
	/*
	 * Iniciei uma fome e vida atual pra testar o metodo sentir fome e ver se
	 * funciona
	 */
	
	public int vidaAtual = 100;
	public int fomeAtual = 0;
	public int sedeAtual = 0;
	
	
	/*
	 * Aqui tem o método sentir fome, onde eu pego os atributos que iniciei e coloco
	 * uma condicional para sentir fome ao longo do tempo, mas só para testar por
	 * enquanto
	 */
	
	public void sentirFome() {
		System.out.println("Sentindo fome...");
		this.fomeAtual += 10;
		if(this.fomeAtual >= 40) {
			this.vidaAtual -= 2;
		}else {
			
		}
		System.out.println("Vida atual é " + this.vidaAtual);
		System.out.println("Fome atual é " + this.fomeAtual);
		
	}
	
	
	/*
	 * Aqui eu criei o método para ver as stats atuais do personagem para verificar
	 * se tudo foi inicializado corretamente e etc...
	 */
	
	
	public void stats() {
		System.out.println(nome);
		System.out.println(vidaAtual);
		System.out.println(fomeAtual);
		System.out.println(sedeAtual);
		System.out.println(energia);
		System.out.println(sanidade);
		System.out.println(inventário);
		System.out.println(localização);
	}
}
