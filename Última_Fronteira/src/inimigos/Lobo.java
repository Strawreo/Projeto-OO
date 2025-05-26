package inimigos;

import personagens.Criatura;
import personagens.Personagem;

public class Lobo extends Criatura{

	public Lobo() {
		super("Lobo", 10, 3, 2);
		
	}

	@Override
	public void atacar(Personagem jogador) {
		System.out.println("Um lobo ataca rapidamente");
		jogador.perderVida(2);
		jogador.perderSanidade(8);
	}

}
