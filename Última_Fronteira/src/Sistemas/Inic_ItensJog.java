package Sistemas;

import java.util.ArrayList;

public class Inic_ItensJog {
	
public ArrayList<ClassItem> Inicializar_ItensJog(){
	
		System.out.println("Incializando itens jogáveis");
		
		ArrayList<ClassItem> ArrayItensJog = new ArrayList<>();
		
		ArrayItensJog.add(new Item_Jogável("Garrafa de vidro","Uma pena que esteja vazia",0)); // nome, descrição, quantia (Todos os itens jogaveis possuim peso(0.5)
		ArrayItensJog.add(new Item_Jogável("Pedra","É um agregado sólido que ocorre naturalmente e é constituído por um ou mais minerais ou mineraloides, em outros termos, uma pedra",0));
		ArrayItensJog.add(new Item_Jogável("Tecido","Um pedaço de tecido rasgado",0));
		ArrayItensJog.add(new Item_Jogável("Graveto","É apenas um pedaço de pau",0));
		ArrayItensJog.add(new Item_Jogável("Ferro Bruto","Um ferreiro seria útil agora",0));
		ArrayItensJog.add(new Item_Jogável("Ouro","Será ouro de tolo? Apenas um ferreiro saberia dizer",0));
		ArrayItensJog.add(new Item_Jogável("Bronze","Liga metálica de cobre estanho, um ferreiro pode achá-lo útil",0));
		ArrayItensJog.add(new Item_Jogável("???","Parece ser algum tipo de metal, um ferreiro poderia lhe falar do que se trata",0));
	
		System.out.println("Itens Jogáveis Inicializados");
		
		return ArrayItensJog;
		
	}

}
		
		

