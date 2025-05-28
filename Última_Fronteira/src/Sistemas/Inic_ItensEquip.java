package Sistemas;

import java.util.ArrayList;
import equip.*;

public class Inic_ItensEquip {
	
public ArrayList<ClassItem> Inicializar_ItensEquip(){
	
	System.out.println("Inicializando itens equipáveis");
		
	ArrayList<ClassItem> ArrayItensEquip = new ArrayList<>();
		
		//ItemEquipavelCabeca , ItemEquipavelMao, ItemEquipavelPerna, ItemEquipavelArma
		//Organizado como: nome, descrição, defesa, peso, dano, equipado
	
		ArrayItensEquip.add(new ItemEquipavelCabeca("Capacete de madeira","Na verdade este capacete é um balde que você encontrou no chão",2,3,0,false)); 
		ArrayItensEquip.add(new ItemEquipavelMao("Luvas de couro","Luvas de couro comuns, recomendada para climas frios", 1,1,0,false));
		ArrayItensEquip.add(new ItemEquipavelMao("Manoplas de ferro","Estão enferrujadas mas são melhor do que nada",2,2,0,false));
		ArrayItensEquip.add(new ItemEquipavelPerna("Botas de couro","Famosas entre o povo comum, estão um pouco sujas",2,2,0,false));
		ArrayItensEquip.add(new ItemEquipavelCabeca("Capacete de ferro","Este capacete aparenta ser de ouro, ao inspecionar mais perto você repara que na verdade é um capacete de ferro revestido por uma fina folha dourada",4,4,0,false));
		ArrayItensEquip.add(new ItemEquipavelMao("Manoplas de bronze","Tem algo escrito nelas, você não consegue entender a língua",3,2,0,false));
		ArrayItensEquip.add(new ItemEquipavelPerna("Grevas de ferro","Estão um pouco desgastadas mas panela velha que faz comida boa",4,4,0,false));
		ArrayItensEquip.add(new ItemEquipavelCabeca("Capacete de bronze","Possui uma cortina flexível de malha presa por um selo de chumbo",5,4,0,false));
		ArrayItensEquip.add(new ItemEquipavelPerna("Grevas de bronze","São bem pesadas",4,4,0,false));
		ArrayItensEquip.add(new ItemEquipavelCabeca("Capacete de ouro","Um capacete feito de ouro puro, tem o formato da cabeça de um leão",4,2,0,false));
		ArrayItensEquip.add(new ItemEquipavelMao("Manoplas de ouro","O acolchoamento interno tem o formato de patas",4,2,0,false));
		ArrayItensEquip.add(new ItemEquipavelPerna("Grevas de ouro","Possui garras presas na ponta dos pés, como grampos",5,2,0,false));
		ArrayItensEquip.add(new ItemEquipavelCabeca("Capacete de platina","O capacete tem padrões dourados bordados em forma de flores, parece nunca ter sido usado",6,5,2,false));
		ArrayItensEquip.add(new ItemEquipavelMao("Manoplas de platina","A manopla esquerda possui um anel de ouro fundido ao metal do dedo anelar, você consegue se enxergar no reflexo do metal",5,3,2,false));
		ArrayItensEquip.add(new ItemEquipavelPerna("Grevas de platina","As grevas aparentam estar intocadas, o metal refinado brilha com raios coloridos de luz",6,4,2,false));
		
		//Itens de ataque 
		
		ArrayItensEquip.add(new ItemEquipavelArma("Espada de madeira","Alguma criança deve ter deixado cair",0,0.5,2,false));
		ArrayItensEquip.add(new ItemEquipavelArma("Arco","É um arco simples de madeira, sua madeira range um pouco quando arqueada",0,0.5,2,false));
		ArrayItensEquip.add(new ItemEquipavelArma("Adaga?","Uma adaga antiga, cujo punho é uma pequena escultura de uma mulher segurando uma criança" + "\n" + "É desconfortável de segurar" + "\n" +"Ao olhar mais perto, os olhos da criança são pequenas pedras de rubis",0,3,10,false));
		ArrayItensEquip.add(new ItemEquipavelArma("Sabre","Possui uma lâmina curva",0,2,7,false));
		ArrayItensEquip.add(new ItemEquipavelArma("Balestra","Uma besta maior do que uma comum, tem o nome Bianca gravado em sua coronha",0,4,9,false)); //referência a dragon age inquisition
		ArrayItensEquip.add(new ItemEquipavelArma("Grande espada","Uma espada enorme feita de ferro maciço, como você consegue carregar isso?",0,7,20,false));
		ArrayItensEquip.add(new ItemEquipavelArma("Espada de aço","Finalmente uma espada justa",0,3.5,9,false));
		ArrayItensEquip.add(new ItemEquipavelArma("Zweihander","Espada de duas mãos, comumente usada por mercenários",0,6,12,false));

	System.out.println("Itens equipáveis inicializados");
		
	return ArrayItensEquip;
		
	}



}
