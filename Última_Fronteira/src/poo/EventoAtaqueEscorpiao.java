package poo;

import takeTheWheel.InvTakeTheWheel;

public class EventoAtaqueEscorpiao extends Evento{
	
	public EventoAtaqueEscorpiao() {
		super(
				"Ataque de Escorpião.",
				"Um escorpião furtivo aparece e lhe pica",
				"10%.",
				"Você fica envenenado",
				"Apenas em desertos."
		);
		
	}
	
	@Override
	public void executar(Personagem jogador, InvTakeTheWheel Inv) {
		System.out.println("Você sofreu um ataque de escorpião");
		System.out.println("Evento: " + getNomeEvento());
		System.out.println("Descrição: " + getDescricaoEvento());
		System.out.println("A probabilidade de ocorrência desse evento é de: " + getProbabilidadeOcorrenciaEvento());
		System.out.println("O impacto que esse evento pdoe causar é " + getImpactoEvento());
		System.out.println("A condição pra ativação desse evento é " + getCondicaoAtivacaoEvento());
		jogador.perderVida(15);
		jogador.perderSanidade(10);
	}
}
