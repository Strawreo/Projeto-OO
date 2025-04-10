package Sistemas;

import java.util.ArrayList;

public class Inic_ItensEquip {
	
public ArrayList<Class_Item> Inicializar_ItensEquip(){
	
		System.out.println("Inicializando itens equipáveis");
		
		ArrayList<Class_Item> ArrayItensEquip = new ArrayList<>();
		
		ArrayItensEquip.add(new Item_Equipável("Capacete de madeira",2,3,false));
		ArrayItensEquip.add(new Item_Equipável("Capacete de ferro",4,4,false));
		ArrayItensEquip.add(new Item_Equipável("Capacete de bronze",5,4,false));
		ArrayItensEquip.add(new Item_Equipável("Capacete de ouro",4,2,false));
		ArrayItensEquip.add(new Item_Equipável("Capacete de platina",6,5,false));
		ArrayItensEquip.add(new Item_Equipável("Luvas de couro",1,1,false));
		ArrayItensEquip.add(new Item_Equipável("Manoplas de ferro",2,2,false));
		ArrayItensEquip.add(new Item_Equipável("Manoplas de bronze",3,2,false));
		ArrayItensEquip.add(new Item_Equipável("Manoplas de ouro",4,2,false));
		ArrayItensEquip.add(new Item_Equipável("Manoplas de platina",5,3,false));
		ArrayItensEquip.add(new Item_Equipável("Botas de couro",2,2,false));
		ArrayItensEquip.add(new Item_Equipável("Grevas de ferro",4,4,false));
		ArrayItensEquip.add(new Item_Equipável("Grevas de bronze",4,3,false));
		ArrayItensEquip.add(new Item_Equipável("Grevas de ouro",5,2,false));
		ArrayItensEquip.add(new Item_Equipável("Grevas de platina",6,4,false));
		
		System.out.println("Itens Equipáveis Inicializados");
		
		return ArrayItensEquip;
		
	}



}
