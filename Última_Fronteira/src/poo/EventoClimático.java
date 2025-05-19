package poo;

import takeTheWheel.InvTakeTheWheel;

public class EventoClimático implements Evento {

	@Override
	public void executar(Personagem jogador, InvTakeTheWheel Inv) {
		System.out.println("Aconteceu uma tempestade!!");
		jogador.perderVida(20);
		jogador.sentirFome(10);
	}
	
	
}
