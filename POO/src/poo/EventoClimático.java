package poo;

public class EventoClimático implements Evento {

	@Override
	public void executar(Personagem jogador) {
		System.out.println("Aconteceu uma tempestade!!");
		jogador.perderVida(20);
		jogador.sentirFome(10);
	}
	
	
}
