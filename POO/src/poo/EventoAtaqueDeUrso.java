package poo;

public class EventoAtaqueDeUrso implements Evento{

	@Override
	public void executar(Rastreador jogador) {
		System.out.println("Voce sofreu o ataque de um urso!");
		jogador.perderVida(20);
		
	}
	
	

}
