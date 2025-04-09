package Sistemas;

public class Item_Usável extends Class_Item {
	
	private int vida,vel;
	
	public Item_Usável(String nome,int vida,int vel) {
		
		super(nome);
		
		this.vida = vida;
		this.vel = vel;
	}
	
	public void usar(int VidaAtual) {
		
		VidaAtual += vida;
		
	}
	
	public int getVida() {
		
		return this.vida;
	}
	
	public int getVel() {
		return this.vel;
		
	}
	
}


