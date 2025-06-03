package personagens;
import sistemas.*;

public abstract class Personagem {
	
	/*
	 * Criação da classe principal personagem que vai se derivar as classes de cada
	 * personagem criado aqui eu inicializei todos os atributos que cada personagem
	 * terá, mas os valores dos atributos serão atribuídos na classe de cada um
	 */
	private String nome;
    private double vida;
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
	
	private double vidaTotal;
	private int fomeTotal;
	private int sedeTotal;
	private int sanidadeTotal;
	private int energiaTotal;
	
	
	 public Personagem(String nome,String descricao,double dano, double vida, int fome, int sede, int energia, int sanidade, int tamanhoInventario,double peso,double defesa) {
		//Aqui tem o Construtor do personagem com todos os atributos
		// nome,descricao,dano, vida, fome, sede, energia, sanidade, tamanhoInventario, peso, defesa
		
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
		this.setVidaTotal(vida);
		this.setFomeTotal(fome);
		this.setSedeTotal(sede);
		this.setSanidadeTotal(sanidade);
		this.setEnergiaTotal(energia);
		
	}
	 
	 //Aqui eu crio o método toString para retornar todos os parametros da classe Super
	 //e assim eu só chamar o metodo nas classes filho para printar os stats da classe
	 
	 public String toString() {
			return "Vida: " + this.vida + "/"+ this.vidaTotal + "\n" + "Fome: " + this.fome + "/"+ this.fomeTotal + "\n" + "Sede: " + this.sede + "/"+ this.sedeTotal + "\n" + 
					"Energia: " + this.energia + "/"+ this.sedeTotal + "\n" + "Sanidade: " + this.sanidade + "/"+ this.sanidadeTotal + "\n" +  "Defesa: " + this.defesa + "\n" + "Dano: " + this.dano + "\n" + "Peso total carregado: " + this.peso + "\n";
			
		}
	 public void perderVida(double danoBruto) {
		    double reducao = this.defesa / 100.0;
		    double danoFinal = danoBruto * (1 - reducao);
		    if (danoFinal < 0) danoFinal = 0;

		    this.vida -= danoFinal;
		    if (this.vida < 0) this.vida = 0;

		    System.out.printf("%s perdeu  %.2f de vida. Vida atual: %.2f \n" , nome, danoFinal, vida);
		}
	
	 public void sentirFome(int dano) {
			this.fome -= dano;
			if (this.fome < 0)this.fome = 0;
		}
	 public void sentirSede(int dano) {
		 this.sede -= dano;
		 if (this.sede < 0)this.sede = 0;
	 }
	  public void perderEnergia(int dano) {
			this.energia -= dano;
			if (this.energia < 0)this.energia = 0;
	 }
	 public void perderSanidade(int dano) {
			this.sanidade -= dano;
			if (this.sanidade < 0)this.sanidade = 0;
			System.out.println(nome + " agora tem " + sanidade + " de sanidade.\n");
		}
	 
	 
	 public double getVida() {
		 return this.vida;
	 }
	 
	 public void setVida(double vida) {
		 this.vida = vida;
	 }
	 
	 public int getFome() {
		 return this.fome;
	 }
	 
	 public void setFome(int fome) {
		 this.fome = fome;
	 }
	 
	 public int getSede() {
		 return this.sede;
	 }
	 
	 public void setSede(int sede) {
		 this.sede = sede;
	 }
	 
	 public int getEnergia() {
		 return this.energia;
	 }
	 
	 public void setEnergia(int energia) {
		 this.energia = energia;
	 }
	 
	 public int getSanidade() {
		 return this.sanidade;
	 }
	 
	 public void setSanidade(int sanidade) {
		 this.sanidade = sanidade;
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
		 if (this.vida > 100)this.vida = 100;
	 }
	 
	 public void addToSede(int sede) {
		 
		 this.sede += sede;
		 if (this.sede > 100)this.sede = 100;
	 }
	 
	 public void addToFome(int fome) {
		 
		 this.fome += fome;
		 if (this.fome > 100)this.fome = 100;
	 }
	 
	 public void addToSanidade(int sanidade) {
		 
		 this.sanidade += sanidade;
		 if (this.sanidade > 100)this.sanidade = 100;
	 }
	 
	 public void addToEnergia(int energia) {
		 
		 this.energia += energia;
		 if (this.energia > 100)this.energia = 100;
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

	public double getVidaTotal() {
		return vidaTotal;
	}

	public void setVidaTotal(double vidaTotal) {
		this.vidaTotal = vidaTotal;
	}

	public int getFomeTotal() {
		return fomeTotal;
	}

	public void setFomeTotal(int fomeTotal) {
		this.fomeTotal = fomeTotal;
	}

	public int getSedeTotal() {
		return sedeTotal;
	}

	public void setSedeTotal(int sedeTotal) {
		this.sedeTotal = sedeTotal;
	}

	public int getSanidadeTotal() {
		return sanidadeTotal;
	}

	public void setSanidadeTotal(int sanidadeTotal) {
		this.sanidadeTotal = sanidadeTotal;
	}

	public int getEnergiaTotal() {
		return energiaTotal;
	}

	public void setEnergiaTotal(int energiaTotal) {
		this.energiaTotal = energiaTotal;
	}
	
	public int getTamanhoInventario() {
		return this.tamanhoInventario;
	}
}
