package inimigos;

import personagens.Criatura;
import personagens.Personagem;

public class Yeti extends Criatura{

	public Yeti() {
		super("Yeti", 60, 20, 25);
	
	}

	@Override
	public void atacar(Personagem jogador) {
		System.out.println("O abominável homem das neves aparece, lhe amedronta e lhe ataca");
		jogador.perderVida(25);
		jogador.perderSanidade(10);
	}

}
