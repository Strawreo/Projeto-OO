package poo;

public class EventoAtaqueEscorpiao implements Evento{
	@Override
	public void executar(Personagem jogador) {
		System.out.println("Você sofreu um ataque de escorpião");
		jogador.perderVida(15);
		jogador.perderSanidade(10);
	}
}
