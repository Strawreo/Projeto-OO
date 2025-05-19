package poo;

import java.util.List;
import takeTheWheel.*;
import java.util.Random;

public class GerenciadorDeEventos {
	
	public Evento sortearEvento(Ambiente local) {
        List<Evento> eventos = local.getEventosPossiveis();
        if (eventos.isEmpty()) return null;
       
        
        Random random = new Random();
        return eventos.get(random.nextInt(eventos.size())); 
	}
	public void aplicarEvento(Personagem jogador, Evento evento, InvTakeTheWheel Inv) {
        if (evento != null) {
        	
        	if (evento instanceof EventoItemFloresta) {
        		System.out.println("Evento de Item encontrado!"); //debugging
        		((EventoItemFloresta)evento).executar(jogador, Inv);
        		
        	} else {
            evento.executar(jogador, Inv); }
        }
    }

}
