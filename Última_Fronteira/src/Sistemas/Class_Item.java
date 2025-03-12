package Sistemas;

public class Class_Item {

	String tipo;
	int vida;
	int defesa;
	int velocidade;
	int dano;
	
	public void Item(String tipo, int vida, int defesa, int velocidade, int dano) //Estrutura básica de todos os itens 
	
	
	{
		
		this.tipo = tipo;
		this.vida = vida;
		this.defesa = defesa;
		this.velocidade = velocidade;
		this.dano = dano;
		
	}

}
