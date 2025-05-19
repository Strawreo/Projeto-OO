package Sistemas;
import java.util.ArrayList;
import poo.Personagem;

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
		
		Boolean bool = true;
		
		for (int i = 0; i < inventario.size() ; i++) {
			
			if (inventario.get(i) == null) {
				
				this.inventario.set(i, item);
				System.out.println("Obteve: " + item.getNome());
				bool = false;
				break;
				
			} 
		}
		
		if(bool) {
			
			System.out.println("Tentou obter " + item.getNome() + ", mas o inventário estava cheio!!");
		}
	}
	
	public void descartar(String nomeItem,Personagem personagem) {
		
		ReadInventario read = this.read(nomeItem);
		Boolean bool = read.getBool();
		int i = read.getI();
		
		if(bool){
			
			if (inventario.get(i) instanceof Item_Equipável) {
				if(((Item_Equipável)inventario.get(i)).getEquipado()) {
					((Item_Equipável)inventario.get(i)).desequipar(personagem);
					inventario.remove(i);
					inventario.add(null);
					System.out.println("Item desequipado e descartado!");
				}
			
			} else {
			
			inventario.remove(i);
			inventario.add(null);
				
			System.out.println("Item Descartado!!: " + nomeItem); 
			
			}
				
		} else {
			System.out.println("Item não encontrado no inventário!");
		}
	}
	
		
	public void ler() {
		
		System.out.println("Inventário:");
		
		for (int i = 0; i < inventario.size() ; i++) {
			
			int num = i + 1;
			
			if (inventario.get(i) != null) {
				
				if (inventario.get(i) instanceof Item_Equipável) {
					
					if (((Item_Equipável)inventario.get(i)).getEquipado()) {
						
						System.out.println(num + ". " + inventario.get(i).getNome() + ": Equipado!");
					} else {
						
						System.out.println(num + ". " + inventario.get(i).getNome());
						}
						
				} else {
					
					System.out.println(num + ". " + inventario.get(i).getNome());
					
					} 
				
			} else {
				
				System.out.println(num + ". Slot Vazio");
					
			}
				
		}
		
	}
	
	public void equipar(String nome,Personagem personagem){
		
		ReadInventario read = this.read(nome);
		Boolean bool = read.getBool();
		int i = read.getI();
		
		if(bool) {
			
			if (inventario.get(i) instanceof Item_Equipável) {
				
				((Item_Equipável)inventario.get(i)).equipar(personagem);
				System.out.println("Item Equipado!");
				
			} else {
				
				System.out.println("Item não equipável!");
			}
			
		} else {
			
			System.out.println("Item não encontrado no inventário!");
		}
		
	}
	
	public void usar(String nome,Personagem personagem) {
		
		ReadInventario read = this.read(nome);
		Boolean bool = read.getBool();
		int i = read.getI();
		
		if(bool) {
			
			if(inventario.get(i) instanceof Item_Usável) {
				
				((Item_Usável)inventario.get(i)).usar(personagem);
				this.descartar(nome, personagem);
				
			} else {
				
				System.out.println("Item não pode ser usado!");
			
			}
			
		} else {
			
			System.out.println("Item não encontrado no inventário!!");
		}
		
	}
	
	public ReadInventario read(String nome) {
		
		boolean bool = false;
		int inteiro = -1;
		
		if (nome.equals(null)) {
			
			for (int i = 0; i < this.tamanho; i++) {
				
				if (nome.equals(inventario.get(i).getNome())) {
				
							bool = true;
							inteiro = i;
							break;
						} 
					} 
		} else {
			
			System.out.println("Entrada Inválida");
		}
		
		
		
		if (inteiro != -1) {
			
			return new ReadInventario(bool,inteiro);
			
		}
		else {
			
			return new ReadInventario(false,0);
		}
	}
	
	public int getTamanho() {
		
		return this.tamanho;
	
	}
}