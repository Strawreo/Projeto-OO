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
			personagem.addToDefesa(this.getDefesa());
			personagem.addToPeso(this.getPeso());
		
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
