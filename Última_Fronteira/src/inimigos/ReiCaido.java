package inimigos;
import personagens.Criatura;
import personagens.Personagem;

public class ReiCaido extends Criatura{
	public ReiCaido() {
		super("Rei Caído", 80, 23, 20);
		
	}

	@Override
	public void atacar(Personagem jogador) {
		System.out.println("Os restos mortais de um grande homem se jogam na sua direção \n Apenas uma marionete.");
		jogador.perderVida(20);
		jogador.perderSanidade(10);
	}

}
