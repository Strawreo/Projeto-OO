package Sistemas;

public class Item_Jogável extends ClassItem {
	
	private int dano;
	
	public Item_Jogável(String nome,String descricao,int dano) {
		
		super(nome,descricao,0.5);
		
		this.dano = dano;
	}
	
	public int getDano() {
		return this.dano;
		
	}
}
