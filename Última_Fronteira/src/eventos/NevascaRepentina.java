package eventos;

import personagens.Personagem;
import takeTheWheel.InvTakeTheWheel;

public class NevascaRepentina extends EventoClimático{

	public NevascaRepentina() {
		super( 
				"Nevasca",
	            "Neve intensa cobre tudo, você perde calor e energia.",
	            "35%",
	            "Você perde energia e vida.",
	            "Apenas nas montanhas."
	           );

	}

	@Override
	public void executar(Personagem jogador, InvTakeTheWheel inv) {
		System.out.println("Começou uma nevasca repentinamente!");
		jogador.perderSanidade(10);
		jogador.perderEnergia(5);
		jogador.perderVida(5);
	}

}
