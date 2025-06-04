package main; 

import takeTheWheel.*;
import java.util.Scanner;
import ambientes.*;
import eventos.Evento;
import eventos.EventoAlucinacao;
import eventos.GerenciadorDeEventos;
import personagens.Personagem;


public class Main {

	public static void main(String[] args) {
		
		PersonagemTakeTheWheel escolha = new PersonagemTakeTheWheel();
		Personagem jogador = escolha.escolha();
		Evento alucinacao = new EventoAlucinacao();
		GerenciadorDeEventos gerenciador = new GerenciadorDeEventos();
		
		Ambiente ambienteAtual = new AmbienteFloresta();
		/*jogador.getInventario().obter(new ItemCraft("Tecido","Um pedaço de tecido rasgado",0), jogador);
		jogador.getInventario().obter(new ItemCraft("Pedra","É um agregado sólido que ocorre naturalmente e é constituído por um ou mais minerais ou mineraloides, em outros termos, uma pedra",0), jogador);
		jogador.getInventario().obter(new ItemCraft("Graveto","É apenas um pedaço de pau",0), jogador);
		jogador.getInventario().obter(new ItemEquipavelCabeca("Capacete de platina","O capacete tem padrões dourados bordados em forma de flores, parece nunca ter sido usado",6,5,2,false), jogador);
		jogador.getInventario().obter(new ItemEquipavelMao("Manoplas de platina","A manopla esquerda possui um anel de ouro fundido ao metal do dedo anelar, você consegue se enxergar no reflexo do metal",5,3,2,false), jogador);
		jogador.getInventario().obter(new ItemEquipavelPerna("Grevas de platina","As grevas aparentam estar intocadas, o metal refinado brilha com raios coloridos de luz",6,4,2,false), jogador);
		jogador.getInventario().obter(new ItemEquipavelArma("Grande espada","Uma espada enorme feita de ferro maciço, como você consegue carregar isso?",0,7,20,false), jogador);*/
		
		System.out.println(jogador.toString());
		System.out.println(jogador.getDescricao());
		
		Scanner scanner = new Scanner(System.in);
		InvTakeTheWheel Display = new InvTakeTheWheel(jogador.getInventario(),jogador);
	
		
		// contador de rodadas
		int rodada = 1;
		while(jogador.getVida() > 0) {
			if (rodada == 1 || rodada == 11 || rodada == 21 || rodada == 31 || rodada == 41) {
				// melhora nas mensagens excessivas do main
				System.out.println("Descrição do ambiente: " + ambienteAtual.getDescricaoAmbiente());
		        System.out.println("Dificuldade de exploração desse ambiente é " + ambienteAtual.getDificuldadeExploracaoAmbiente());
		        System.out.println("Os recursos disponíveis são " + ambienteAtual.getRecursosDisponiveisAmbiente());
		        System.out.println("A probabilidade de ocorrer eventos é de " + ambienteAtual.getProbabilidadeEventosAmbiente());
		        System.out.println("As possíveis condições climáticas são " + ambienteAtual.getCondicoesClimaticasAmbiente());
			}
			
			System.out.println("\nRodada " + rodada + " no ambiente " + ambienteAtual.getNomeAmbiente());
	        
	        Evento eventoSorteado = gerenciador.sortearEvento(ambienteAtual, jogador);
	       
	        // ele verifica se o metodo processarTurno é verdadeiro, se não for, ele encerra o loop principal pois ocorreu o fim de jogo
	        if (!gerenciador.processarTurno(jogador, eventoSorteado, Display,ambienteAtual)) break;
	        
	        gerenciador.desgasteNaturalDoPersonagem(ambienteAtual, jogador);
	        
	        System.out.println("Deseja exibir os status do personagem?");
	        System.out.println("Y/N");
	        String verStatus = scanner.nextLine();
	        
	        if (verStatus.equalsIgnoreCase("Y")) {
	            System.out.println(jogador.toString());
	        }
	        
	        System.out.println("Deseja abrir o inventário?");
	        System.out.println("Y/N");
	        
	        String resposta = scanner.nextLine();
	        
	        if (resposta.equalsIgnoreCase("Y")) {
	        	
	        	Display.displayInventario();
	        } 
	        else if (resposta.equalsIgnoreCase("N")) {
	        	
	        	System.out.println("Prosseguindo ao próximo turno!");
	     
	        }
	       

	        
	        rodada++;
	        
	     // Simulação de mudança de ambiente
	        if (rodada == 11) { // Depois de 10 rodadas, muda o ambiente
	            ambienteAtual = new AmbienteDeserto();
	        }
	       
	        if (rodada == 21) { // Depois de 10 rodadas, muda o ambiente
	            ambienteAtual = new AmbienteMontanha();  
	        }
	        if (rodada == 31) {
	        	ambienteAtual = new AmbienteRuina();
	        }
	        if (rodada == 41) {
	        	ambienteAtual = new AmbienteRuinaArenaBoss();
	        }
	        if(rodada == 42) {
	        	System.out.println("Você o derrotou\n Na última fronteira da humanidade não há mais nada sobre o que reinar\n Mesmo assim você se senta no trono.");
	        	 System.out.println(">> FIM DE JOGO <<");
	        	 break;
	        }
	    
	       
	       
	        }
			gerenciador.atualizarEventosEspeciais(ambienteAtual, jogador, alucinacao);
	       
		scanner.close();
	}
}