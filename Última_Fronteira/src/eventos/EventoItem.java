package eventos;

import java.util.ArrayList;
import java.util.Random;

import personagens.Personagem;
import sistemas.ClassItem;
import sistemas.InicItensCraft;
import sistemas.InicItensEquip;
import sistemas.InicItensUsa;
import takeTheWheel.InvTakeTheWheel;

public abstract class EventoItem extends Evento {
	
	private ArrayList<ClassItem> itensUsa = new InicItensUsa().inicializarItensUsa();
	private ArrayList<ClassItem> itensEquip = new InicItensEquip().Inicializar_ItensEquip();
	private ArrayList<ClassItem> itensCraft = new InicItensCraft().inicializarItensCraft();
	
	public EventoItem(String nome) {
		super(
				"Encontro de itens.",
				"você acha um item",
				"40%.",
				"Você pega um item para o seu inventário",
				"Apenas em:  " + nome + "."
				);
	}
	
	@Override
	public void executar(Personagem jogador, InvTakeTheWheel Inv) {
		System.out.println("Evento: " + getNomeEvento());
		System.out.println("Descrição: " + getDescricaoEvento());
		System.out.println("A probabilidade de ocorrência desse evento é de: " + getProbabilidadeOcorrenciaEvento());
		System.out.println("O impacto que esse evento pdoe causar é " + getImpactoEvento());
		System.out.println("A condição pra ativação desse evento é " + getCondicaoAtivacaoEvento());
		Random random = new Random();
		int num = random.nextInt(1, 4);
		
		if (num == 1) {
			int i = random.nextInt(0,24);
			jogador.getInventario().obter(itensEquip.get(i), jogador);
		}
		else if(num == 2) {
			
			int i = random.nextInt(0,3);
			jogador.getInventario().obter(itensUsa.get(i), jogador);
		
		}
		else if (num == 3) {
			
			int i = random.nextInt(0,7);
			jogador.getInventario().obter(itensCraft.get(i), jogador);
		}
		
	}

}
