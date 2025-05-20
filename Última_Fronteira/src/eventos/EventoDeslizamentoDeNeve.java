package eventos;

import personagens.Personagem;
import takeTheWheel.InvTakeTheWheel;

public class EventoDeslizamentoDeNeve extends Evento{
	public EventoDeslizamentoDeNeve() {
		super(
				"Acontece um deslizamento de neve",
				"A neve começa a descer aparentemente devagar, mas conforme ela chega perto, parece que ela está mais rápida",
				"14%.",
				"você tem que fugir e procurar abrigo",
				"apenas nas montanhas."
		);
		
	}
	public void executar(Personagem jogador, InvTakeTheWheel Display) {
		System.out.println("Evento: " + getNomeEvento());
		System.out.println("Descrição: " + getDescricaoEvento());
		System.out.println("A probabilidade de ocorrência desse evento é de: " + getProbabilidadeOcorrenciaEvento());
		System.out.println("O impacto que esse evento pode causar é " + getImpactoEvento());
		System.out.println("A condição pra ativação desse evento é " + getCondicaoAtivacaoEvento());
		System.out.println("Aconteceu uma tempestade de neve");
		jogador.perderVida(10);
		jogador.sentirFome(10);
	}
}
