package eventos;

import personagens.Personagem;
import takeTheWheel.InvTakeTheWheel;

public class EventoTempestadeDeAreia extends Evento{
	
	public EventoTempestadeDeAreia() {
		super(
				"Começa uma tempestade de areia",
				"Uma tempestade de areia muito forte lhe cerca",
				"25%.",
				"você fica com medo, desidratado, com fome e perde energia",
				"apenas em desertos."
		);
	}
	
	@Override
	public void executar(Personagem jogador, InvTakeTheWheel Inv) {
		System.out.println("Evento: " + getNomeEvento());
		System.out.println("Descrição: " + getDescricaoEvento());
		System.out.println("A probabilidade de ocorrência desse evento é de: " + getProbabilidadeOcorrenciaEvento());
		System.out.println("O impacto que esse evento pode causar é " + getImpactoEvento());
		System.out.println("A condição pra ativação desse evento é " + getCondicaoAtivacaoEvento());
		System.out.println("Você está em uma tempestade de areia!");
		jogador.perderVida(8);
		jogador.perderSanidade(20);
		jogador.sentirSede(30);
	}
}
