package inimigos;

import personagens.Criatura;
import personagens.Personagem;

public class GolemDoDeserto extends Criatura{

	public GolemDoDeserto() {
		super("Golem gigante", 100, 50, 5);
		
	}

	@Override
	public void atacar(Personagem jogador) {
		System.out.println("Um golem gigante de areia aparece na sua frente");
		jogador.perderVida(5);
	}

}
