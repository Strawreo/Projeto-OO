package Sistemas;

import java.util.ArrayList;

public class Inic_ItensUsa {
	
public ArrayList<Class_Item> Inicializar_ItensUsa(){
		
		ArrayList<Class_Item> ArrayItensUsa = new ArrayList<>();
		
		ArrayItensUsa.add(new Item_Usável("Bandagens",10,0));
		ArrayItensUsa.add(new Item_Usável("Template",0,0));
		ArrayItensUsa.add(new Item_Usável("Template",0,0));
		ArrayItensUsa.add(new Item_Usável("Template",0,0));
		ArrayItensUsa.add(new Item_Usável("Template",0,0));
		ArrayItensUsa.add(new Item_Usável("Template",0,0));
		ArrayItensUsa.add(new Item_Usável("Template",0,0));
		ArrayItensUsa.add(new Item_Usável("Template",0,0));
		ArrayItensUsa.add(new Item_Usável("Template",0,0));
		ArrayItensUsa.add(new Item_Usável("Template",0,0));
		ArrayItensUsa.add(new Item_Usável("Template",0,0));
		ArrayItensUsa.add(new Item_Usável("Template",0,0));
		
		
		
		System.out.println("Itens Usáveis Inicializados");
		
		return ArrayItensUsa;
		
	}

}
