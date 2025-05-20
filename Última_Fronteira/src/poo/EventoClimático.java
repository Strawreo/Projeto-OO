package poo;

import takeTheWheel.InvTakeTheWheel;

public class EventoClimático extends Evento {
	
	public EventoClimático() {
		super(
				"Tempestade",
				"Começa uam tempestade",
				"20%.",
				"Você fica com medo e com frio",
				"Apenas nas florestas."
		);
		
	}

	public void executar(Personagem jogador, InvTakeTheWheel Display) {
		System.out.println("Evento: " + getNomeEvento());
		System.out.println("Descrição: " + getDescricaoEvento());
		System.out.println("A probabilidade de ocorrência desse evento é de: " + getProbabilidadeOcorrenciaEvento());
		System.out.println("O impacto que esse evento pdoe causar é " + getImpactoEvento());
		System.out.println("A condição pra ativação desse evento é " + getCondicaoAtivacaoEvento());
		System.out.println("Aconteceu uma tempestade!!");
		jogador.perderVida(20);
		jogador.sentirFome(10);
	}
	
	
}
