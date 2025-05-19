package poo;

public class EventoTempestadeDeAreia implements Evento{
	
	@Override
	public void executar(Personagem jogador) {
		System.out.println("Você está em uma tempestade de areia!");
		jogador.perderVida(8);
		jogador.perderSanidade(20);
		jogador.sentirSede(30);
	}
}
