package inimigos;

import personagens.Criatura;
import personagens.Personagem;

public class Urso extends Criatura{

	public Urso() {
		super("Urso", 20, 5, 5);
		
	}

	@Override
	public void atacar(Personagem jogador) {
		 System.out.println("O urso te golpeia brutalmente!");
	     jogador.perderVida(10);
		
	}
	
}
