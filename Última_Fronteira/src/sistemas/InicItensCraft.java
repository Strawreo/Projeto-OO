package sistemas;

import java.util.ArrayList;

public class InicItensCraft {
	
	private ArrayList<ClassItem> Array;
	
	public InicItensCraft() {
		
		System.out.println("Incializando itens jogáveis");
		
		ArrayList<ClassItem> ArrayItensJog = new ArrayList<>();
		
		/*0*/ArrayItensJog.add(new ItemCraft("Garrafa de vidro","Uma pena que esteja vazia",0)); // nome, descrição, quantia (Todos os itens jogaveis possuim peso(0.5)
		/*1*/ArrayItensJog.add(new ItemCraft("Pedra","É um agregado sólido que ocorre naturalmente e é constituído por um ou mais minerais ou mineraloides, em outros termos, uma pedra",0));
		/*2*/ArrayItensJog.add(new ItemCraft("Tecido","Um pedaço de tecido rasgado",0));
		/*3*/ArrayItensJog.add(new ItemCraft("Graveto","É apenas um pedaço de pau",0));
		/*4*/ArrayItensJog.add(new ItemCraft("Ferro Bruto","Um ferreiro seria útil agora",0));
		/*5*/ArrayItensJog.add(new ItemCraft("Ouro","Será ouro de tolo? Apenas um ferreiro saberia dizer",0));
		/*6*/ArrayItensJog.add(new ItemCraft("Bronze","Liga metálica de cobre estanho, um ferreiro pode achá-lo útil",0));
		/*7*/ArrayItensJog.add(new ItemCraft("???","Parece ser algum tipo de metal, um ferreiro poderia lhe falar do que se trata",0));
		System.out.println("Itens Jogáveis Inicializados");
		
		this.Array = ArrayItensJog;
		
	}
	
public ArrayList<ClassItem> inicializarItensCraft(){
	
		return this.Array;
		
	}

}
		
		

