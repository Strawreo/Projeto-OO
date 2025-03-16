package Sistemas;

import java.util.ArrayList;

public class Inic_ItensEquip {
	
public ArrayList<Class_Item> Inicializar_ItensEquip(){
		
		ArrayList<Class_Item> ArrayItensEquip = new ArrayList<>();
		
		ArrayItensEquip.add(new Item_Equipável("Capacete de madeira",2,3));
		ArrayItensEquip.add(new Item_Equipável("Capacete de ferro",4,4));
		ArrayItensEquip.add(new Item_Equipável("Capacete de bronze",5,4));
		ArrayItensEquip.add(new Item_Equipável("Capacete de ouro",4,2));
		ArrayItensEquip.add(new Item_Equipável("Capacete de platina",6,5));
		ArrayItensEquip.add(new Item_Equipável("Luvas de couro",1,1));
		ArrayItensEquip.add(new Item_Equipável("Manoplas de ferro",2,2));
		ArrayItensEquip.add(new Item_Equipável("Manoplas de bronze",3,2));
		ArrayItensEquip.add(new Item_Equipável("Manoplas de ouro",4,2));
		ArrayItensEquip.add(new Item_Equipável("Manoplas de platina",5,3));
		ArrayItensEquip.add(new Item_Equipável("Botas de couro",2,2));
		ArrayItensEquip.add(new Item_Equipável("Grevas de ferro",4,4));
		ArrayItensEquip.add(new Item_Equipável("Grevas de bronze",4,3));
		ArrayItensEquip.add(new Item_Equipável("Grevas de ouro",5,2));
		ArrayItensEquip.add(new Item_Equipável("Grevas de platina",6,4));
		
		System.out.println("Itens Equipáveis Inicializados");
		
		return ArrayItensEquip;
		
	}



}
