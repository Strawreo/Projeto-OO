package main; 

import takeTheWheel.*;
import java.util.Scanner;
//import Sistemas.*;

import ambientes.Ambiente;
import ambientes.AmbienteDeserto;
import ambientes.AmbienteFloresta;
import ambientes.AmbienteMontanha;
import eventos.Evento;
import eventos.GerenciadorDeEventos;
import personagens.Personagem;


public class Treino {

	public static void main(String[] args) {
		
		PersonagemTakeTheWheel escolha = new PersonagemTakeTheWheel();
		Personagem jogador = escolha.escolha();
		
		GerenciadorDeEventos gerenciador = new GerenciadorDeEventos();
		
		Ambiente ambienteAtual = new AmbienteFloresta(jogador.getInventario());
		
		System.out.println(jogador.toString());
		System.out.println(jogador.getDescricao());
		
		Scanner scanner = new Scanner(System.in);
		InvTakeTheWheel Display = new InvTakeTheWheel(jogador.getInventario(),jogador);
	
		
		// contador de rodadas
		int rodada = 1;
		while(jogador.getVida() > 0) {
			
			if (jogador.getVida() <= 0) {
				break;
			} else {
	
	        System.out.println("\nRodada " + rodada + " no ambiente " + ambienteAtual.getNomeAmbiente());
	        System.out.println("Descrição do ambiente: " + ambienteAtual.getDescricaoAmbiente());
	        System.out.println("Dificuldade de exploração desse ambiente é " + ambienteAtual.getDificuldadeExploracaoAmbiente());
	        System.out.println("Os recursos disponíveis são " + ambienteAtual.getRecursosDisponiveisAmbiente());
	        System.out.println("A probabilidade de ocorrer eventos é de " + ambienteAtual.getProbabilidadeEventosAmbiente());
	        System.out.println("As possíveis condições climáticas são " + ambienteAtual.getCondicoesClimaticasAmbiente());
	        
	
	        Evento eventoSorteado = gerenciador.sortearEvento(ambienteAtual);
	        gerenciador.aplicarEvento(jogador, eventoSorteado, Display);
	        
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
	        if (rodada == 10) { // Depois de 10 rodadas, muda o ambiente
	            ambienteAtual = new AmbienteDeserto(Display.getInventario());
	            System.out.println("\n>> O jogador chegou ao deserto! <<");
	            System.out.println("\nRodada " + rodada + " no ambiente " + ambienteAtual.getNomeAmbiente());
		        System.out.println("Descrição do ambiente: " + ambienteAtual.getDescricaoAmbiente());
		        System.out.println("Dificuldade de exploração desse ambiente é " + ambienteAtual.getDificuldadeExploracaoAmbiente());
		        System.out.println("Os recursos disponíveis são " + ambienteAtual.getRecursosDisponiveisAmbiente());
		        System.out.println("A probabilidade de ocorrer eventos é de " + ambienteAtual.getProbabilidadeEventosAmbiente());
		        System.out.println("As possíveis condições climáticas são " + ambienteAtual.getCondicoesClimaticasAmbiente());
	        }
	        rodada++;
	        if (rodada == 20) { // Depois de 10 rodadas, muda o ambiente
	            ambienteAtual = new AmbienteMontanha(Display.getInventario());
	            System.out.println("\n>> O jogador chegou as montanhas! <<");
	            System.out.println("\nRodada " + rodada + " no ambiente " + ambienteAtual.getNomeAmbiente());
		        System.out.println("Descrição do ambiente: " + ambienteAtual.getDescricaoAmbiente());
		        System.out.println("Dificuldade de exploração desse ambiente é " + ambienteAtual.getDificuldadeExploracaoAmbiente());
		        System.out.println("Os recursos disponíveis são " + ambienteAtual.getRecursosDisponiveisAmbiente());
		        System.out.println("A probabilidade de ocorrer eventos é de " + ambienteAtual.getProbabilidadeEventosAmbiente());
		        System.out.println("As possíveis condições climáticas são " + ambienteAtual.getCondicoesClimaticasAmbiente());
	        }
	       
	        }
	        
			
	        
		}
		
		scanner.close();
		
		System.out.println("Fim de jogo! A vida chegou a 0 \n");
		
	

		System.out.println(jogador.toString());

		
		for(Evento e : ambienteAtual.getEventosPossiveis()) {
			System.out.println(e.getClass().getSimpleName());
		}
		
		
		

	}
}