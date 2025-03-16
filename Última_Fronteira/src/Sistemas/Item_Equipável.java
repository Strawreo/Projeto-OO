package Sistemas;

public class Item_Equipável extends Class_Item {
	
	int defesa;
	int peso;
	
	public Item_Equipável(String nome,int defesa, int peso) {
		
		super(nome);
		
		this.defesa = defesa;
		this.peso = peso;
		
		
	}

	
}
