package Sistemas;


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
