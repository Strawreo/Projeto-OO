package sistemas;

import java.util.ArrayList;
import equip.*;

public class InicItensEquip {
	
public ArrayList<ClassItem> Inicializar_ItensEquip(){
	
	System.out.println("Inicializando itens equipáveis");
		
	ArrayList<ClassItem> ArrayItensEquip = new ArrayList<>();
		
		//ItemEquipavelCabeca , ItemEquipavelMao, ItemEquipavelPerna, ItemEquipavelArma
		//Organizado como: nome, descrição, defesa, peso, dano, equipado
	
	/*0*/   ArrayItensEquip.add(new ItemEquipavelCabeca("Capacete de madeira","Na verdade este capacete é um balde que você encontrou no chão",2,3,0,false)); 
	/*1*/	ArrayItensEquip.add(new ItemEquipavelMao("Luvas de couro","Luvas de couro comuns, recomendada para climas frios", 1,1,0,false));
	/*2*/	ArrayItensEquip.add(new ItemEquipavelMao("Manoplas de ferro","Estão enferrujadas mas são melhor do que nada",2,2,0,false));
	/*3*/	ArrayItensEquip.add(new ItemEquipavelPerna("Botas de couro","Famosas entre o povo comum, estão um pouco sujas",2,2,0,false));
	/*4*/	ArrayItensEquip.add(new ItemEquipavelCabeca("Capacete de ferro","Este capacete aparenta ser de ouro, ao inspecionar mais perto você repara que na verdade é um capacete de ferro revestido por uma fina folha dourada",4,4,0,false));
	/*5*/	ArrayItensEquip.add(new ItemEquipavelMao("Manoplas de bronze","Tem algo escrito nelas, você não consegue entender a língua",3,2,0,false));
	/*6*/	ArrayItensEquip.add(new ItemEquipavelPerna("Grevas de ferro","Estão um pouco desgastadas mas panela velha que faz comida boa",4,4,0,false));
	/*7*/	ArrayItensEquip.add(new ItemEquipavelCabeca("Capacete de bronze","Possui uma cortina flexível de malha presa por um selo de chumbo",5,4,0,false));
	/*8*/	ArrayItensEquip.add(new ItemEquipavelPerna("Grevas de bronze","São bem pesadas",4,4,0,false));
	/*9*/	ArrayItensEquip.add(new ItemEquipavelCabeca("Capacete de ouro","Um capacete feito de ouro puro, tem o formato da cabeça de um leão",4,2,0,false));
	/*10*/	ArrayItensEquip.add(new ItemEquipavelMao("Manoplas de ouro","O acolchoamento interno tem o formato de patas",4,2,0,false));
	/*11*/	ArrayItensEquip.add(new ItemEquipavelPerna("Grevas de ouro","Possui garras presas na ponta dos pés, como grampos",5,2,0,false));
	/*12*/	ArrayItensEquip.add(new ItemEquipavelCabeca("Capacete de platina","O capacete tem padrões dourados bordados em forma de flores, parece nunca ter sido usado",6,5,2,false));
	/*13*/	ArrayItensEquip.add(new ItemEquipavelMao("Manoplas de platina","A manopla esquerda possui um anel de ouro fundido ao metal do dedo anelar, você consegue se enxergar no reflexo do metal",5,3,2,false));
	/*14*/	ArrayItensEquip.add(new ItemEquipavelPerna("Grevas de platina","As grevas aparentam estar intocadas, o metal refinado brilha com raios coloridos de luz",6,4,2,false));
		
		//Itens de ataque 
		
	/*15*/	ArrayItensEquip.add(new ItemEquipavelArma("Espada de madeira","Alguma criança deve ter deixado cair",0,0.5,2,false));
	/*16*/	ArrayItensEquip.add(new ItemEquipavelArma("Arco","É um arco simples de madeira, sua madeira range um pouco quando arqueada",0,0.5,2,false)); //Exclusivo do arqueiro
	/*17*/	ArrayItensEquip.add(new ItemEquipavelArma("Adaga?","Uma adaga antiga, cujo punho é uma pequena escultura de uma mulher segurando uma criança" + "\n" + "É desconfortável de segurar" + "\n" +"Ao olhar mais perto, os olhos da criança são pequenas pedras de rubis",0,3,10,false));
	/*18*/	ArrayItensEquip.add(new ItemEquipavelArma("Sabre","Possui uma lâmina curva",0,2,7,false));
	/*19*/	ArrayItensEquip.add(new ItemEquipavelArma("Balestra","Uma besta maior do que uma comum, tem o nome Bianca gravado em sua coronha",0,4,9,false)); //referência a dragon age inquisition (Exclusivo do arqueiro)
	/*20*/	ArrayItensEquip.add(new ItemEquipavelArma("Grande espada","Uma espada enorme feita de ferro maciço, como você consegue carregar isso?",0,7,20,false));
	/*21*/	ArrayItensEquip.add(new ItemEquipavelArma("Espada de aço","Finalmente uma espada justa",0,3.5,9,false));
	/*22*/	ArrayItensEquip.add(new ItemEquipavelArma("Zweihander","Espada de duas mãos, comumente usada por mercenários",0,6,12,false));
	/*23*/	ArrayItensEquip.add(new ItemEquipavelArma("Marreta","Um grande martelo, feito por suas mãos",0,5,9,false)); // Exclusivo do Mecânico (Craft)
	/*24*/	ArrayItensEquip.add(new ItemEquipavelArma("Espada de pedra","Um Graveto com uma pedra afiada amarrada a ponto, está mais para uma lança",0,1.5,4,false));
	/*25*/	ArrayItensEquip.add(new ItemEquipavelArma("Espada de bronze","Produzida por um mecânico ou um ferreiro!",0,2,7,false));	
	
	System.out.println("Itens equipáveis inicializados");
		
	return ArrayItensEquip;
		
	}



}
