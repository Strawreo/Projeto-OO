package main; //Teste de ambientes : Diego Amaral

import poo.Ambiente; 
import poo.AmbienteDeserto;
import poo.AmbienteFloresta;
import poo.Evento;
import poo.GerenciadorDeEventos;
import poo.Rastreador;
import poo.Médico;

public class Treino {

	public static void main(String[] args) {

		/*
		 * Aqui eu crio o rastreador Diego que se refere a classe rastreador
		 */
		Médico jogador = new Médico("Diego", 100, 0, 0, 100, 100, "Vazio", 22,0,10);
		GerenciadorDeEventos gerenciador = new GerenciadorDeEventos();
		Ambiente ambienteAtual = new AmbienteFloresta();
		
		
		// contador de rodadas
		int rodada = 1;
		while(jogador.getVida() > 0) {
			
	        System.out.println("\nRodada " + rodada + " no ambiente: Floresta");
	
	        Evento eventoSorteado = gerenciador.sortearEvento(ambienteAtual);
	        gerenciador.aplicarEvento(jogador, eventoSorteado);
	            
	    
	        // Simulação de mudança de ambiente
	        if (rodada == 11) { // Depois de 3 rodadas, muda o ambiente
	            ambienteAtual = new AmbienteDeserto();
	            System.out.println("\n>> O jogador chegou ao deserto! <<");
	        }
	        rodada++;
	        
		}
		System.out.println("Fim de jogo! A vida chegou a 0 \n");
		
		jogador.perderSanidade(15);
		jogador.perderEnergia(21);

		System.out.println(jogador.toString());

		
		for(Evento e : ambienteAtual.getEventosPossiveis()) {
			System.out.println(e.getClass().getSimpleName());
		}
		
		
		

	}
}