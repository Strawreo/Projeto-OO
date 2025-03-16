package Sistemas;
import java.util.ArrayList;

public class Inventario {
	
	int tamanho;
	String tipo;
	int vida,defesa,velocidade,dano;
	
	ArrayList<Class_Item> inventario = new ArrayList<>(); 
	
	public Inventario(int tamanho)  {
		this.tamanho = tamanho;
	}
	
	public void obter(Class_Item item) {
		if (inventario.size() > tamanho) {
			
			System.out.println("Inventário Cheio!!");
			
			
		} else {
			
			inventario.add(item);
			System.out.println("Item Obtido!");
		}
		
	}
	
	public void descartar(Class_Item item) {
		int id = inventario.indexOf(item);
		inventario.remove(id);
	}
	
	
	public void ler() {
		
		System.out.println("Inventário:");
		
		for (int i = 0; i < inventario.size() ; i++) {
			
			if (inventario.get(i) != null) {
				
				System.out.println(inventario.get(i).GetNome());
				
			} else {
				
				System.out.println("Slot Vazio");
				
			}
				
		}
		
	}
			
			
			
		
		
		
	
	
	

}
