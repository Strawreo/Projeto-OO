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
import sistemas.ItemCraft;


public class Treino {

	public static void main(String[] args) {
		
		PersonagemTakeTheWheel escolha = new PersonagemTakeTheWheel();
		Personagem jogador = escolha.escolha();
		
		GerenciadorDeEventos gerenciador = new GerenciadorDeEventos();
		
		Ambiente ambienteAtual = new AmbienteFloresta();
		jogador.getInventario().obter(new ItemCraft("Tecido","Um pedaço de tecido rasgado",0), jogador);
		jogador.getInventario().obter(new ItemCraft("Pedra","É um agregado sólido que ocorre naturalmente e é constituído por um ou mais minerais ou mineraloides, em outros termos, uma pedra",0), jogador);
		jogador.getInventario().obter(new ItemCraft("Graveto","É apenas um pedaço de pau",0), jogador);
		System.out.println(jogador.toString());
		System.out.println(jogador.getDescricao());
		
		Scanner scanner = new Scanner(System.in);
		InvTakeTheWheel Display = new InvTakeTheWheel(jogador.getInventario(),jogador);
	
		
		// contador de rodadas
		int rodada = 1;
		while(jogador.getVida() > 0) {
			if (rodada == 1 || rodada == 4 || rodada == 8) {
				// melhora nas mensagens excessivas do main
				System.out.println("Descrição do ambiente: " + ambienteAtual.getDescricaoAmbiente());
		        System.out.println("Dificuldade de exploração desse ambiente é " + ambienteAtual.getDificuldadeExploracaoAmbiente());
		        System.out.println("Os recursos disponíveis são " + ambienteAtual.getRecursosDisponiveisAmbiente());
		        System.out.println("A probabilidade de ocorrer eventos é de " + ambienteAtual.getProbabilidadeEventosAmbiente());
		        System.out.println("As possíveis condições climáticas são " + ambienteAtual.getCondicoesClimaticasAmbiente());
			}
			if (jogador.getVida() <= 0) {
				System.out.println("Fim de jogo! A vida chegou a 0 \n");
				break;
			} else {
	
	        System.out.println("\nRodada " + rodada + " no ambiente " + ambienteAtual.getNomeAmbiente());
	        
	        
	
	        Evento eventoSorteado = gerenciador.sortearEvento(ambienteAtual, jogador);
	        gerenciador.aplicarEvento(jogador, eventoSorteado, Display);
	        gerenciador.verificarSanidadeFinal(jogador);
	        
	        System.out.println("Deseja abrir o inventário?");
	        System.out.println("Y/N");
	        
	        String resposta = scanner.nextLine();
	        
	        if (resposta.equals("Y")) {
	        	
	        	Display.displayInventario();
	        } 
	        else if (resposta.equals("N")) {
	        	
	        	System.out.println("Prosseguindo ao próximo turno!");
	     
	        }
	        rodada++;
	    
	        // Simulação de mudança de ambiente
	        if (rodada == 4) { // Depois de 10 rodadas, muda o ambiente
	            ambienteAtual = new AmbienteDeserto();
	        }
	       
	        if (rodada == 8) { // Depois de 10 rodadas, muda o ambiente
	            ambienteAtual = new AmbienteMontanha();  
	        }
	       
	        }
	        
			
	        
		}
		
		scanner.close();
		
	
		
	

		System.out.println(jogador.toString());

		
		for(Evento e : ambienteAtual.getEventosPossiveis()) {
			System.out.println(e.getClass().getSimpleName());
		}
		
		
		

	}
}