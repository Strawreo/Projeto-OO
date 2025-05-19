package Sistemas;

import java.util.ArrayList;

public class Inic_ItensEquip {
	
public ArrayList<ClassItem> Inicializar_ItensEquip(){
	
	System.out.println("Inicializando itens equipáveis");
		
	ArrayList<ClassItem> ArrayItensEquip = new ArrayList<>();
		
		ArrayItensEquip.add(new Item_Equipável("Capacete de madeira","Na verdade este capacete é um balde que você encontrou no chão",2,3,false)); //Organizado como: nome, descrição, defesa,peso, equipado
		ArrayItensEquip.add(new Item_Equipável("Luvas de couro","Luvas de couro comuns, recomendada para climas frios", 1,1,false));
		ArrayItensEquip.add(new Item_Equipável("Manoplas de ferro","Estão enferrujadas mas são melhor do que nada",2,2,false));
		ArrayItensEquip.add(new Item_Equipável("Botas de couro","Famosas entre o povo comum, estão um pouco sujas",2,2,false));
		ArrayItensEquip.add(new Item_Equipável("Capacete de ferro","Este capacete aparenta ser de ouro, ao inspecionar mais perto você repara que na verdade é um capacete de ferro revestido por uma fina folha dourada",4,4,false));
		ArrayItensEquip.add(new Item_Equipável("Manoplas de bronze","Tem algo escrito nelas, você não consegue entender a língua",3,2,false));
		ArrayItensEquip.add(new Item_Equipável("Grevas de ferro","Estão um pouco desgastadas mas panela velha que faz comida boa",4,4,false));
		ArrayItensEquip.add(new Item_Equipável("Capacete de bronze","Possui uma cortina flexível de malha presa por um selo de chumbo",5,4,false));
		ArrayItensEquip.add(new Item_Equipável("Grevas de bronze","São bem pesadas",4,4,false));
		ArrayItensEquip.add(new Item_Equipável("Capacete de ouro","Um capacete feito de ouro puro, tem o formato da cabeça de um leão",4,2,false));
		ArrayItensEquip.add(new Item_Equipável("Manoplas de ouro","O acolchoamento interno tem o formato de patas",4,2,false));
		ArrayItensEquip.add(new Item_Equipável("Grevas de ouro","Possui garras presas na ponta dos pés, como grampos",5,2,false));
		ArrayItensEquip.add(new Item_Equipável("Capacete de platina","O capacete tem padrões dourados bordados em forma de flores, parece nunca ter sido usado",6,5,false));
		ArrayItensEquip.add(new Item_Equipável("Manoplas de platina","A manopla esquerda possui um anel de ouro fundido ao metal do dedo anelar, você consegue se enxergar no reflexo do metal",5,3,false));
		ArrayItensEquip.add(new Item_Equipável("Grevas de platina","As grevas aparentam estar intocadas, o metal refinado brilha com raios coloridos de luz",6,4,false));
		

	System.out.println("Itens equipáveis inicializados");
		
	return ArrayItensEquip;
		
	}



}
