package item;

import java.util.ArrayList;

public class Item_Equipável implements Item_Interface{
	
	String nome = "Item Equipavel"; // Item equipável genérico 
	protected int id; 
	int VidaAtual = 100; 
	ArrayList<String> InventarioSimples = new ArrayList <>(); 
	ArrayList<String> InventarioSimples_Equipaveis = new ArrayList<>();

	@Override
	public void obter() {
		
		System.out.println("Obteve " + nome);
		
		InventarioSimples.add (nome); 
		
		id = InventarioSimples.indexOf(nome);
		
		System.out.println(InventarioSimples.get(0) + "Adicionado ao Inventário");
		
		
	}

	@Override
	public void utilizar() {
		
		System.out.println("Equipando " + InventarioSimples.get(id));
		
		 InventarioSimples_Equipaveis.add(InventarioSimples.get(id)); // Teria que fazer um array que é lido apenas para os itens equipados aplicando seus "Atributos" ao personagem

		InventarioSimples.remove(id); 
		
		System.out.println(nome + "Equipado");
		
	}

	@Override
	public void descartar() {
		
		System.out.println("Descartando" + nome);
		
		InventarioSimples.remove(id);
		
		
	}
	
	public void desequipando() {
		
		System.out.println("Desequipando" + nome);
		
		InventarioSimples.add(InventarioSimples_Equipaveis.get(id));
		InventarioSimples_Equipaveis.remove(id);
		
		System.out.println(nome + "Movido para o inventário");
		
	}

	

}
