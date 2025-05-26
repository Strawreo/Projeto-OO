package eventos;

import personagens.Personagem;
import takeTheWheel.InvTakeTheWheel;

public class EventoAlucinacao extends Evento{

	public EventoAlucinacao() {
		super(
	            "Alucinação",
	            "Você acredita estar sendo perseguido por algo... mas não há nada lá.",
	            "100%",
	            "Nenhum efeito real, mas você entra em pânico.",
	            "Somente com sanidade baixa."
	        );

	}
	@Override
    public void executar(Personagem jogador, InvTakeTheWheel inv) {
        System.out.println("Você começa a correr desesperadamente de algo invisível!");
        jogador.perderSanidade(5);
        jogador.perderEnergia(5);
        System.out.println("Mas não havia nada lá...");
    }

}
