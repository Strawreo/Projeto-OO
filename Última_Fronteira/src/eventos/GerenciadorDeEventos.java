package eventos;

import java.util.List; 
import takeTheWheel.*;
import java.util.Random;

import ambientes.Ambiente;
import personagens.Personagem;
import eventos.EventoAlucinacao;

public class GerenciadorDeEventos {
	
	public Evento sortearEvento(Ambiente local, Personagem jogador) {
        List<Evento> eventos = local.getEventosPossiveis();
        
        if (jogador.getSanidade() <= 30) {
            eventos.add(new EventoAlucinacao()); 
        }
        
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
	public void verificarSanidadeFinal(Personagem jogador) {
	    if (jogador.getSanidade() <= 0) {
	        System.out.println("\n>>> SUA SANIDADE CHEGOU A ZERO <<<");
	        System.out.println("Você não consegue mais distinguir realidade de ilusão.");
	        System.out.println("Sua mente colapsa completamente...");
	        System.out.println(">> FIM DE JOGO <<");
	        System.exit(0); // encerra o programa
	    }
	}

}
