package Sistemas;
import personagens.Personagem;

public class Item_Usável extends ClassItem {
	
	private int vida,fome,sede,energia,sanidade,quantidade;
	
	public Item_Usável(String nome,String descricao,int vida,int fome,int sede,int energia,int sanidade,double peso,int quantidade) {
		
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


