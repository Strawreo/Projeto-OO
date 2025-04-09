package Sistemas;

public class Item_Equipável extends Class_Item {
	
	private int defesa;
	private int peso;
	
	public Item_Equipável(String nome,int defesa, int peso) {
		
		super(nome);
		
		this.defesa = defesa;
		this.peso = peso;
		
		
	}
	
	public int getDefesa() {
		return this.defesa;
		
	}

	public int getPeso() {
		return this.peso;
		
	}
}
