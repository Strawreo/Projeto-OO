package Sistemas;

import java.util.ArrayList;

public class Inic_ItensUsa {
	
public ArrayList<ClassItem> Inicializar_ItensUsa(){
	
		System.out.println("Inicializando itens usáveis");
		
		ArrayList<ClassItem> ArrayItensUsa = new ArrayList<>();
		
		//Organizado como: nome,vida,fome,sede,energia,sanidade, quantidade;
		
		ArrayItensUsa.add(new Item_Usável("Bandagens","Um par de panos rasgados", 10,0,0,2,2,0.2,0)); 
		ArrayItensUsa.add(new Item_Usável("Bandagens","Um par de panos rasgados", 10,0,0,2,2,0.2,0));
		ArrayItensUsa.add(new Item_Usável("Bandagens","Um par de panos rasgados", 10,0,0,2,2,0.2,0));
		ArrayItensUsa.add(new Item_Usável("Bandagens","Um par de panos rasgados", 10,0,0,2,2,0.2,0));
		ArrayItensUsa.add(new Item_Usável("Bandagens","Um par de panos rasgados", 10,0,0,2,2,0.2,0));
		
		
		System.out.println("Itens Usáveis Inicializados");
		
		return ArrayItensUsa;
		
	}
 
}
