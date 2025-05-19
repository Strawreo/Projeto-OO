package Sistemas;

import java.util.ArrayList;

public class Inic_ItensJog {
	
public ArrayList<Class_Item> Inicializar_ItensJog(){
	
		System.out.println("Incializando itens jogáveis");
		
		ArrayList<Class_Item> ArrayItensJog = new ArrayList<>();
		
		ArrayItensJog.add(new Item_Jogável("Garrafa de vidro",10));
		ArrayItensJog.add(new Item_Jogável("Template",10));
		ArrayItensJog.add(new Item_Jogável("Template",10));
		ArrayItensJog.add(new Item_Jogável("Template",10));
		ArrayItensJog.add(new Item_Jogável("Template",10));
		ArrayItensJog.add(new Item_Jogável("Template",10));
		ArrayItensJog.add(new Item_Jogável("Template",10));
		ArrayItensJog.add(new Item_Jogável("Template",10));
		ArrayItensJog.add(new Item_Jogável("Template",10));
		ArrayItensJog.add(new Item_Jogável("Template",10));
		ArrayItensJog.add(new Item_Jogável("Template",10));
		
		System.out.println("Itens Jogáveis Inicializados");
		
		return ArrayItensJog;
		
	}

}
		
		

