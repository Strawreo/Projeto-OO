package Sistemas;
import poo.Personagem;


public class Item_Equipável extends ClassItem {
	
	private int defesa;
	private boolean equipado;
	
	public Item_Equipável(String nome,String descricao,int defesa, double peso,boolean equipado) {
		
		super(nome,descricao,peso);
		
		this.defesa = defesa;
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
}
