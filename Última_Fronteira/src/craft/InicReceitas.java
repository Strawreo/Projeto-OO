package craft;
import java.util.ArrayList;
import java.util.Arrays;

import sistemas.*;

public class InicReceitas {
	
	private ArrayList<Receita> receitas = new ArrayList<Receita>();
	
	public ArrayList<Receita> inicializarReceitas(){
		
		InicItensCraft inicCraft = new InicItensCraft();
		InicItensEquip inicEquip = new InicItensEquip();
		InicItensUsa inicUsa = new InicItensUsa();
		
		ArrayList<ClassItem> craftaveis = inicCraft.inicializarItensCraft();
		ArrayList<ClassItem> equipaveis = inicEquip.Inicializar_ItensEquip();
		ArrayList<ClassItem> usaveis = inicUsa.inicializarItensUsa();
		
		
		ArrayList<ClassItem> espadaDeMadeiraIng = new ArrayList<>(Arrays.asList(
			    craftaveis.get(3) //Graveto
			));
		ArrayList<ClassItem> espadaDePedraIng = new ArrayList<>(Arrays.asList(
			    craftaveis.get(3), //Graveto
			    craftaveis.get(1) //Pedra
			));
		ArrayList<ClassItem> bandagensIng = new ArrayList<>(Arrays.asList(
			    craftaveis.get(2) //Tecido
			));
		ArrayList<ClassItem> arcoIng = new ArrayList<>(Arrays.asList(
			    craftaveis.get(3), //Graveto
			    craftaveis.get(2)  //Tecido
			));
		
		
		this.receitas.add(new Receita(espadaDeMadeiraIng,equipaveis.get(15)));
		this.receitas.add(new Receita(espadaDePedraIng,equipaveis.get(24)));
		this.receitas.add(new Receita(bandagensIng,usaveis.get(0)));
		this.receitas.add(new Receita(arcoIng,equipaveis.get(16)));
		
		
		return this.receitas;
	}
	
	public ArrayList<Receita> inicializarReceitasFerr(){
		InicItensCraft inicCraft = new InicItensCraft();
		InicItensEquip inicEquip = new InicItensEquip();
		InicItensUsa inicUsa = new InicItensUsa();
		
		ArrayList<ClassItem> craftaveis = inicCraft.inicializarItensCraft();
		ArrayList<ClassItem> equipaveis = inicEquip.Inicializar_ItensEquip();
		ArrayList<ClassItem> usaveis = inicUsa.inicializarItensUsa();
		
		
		ArrayList<ClassItem> espadaDeMadeiraIng = new ArrayList<>(Arrays.asList(
			    craftaveis.get(3) //Graveto
			));
		ArrayList<ClassItem> espadaDePedraIng = new ArrayList<>(Arrays.asList(
			    craftaveis.get(3), //Graveto
			    craftaveis.get(1) //Pedra
			));
		ArrayList<ClassItem> bandagensIng = new ArrayList<>(Arrays.asList(
			    craftaveis.get(2) //Tecido
			));
		ArrayList<ClassItem> arcoIng = new ArrayList<>(Arrays.asList(
			    craftaveis.get(3), //Graveto
			    craftaveis.get(2)  //Tecido
			));
		ArrayList<ClassItem> marretaIng = new ArrayList<>(Arrays.asList( //Ferreiro *Exclusivo
			    craftaveis.get(3), //Graveto
			    craftaveis.get(4)  //Ferro Bruto
			));
		ArrayList<ClassItem> espadaDeBronzeIng = new ArrayList<>(Arrays.asList( //Ferreiro
			    craftaveis.get(3), //Graveto
			    craftaveis.get(6)  //bronze
			));
		
		this.receitas.add(new Receita(espadaDeMadeiraIng,equipaveis.get(15)));
		this.receitas.add(new Receita(espadaDePedraIng,equipaveis.get(24)));
		this.receitas.add(new Receita(bandagensIng,usaveis.get(0)));
		this.receitas.add(new Receita(arcoIng,equipaveis.get(16)));
		this.receitas.add(new Receita(marretaIng,equipaveis.get(23)));
		this.receitas.add(new Receita(espadaDeBronzeIng,equipaveis.get(25)));
		
		return this.receitas;
	}
}
