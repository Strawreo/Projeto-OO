package eventos;

import personagens.Personagem;
import takeTheWheel.InvTakeTheWheel;

public class EventoAtaqueDeYeti extends Evento{
	public EventoAtaqueDeYeti() {
		super(
				"Ataque do Abominável Homem das Neves.",
				"Ele aparece na sua frente e você está encurralado",
				"5%.",
				"você TEM que enfrentar ele por algumas rodadas",
				"apenas nas montanhas."
		);
		
	}
	
	@Override
	public void executar(Personagem jogador, InvTakeTheWheel Inv) {
		System.out.println("Você sofreu um ataque do Yeti");
		System.out.println("Evento: " + getNomeEvento());
		System.out.println("Descrição: " + getDescricaoEvento());
		System.out.println("A probabilidade de ocorrência desse evento é de: " + getProbabilidadeOcorrenciaEvento());
		System.out.println("O impacto que esse evento pode causar é " + getImpactoEvento());
		System.out.println("A condição pra ativação desse evento é " + getCondicaoAtivacaoEvento());
		jogador.perderVida(25);
	}
}
