package Sistemas;

public class Item_Jogável extends Class_Item {
	
	private int dano;
	
	public Item_Jogável(String nome,int dano) {
		
		super(nome);
		
		this.dano = dano;
	}
	
	public int getDano() {
		return this.dano;
		
	}
}
