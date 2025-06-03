package inimigos;
import personagens.Criatura;
import personagens.Personagem;

public class Construto extends Criatura{
	public Construto() {
		super("Construto", 60, 25, 15);
	
	}

	@Override
	public void atacar(Personagem jogador) {
		System.out.println("O pináculo da engenharia lhe ataca \nUm Construto se atira em você");
		jogador.perderVida(25);
		jogador.perderSanidade(10);
	}

}
