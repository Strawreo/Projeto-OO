package eventos;
import Sistemas.*;
import personagens.Personagem;
import takeTheWheel.InvTakeTheWheel;

import java.util.ArrayList;
import java.util.Random;


public class EventoItemFloresta extends Evento {
	
	private Inventario inventario;
	private ArrayList<ClassItem> ArrayUsa,ArrayEquip,ArrayJog;
	
	
	public EventoItemFloresta(Inventario inventario, ArrayList<ClassItem> ArrayUsa,ArrayList<ClassItem> ArrayEquip,ArrayList<ClassItem> ArrayJog) {
		super(
				"Encontro de itens.",
				"você acha um item",
				"40%.",
				"Você pega um item para o seu inventário",
				"Apenas em florestas."
		);
		
		this.inventario = inventario;
		this.ArrayEquip = ArrayEquip;
		this.ArrayUsa = ArrayUsa;
		this.ArrayJog = ArrayJog;
		
		
	}
	
	@Override
	public void executar(Personagem jogador, InvTakeTheWheel Inv) {
		System.out.println("Evento: " + getNomeEvento());
		System.out.println("Descrição: " + getDescricaoEvento());
		System.out.println("A probabilidade de ocorrência desse evento é de: " + getProbabilidadeOcorrenciaEvento());
		System.out.println("O impacto que esse evento pdoe causar é " + getImpactoEvento());
		System.out.println("A condição pra ativação desse evento é " + getCondicaoAtivacaoEvento());
		Random random = new Random();
		int num = random.nextInt(1, 3);
		
		if (num == 1) {
			int i = random.nextInt(0,22);
			this.inventario.obter(new Item_Equipável(ArrayEquip.get(i).getNome(),ArrayEquip.get(i).getDescricao(),
									((Item_Equipável)ArrayEquip.get(i)).getDefesa(),ArrayEquip.get(i).getPeso(),
									((Item_Equipável)ArrayEquip.get(i)).getDano(),false),jogador);
		}
		else if(num == 2) {
			
			int i = random.nextInt(0,3);
			this.inventario.obter(ArrayUsa.get(i),jogador);
		
		}
		else if (num == 3) {
			
			int i = random.nextInt(0,3);
			this.inventario.obter(ArrayJog.get(i),jogador);
		}
		

	}



}
