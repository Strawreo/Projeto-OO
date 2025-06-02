package eventos;

import personagens.Personagem;
import takeTheWheel.InvTakeTheWheel;

public class EventoAbrigo extends Evento{

	public EventoAbrigo() {
		super(
				"Abrigo encontrado.",
				"Você encontra um abrigo, aparenta ser seguro.",
				"15%",
				"Você recupera energia e sanidade",
				"Pode aparecer em florestas e montanhas"
		);
			
	}
	@Override
	public void executar(Personagem jogador, InvTakeTheWheel inv) {
		System.out.println("Você passa a noite no abrigo, descansa um pouco. Pensa nos próximos passos");
		jogador.addToEnergia(30);
		jogador.addToSanidade(20);
	}

}
