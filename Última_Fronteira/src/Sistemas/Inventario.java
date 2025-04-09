package Sistemas;
import java.util.ArrayList;

public class Inventario {
	
	private int tamanho;
	
	private ArrayList<Class_Item> inventario; 
	
	public Inventario(int tamanho)  {
		
		this.tamanho = tamanho;
		this.inventario = new ArrayList<Class_Item>(this.tamanho); 
		
		for (int i = 0; i < this.tamanho; i++) {
			
			inventario.add(null);
			
		}
		
	}
			
	public void obter(Class_Item item) {
		
		if (inventario.getLast() != null) {
			
			System.out.println("Inventário Cheio!!");
		
		} else {
		
			for (int i = 0; i < this.tamanho; i++) {
				
				if (inventario.get(i) == null) {
					
					inventario.set(i, item);
					
					break;
				}
				
			}
			
		}
		
	}
	
	public void descartar(String nomeItem) {
		
		for (int i = 0; i < this.tamanho; i++) {
			
			boolean bool = true;
			
			if (nomeItem.equals(inventario.get(i).getNome())) {
			
				inventario.remove(i);
				inventario.set(i, null);
				
				System.out.println("Item Descartado!!");
				
				bool = false;
				
				break;
				
			}
		
		if (bool) {
			
			System.out.println("Entrada Inválida!");
			break;
		}
			
			
		}
		
	}
	
				
		
	public void ler() {
		
		System.out.println("Inventário:");
		
		for (int i = 0; i < inventario.size() ; i++) {
			
			int num = i + 1;
			
			if (inventario.get(i) != null) {
				
				System.out.println(num + ". " + inventario.get(i).getNome());
				
			} else {
				
				System.out.println(num + ". " + "Slot Vazio");
				
			}
				
		}
		
	}
	
	public int getTamanho() {
		
		return this.tamanho;
	
	}
			
}