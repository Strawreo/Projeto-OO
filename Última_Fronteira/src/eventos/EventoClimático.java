package eventos;

import personagens.Personagem;
import takeTheWheel.InvTakeTheWheel;

public abstract class EventoClimático extends Evento {
	
	public EventoClimático(String nome, String descricao, String probabilidade, String impacto, String condicao) {
		super(nome, descricao, probabilidade, impacto, condicao);
	
	}

	@Override
	public abstract void executar(Personagem jogador, InvTakeTheWheel inv);
	
	
}
