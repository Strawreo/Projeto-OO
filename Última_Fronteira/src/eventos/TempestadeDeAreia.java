package eventos;

import personagens.Personagem;
import takeTheWheel.InvTakeTheWheel;

public class TempestadeDeAreia extends EventoClimático{

	public TempestadeDeAreia() {
		super( 
				"Tempesta de areia",
	            "Uma forte tempestade de areia que diminui sua sanidade, energia e fica com muita sede",
	            "35%",
	            "Você perde energia, vida e fica com sede",
	            "Apenas nos desertos."
	           );
	
	}

	@Override
	public void executar(Personagem jogador, InvTakeTheWheel inv) {
		System.out.println("Começou uma forte tempestade de areia");
		jogador.perderEnergia(10);
		jogador.perderSanidade(20);
		jogador.addToSede(30);
		
	}

}
