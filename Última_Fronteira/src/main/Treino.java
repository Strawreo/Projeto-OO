package main; //Teste de ambientes : Diego Amaral

import poo.Ambiente; 
import poo.AmbienteDeserto;
import poo.AmbienteFloresta;
import poo.Evento;
import poo.GerenciadorDeEventos;
import poo.Rastreador;
import takeTheWheel.InvTakeTheWheel;
import poo.Médico;
import java.util.Scanner;

import Sistemas.Inventario;

public class Treino {

	public static void main(String[] args) {

		/*
		 * Aqui eu crio o rastreador Diego que se refere a classe rastreador
		 */
		Rastreador jogador = new Rastreador("Diego", 100, 0, 0, 100, 100, "Vazio", 22,0,10);
		GerenciadorDeEventos gerenciador = new GerenciadorDeEventos();
		Ambiente ambienteAtual = new AmbienteFloresta();
		Scanner scanner = new Scanner(System.in);
		Inventario Inv_Teste = new Inventario(10);
		InvTakeTheWheel Display = new InvTakeTheWheel(Inv_Teste,jogador);
		
		
		// contador de rodadas
		int rodada = 1;
		while(jogador.getVida() > 0) {
	
	        System.out.println("\nRodada " + rodada + " no ambiente: " + ambienteAtual.getNome());
	
	        Evento eventoSorteado = gerenciador.sortearEvento(ambienteAtual);
	        gerenciador.aplicarEvento(jogador, eventoSorteado);
	        
	        System.out.println("Deseja abrir o inventário?");
	        System.out.println("Y/N");
	        
	        String resposta = scanner.nextLine();
	        
	        if (resposta.equals("Y")) {
	        	
	        	Display.DisplayInventario();
	        } 
	        else if (resposta.equals("N")) {
	        	
	        	System.out.println("Prosseguindo ao próximo turno!");
	     
	        }
	    
	        // Simulação de mudança de ambiente
	        if (rodada == 3) { // Depois de 3 rodadas, muda o ambiente
	            ambienteAtual = new AmbienteDeserto();
	            System.out.println("\n>> O jogador chegou ao deserto! <<");
	        }
	        rodada++;
	        
		}
		
		System.out.println("Fim de jogo! A vida chegou a 0 \n");
		
	

		System.out.println(jogador.toString());

		
		for(Evento e : ambienteAtual.getEventosPossiveis()) {
			System.out.println(e.getClass().getSimpleName());
		}
		
		
		

	}
}