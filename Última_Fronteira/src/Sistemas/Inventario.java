package Sistemas;
import java.util.ArrayList;

public class Inventario {
	
	int tamanho;
	String tipo;
	int vida,defesa,velocidade,dano;
	
	ArrayList<Class_Item> inventario = new ArrayList<>(); 
	
	public Inventario(int tamanho) 
	//Construtor da Classe Inventário, cada pode-se modificar o tamanho da array para personagens específicos 
	{
		this.tamanho = tamanho;
	}
	
	public void obter(Class_Item item) 
	//Obtém o item e o adiciona na array, junto com o seu id específico
	{
		if (inventario.size() > tamanho) {
			
			System.out.println("Inventário Cheio!!");
			//Se o inventário estiver cheio não roda.
			
		} else {
			
			inventario.add(item);
			System.out.println("Item Obtido!");
		}
		
	}
	
	public void descartar(Class_Item item) 
	//Remove Itens específicos 
	{
		inventario.remove(item);
	}
	
	
	public void ler() 
	{
		System.out.println(inventario);
	}
	
	
	

}
