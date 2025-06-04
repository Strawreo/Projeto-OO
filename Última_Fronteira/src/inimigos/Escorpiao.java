package inimigos;

import personagens.Criatura;
import personagens.Personagem;

public class Escorpiao extends Criatura{

	public Escorpiao() {
		super("Escorpião", 20, 3, 10);
		
	}

	@Override
	public void atacar(Personagem jogador) {
		System.out.println("Um escorpião apareceu sem você perceber e picou você");
		jogador.perderVida(8);
	}

}
