package poo;

public class EventoClimático implements Evento {

	@Override
	public void executar(Rastreador jogador) {
		System.out.println("Aconteceu uma tempestade!!");
		jogador.perderVida(20);
	}
	
	
}
