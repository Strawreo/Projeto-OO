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
	/*private ArrayList<ClassItem> itensCraft = new InicItensCraft().inicializarItensCraft();*/
	
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
		exibirDetalhes();
		Random random = new Random();
		int num = random.nextInt(1, 3);
		
		if (num == 1) {
			int i = random.nextInt(0,26);
			jogador.getInventario().obter(itensEquip.get(i), jogador);
		}
		else if(num == 2) {
			
			int i = random.nextInt(0,5);
			jogador.getInventario().obter(itensUsa.get(i), jogador);
		
		}
		/*else if (num == 3) {
			
			int i = random.nextInt(0,7);
			jogador.getInventario().obter(itensCraft.get(i), jogador);
		}*/
		
	}
}
