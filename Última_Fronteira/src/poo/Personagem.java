package poo;

public abstract class Personagem {
	
	/*
	 * Criação da classe principal personagem que vai se derivar as classes de cada
	 * personagem criado aqui eu inicializei todos os atributos que cada personagem
	 * terá, mas os valores dos atributos serão atribuídos na classe de cada um
	 */
	private String nome;
    private int vida;
	private int fome;
	private int sede;
	private int energia;
	private int sanidade;
	private String inventário;
	private int localização;
	
	
	 Personagem(String nome, int vida, int fome, int sede, int energia, int sanidade, String inventário, int localização) {
		//Aqui tem o Construtor do personagem com todos os atributos
		
		
		this.nome = nome;
		this.vida = vida;
		this.fome = fome;
		this.sede = sede;
		this.energia = energia;
		this.sanidade = sanidade;
		this.inventário = inventário;
		this.localização = localização;
	}
	 
	 //Aqui eu crio o método toString para retornar todos os parametros da classe Super
	 //e assim eu só chamar o metodo nas classes filho para printar os stats da classe
	 
	 public String toString() {
			return this.nome + "\n" + this.vida + "\n" + this.fome + "\n" + this.sede + "\n" + this.energia + "\n" + this.sanidade + "\n" + this.inventário + "\n" + this.localização + "\n";
			
		}
	 public void perderVida(int dano) {
			this.vida -= dano;
			if (this.vida < 0)this.vida = 0;
			System.out.println(nome + " agora tem " + vida + " de vida.");
		}
	 public void sentirFome(int dano) {
			System.out.println("Sentindo fome...");
			this.fome += dano;
			if(this.fome >= 40) {
				this.vida-= 2;
			}
			System.out.println("Vida atual é " + vida);
			System.out.println("Fome atual é " + fome);
			
		}
	 public void sentirSede() {
		 System.out.println("Sentindo sede...");
		 sede += 20;
		 if(sede >= 40) {
			 vida -=2;
		 }else {
			 
		 }
		 System.out.println("A vida atual é " + vida);
		 System.out.println("A sede atual é " + sede);
		 
	 }
	 
	 public int getFome() {
		 return this.fome;
	 }

	 
	 
}
