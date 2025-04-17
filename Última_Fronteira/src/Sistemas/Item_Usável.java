package Sistemas;
import poo.Personagem;

public class Item_Usável extends Class_Item {
	
	private int vida,fome,sede,energia,sanidade;
	
	public Item_Usável(String nome,int vida,int fome,int sede,int energia,int sanidade) {
		
		super(nome);
		
		this.vida = vida;
		this.fome = fome;
		this.sede = sede;
		this.energia = energia;
		this.sanidade = sanidade;
		
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
}


