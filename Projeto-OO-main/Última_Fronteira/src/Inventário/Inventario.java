package Inventário;
import java.util.ArrayList;

public class Inventario {
	
	int tamanho;
	
	ArrayList<String> inventario = new ArrayList<>(); 
	//Declara a ArrayList Inventário; Mudarei futuramente para o inventario de Itens(Classe).
	//ArrayList<Integer> inventarioIds = new ArrayList<>(); 
	//Declara uma Arraylist secundária que armazena os ids dos itens (não visível)
	//Estou tentando implementar um sistemaas de ids de itens específicos, pois pode haver mais de um mesmo tipo de item no inventário.
	
	public Inventario(int tamanho) 
	//Construtor da Classe Inventário, cada pode-se modificar o tamanho da array para personagens específicos 
	{
		this.tamanho = tamanho;
	}
	
	public void obter(String item) 
	//Obtém o item e o adiciona na array, junto com o seu id específico
	{
		if (inventario.size() > tamanho) {
			
			System.out.println("Inventário Cheio!!");
			//Se o inventário estiver cheio não roda.
		
		} else {
			
			inventario.add(item);
			//inventarioIds.add(id);
			
		}
		
	}
	
	public void descartar(String item) 
	//Remove Itens específicos 
	
	{
		
		inventario.remove(item);
		//inventarioIds.remove(id);
		
	}
	
	public void ler() 
	//Printa o Inventário na Tela 
	
	{
		
		System.out.println(inventario);
		
	}

}
