package eventos;

import personagens.Personagem;
import takeTheWheel.InvTakeTheWheel;

public class Tempestade extends EventoClimático{

	public Tempestade() {
		super( 
				"Tempestade",
	            "Começa uma tempestade intensa, com ventos e chuva forte.",
	            "40%",
	            "Você perde energia e sanidade.",
	            "Apenas em florestas."
	           );
	}

	@Override
	public void executar(Personagem jogador, InvTakeTheWheel inv) {
		System.out.println("Começa uma tempestade!!!");
		jogador.perderEnergia(10);
		jogador.perderSanidade(15);
		
	}
	
}
