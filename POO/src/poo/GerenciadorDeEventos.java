package poo;

import java.util.List;
import java.util.Random;

public class GerenciadorDeEventos {
	
	public Evento sortearEvento(Ambiente local) {
        List<Evento> eventos = local.getEventosPossiveis();
        if (eventos.isEmpty()) return null;
        System.out.println(eventos);
        
        Random random = new Random();
        return eventos.get(random.nextInt(eventos.size())); // Sorteia um evento

	}
	public void aplicarEvento(Rastreador jogador, Evento evento) {
        if (evento != null) {
            evento.executar(jogador); // Chama o método polimórfico
        }
    }

}
