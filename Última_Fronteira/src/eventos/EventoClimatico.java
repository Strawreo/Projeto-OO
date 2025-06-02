package eventos;

import personagens.Personagem;
import takeTheWheel.InvTakeTheWheel;

public abstract class EventoClimatico extends Evento {
	
	public EventoClimatico(String nome, String descricao, String probabilidade, String impacto, String condicao) {
		super(nome, descricao, probabilidade, impacto, condicao);
	
	}

	@Override
	public void executar(Personagem jogador, InvTakeTheWheel inv) {
		exibirDetalhes();
	}
	
	
}
