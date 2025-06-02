package eventos;

import personagens.Personagem;
import takeTheWheel.InvTakeTheWheel;

public class EventoNPC extends Evento{

	public EventoNPC() {
		super("Encontro com um estranho. Amigável?",
				"Um viajante surge, ele encara você com um olhar desconfiado.",
				"10%",
				"Ele pode oferecer ajuda ou itens",
				"Pode aparecer em qualquer ambiente"
			);

	}
	@Override
	public void executar(Personagem jogador, InvTakeTheWheel inv) {
		System.out.println("O viajante te oferece um item. Ver outro ser humano lhe faz lembrar que ainda existe chance de sobreviver");
		jogador.addToSanidade(15);
		jogador.addToEnergia(10);
		// adicionar item?
	}

}
