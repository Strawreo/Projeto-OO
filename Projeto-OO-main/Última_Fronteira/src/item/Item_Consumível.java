package item;

import java.util.ArrayList;

//Todos os itens consumíveis seguiram esta classe 


public class Item_Consumível implements Item_Interface {
	
	String nome = "Item Consumível";
	protected int id; // cria o id específico do item DENTRO do inventário 
	int VidaAtual = 100; //Futuramente esta seria a Vida Atual do personagem selecionado.
	ArrayList<String> InventarioSimples = new ArrayList <>(); //Futuramente será o  do inventário, em formato array 

	@Override
	public void obter() {
		
		System.out.println("Obteve " + nome);
		
		InventarioSimples.add (nome); 
		
		id = InventarioSimples.indexOf(nome); //Armazena o id do item dentro do inventário 
		
		System.out.println(InventarioSimples.get(0) + "Adicionado ao Inventário");// verificando a existencia de 'nome' na arraylist
		
		
	}

	@Override
	public void utilizar() {
		
		System.out.println("Utilizando " + InventarioSimples.get(id));
		
		VidaAtual = VidaAtual + 10; //Os efeitos do item poderão ser modificados, digamos que este aumenta a vida do personagem em 10

		InventarioSimples.remove(id); //remove o item 
		
		System.out.println(nome + "Utilizado");
		
	}

	@Override
	public void descartar() {
		
		System.out.println("Descartando" + nome);
		
		InventarioSimples.remove(id);
		
		
	}

}

