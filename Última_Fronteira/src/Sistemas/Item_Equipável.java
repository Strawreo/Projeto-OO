package Sistemas;
import poo.Personagem;


public class Item_Equipável extends Class_Item {
	
	private int defesa;
	private int peso;
	private boolean equipado;
	
	public Item_Equipável(String nome,int defesa, int peso,boolean equipado) {
		
		super(nome);
		
		this.defesa = defesa;
		this.peso = peso; 
		this.equipado = equipado;
		
		
	}
	
	public void equipar(Personagem personagem) {
		if (this.getEquipado()) {
			System.out.println("Item já equipado!");
		}
		else {
			
			this.equipado = true;
			personagem.addToDefesa(this.getDefesa());
			personagem.addToPeso(this.getPeso());
		
		}
	}
	
	public void desequipar(Personagem personagem) {
		if (this.getEquipado()) {
			
			this.equipado = false;
			personagem.takeFromDefesa(this.getDefesa());
			personagem.takeFromPeso(this.getPeso());
			
			System.out.println("Item desequipado!");
		} else {
			System.out.println("Item já não está equipado!");
		}
		
	}
			
	
	
	public boolean getEquipado() {
		
		return this.equipado;
	}
	
	public int getDefesa() {
		return this.defesa;
		
	}

	public int getPeso() {
		return this.peso;
		
	}
	
	
}
