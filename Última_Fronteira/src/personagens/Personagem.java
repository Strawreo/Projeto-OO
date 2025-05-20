package personagens;
import Sistemas.*;

public class Personagem {
	
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
	private int tamanhoInventario;
	private Inventario inventário;
	private double peso;
	private double defesa;
	private String descricao;
	private double dano;
	
	
	 public Personagem(String nome,String descricao,double dano, int vida, int fome, int sede, int energia, int sanidade, int tamanhoInventario,double peso,double defesa) {
		//Aqui tem o Construtor do personagem com todos os atributos
		
		this.nome = nome;
		this.vida = vida;
		this.fome = fome;
		this.sede = sede;
		this.energia = energia;
		this.sanidade = sanidade;
		this.tamanhoInventario = tamanhoInventario;
		this.inventário = new Inventario(tamanhoInventario);
		this.peso = peso;
		this.defesa = defesa;
		this.setDescricao(descricao);
		this.setDano(dano);
		
	}
	 
	 //Aqui eu crio o método toString para retornar todos os parametros da classe Super
	 //e assim eu só chamar o metodo nas classes filho para printar os stats da classe
	 
	 public String toString() {
			return "Vida: " + this.vida + "\n" + "Fome: " + this.fome + "\n" + "Sede: " + this.sede + "\n" + 
					"Energia: " + this.energia + "\n" + "Sanidade: " + this.sanidade + "\n" + "Tamanho do inventário: " + this.tamanhoInventario + "\n";
			
		}
	 public void perderVida(int dano) {
			this.vida -= dano;
			if (this.vida < 0)this.vida = 0;
			System.out.println(nome + " agora tem " + vida + " de vida.");
		}
	 public void sentirFome(int dano) {
			System.out.println("Sentindo fome...");
			this.fome += dano;
			if(this.fome >= 40 && this.vida > 0) {
				this.vida-= 2;
			}
			System.out.println("Vida atual é " + vida);
			System.out.println("Fome atual é " + fome);
			
		}
	 public void sentirSede(int dano) {
		 System.out.println("Sentindo sede...");
		 this.sede += dano;
		 if(sede >= 40 && this.vida > 0) {
			 this.vida -=2;
		 }
		 System.out.println("A vida atual é " + vida);
		 System.out.println("A sede atual é " + sede);
		 
	 }
	  public void perderEnergia(int dano) {
			this.energia -= dano;
			if (this.energia < 0)this.energia = 0;
			System.out.println(nome + " agora tem " + energia + " de energia.\n");
	 }
	 public void perderSanidade(int dano) {
			this.sanidade -= dano;
			if (this.sanidade < 0)this.sanidade = 0;
			System.out.println(nome + " agora tem " + sanidade + " de sanidade.\n");
		}
	 
	 
	 public int getVida() {
		 return this.vida;
	 }
	 
	 public int getFome() {
		 return this.fome;
	 }
	 
	 public int getSede() {
		 return this.sede;
	 }
	 
	 public int getEnergia() {
		 return this.energia;
	 }
	 
	 public int getSanidade() {
		 return this.sanidade;
	 }
	 
	 public double getPeso() {
		 
		 return this.peso;
	 }
	 
	 public double getDefesa() {
		 
		 return this.defesa;
	 }
	 
	 public void setPeso(int peso) {
		 
		 this.peso = peso;
	 }
	 
	 public void setDefesa(int defesa) {
		 
		 this.defesa = defesa;
	 }
	 
	 public void addToPeso(double peso) {
		 
		 this.peso += peso;
	}
	 
	 public void addToDefesa (double d) {
		 
		 this.defesa += d;
	}
	 
	 public void addToVida(int vida) {
		 
		 this.vida += vida;
	 }
	 
	 public void addToSede(int sede) {
		 
		 this.sede += sede;
	 }
	 
	 public void addToFome(int fome) {
		 
		 this.fome += fome;
	 }
	 
	 public void addToSanidade(int sanidade) {
		 
		 this.sanidade += sanidade;
	 }
	 
	 public void addToEnergia(int energia) {
		 
		 this.energia += energia;
	 }
	 
	 public void takeFromDefesa(double d) {
		 this.defesa -= d;
	 }
	 
	 public void takeFromPeso(double peso) {
		 this.peso -= peso;
	 }
	 
	 public Inventario getInventario() {
		 return this.inventário;
	 }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	 
	public String getNome() {
		return this.nome;
	}

	public double getDano() {
		return dano;
	}

	public void setDano(double dano) {
		this.dano = dano;
	}
	
	public void addToDano(double dano) {
		this.dano += dano;
	}
	
	public void takeFromDano(double dano) {
		this.dano -= dano;
	}
}
