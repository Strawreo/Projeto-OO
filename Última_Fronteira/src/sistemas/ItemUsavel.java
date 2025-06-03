package sistemas;
import personagens.Personagem;

public class ItemUsavel extends ClassItem {
	
	private int vida,fome,sede,energia,sanidade,quantidade;
	
	public ItemUsavel(String nome,String descricao,int vida,int fome,int sede,int energia,int sanidade,double peso,int quantidade) {
		
		super(nome,descricao,peso);
		
		this.vida = vida;
		this.fome = fome;
		this.sede = sede;
		this.energia = energia;
		this.sanidade = sanidade;
		this.setQuantidade(quantidade);
		
	}
	
	public void usar(Personagem personagem) {
		
		personagem.addToVida(this.vida);
		personagem.addToFome(this.fome);
		personagem.addToSede(this.sede);
		personagem.addToEnergia(this.energia);
		personagem.addToSanidade(this.sanidade);
		
		if(personagem.getVida()> personagem.getVidaTotal()) {
			personagem.setVida(personagem.getVidaTotal());
		} 
		if(personagem.getFome()> personagem.getFomeTotal()) {
			personagem.setFome(personagem.getFomeTotal());
		} 
		if(personagem.getSede()> personagem.getSedeTotal()) {
			personagem.setSede(personagem.getSedeTotal());
		} 
		if(personagem.getEnergia()>personagem.getEnergiaTotal()) {
			personagem.setEnergia(personagem.getEnergiaTotal());
		} 
		if(personagem.getSanidade()>personagem.getSanidadeTotal()) {
			personagem.setSanidade(personagem.getSanidadeTotal());
		}
		
		System.out.println(this.getNome() + " Usado!");
		System.out.println(personagem.toString());
		
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void addToQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void takeFromQuantidade(int quantidade) {
		this.quantidade -= quantidade;
	}
}


