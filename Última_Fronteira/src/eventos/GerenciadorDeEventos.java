package eventos;

import java.util.List;  
import takeTheWheel.*;
import java.util.Random;

import ambientes.Ambiente;
import personagens.Personagem;

public class GerenciadorDeEventos {
	
	public Evento sortearEvento(Ambiente local, Personagem jogador) {
	    List<Evento> eventos = local.getEventosPossiveis();

	    // Chance de nenhum evento acontecer
	    Random rand = new Random();
	    if (rand.nextDouble() < 0.2) { // 20% de chance de local seguro
	        return null;
	    }
	    // se não achar um local seguro, algum evento de criatura, climatico ou de item será encontrado

	    if (eventos.isEmpty()) return null;

	    return eventos.get(rand.nextInt(eventos.size())); 
	}

	/*
	 * aqui ele atualiza a lista de eventos, e se a sanidade estiver baixa ele
	 * adiciona o evento alucinação quando a sanidade aumenta, o evento alucinação é
	 * removido
	 */
	public void atualizarEventosEspeciais(Ambiente ambiente, Personagem jogador, Evento alucinacao) {
	    if (jogador.getSanidade() <= 30) {
	        ambiente.adicionarEvento(alucinacao);
	    } else {
	        ambiente.removerEvento(alucinacao);
	    }
	}
	public void aplicarEvento(Personagem jogador, Evento evento, InvTakeTheWheel Inv) {
        if (evento != null) {
        	
        	if (evento instanceof EventoItem) {
        		System.out.println("Evento de Item encontrado!"); //debugging
        		((EventoItem)evento).executar(jogador, Inv);
        		
        	} else {
            evento.executar(jogador, Inv); }
        }
    }
	
	/*
	 * esse método processa o turno e aplica o evento caso os status de game over
	 * sejam falso, ele verifica os status de alerta do jogador se tiver algum baixo
	 * ele entra nas condicionais dele, se tiver tudo certo, ele retorna true e o
	 * jogo continua
	 */
	public boolean processarTurno(Personagem jogador, Evento evento, InvTakeTheWheel inv) {
		 if (evento == null) {
		        System.out.println("Você encontrou um local calmo...");
		        
		        double chanceNarrativa = Math.random();
		        
		        if (chanceNarrativa < 0.3) {
		            System.out.println("Você encontrou um abrigo.");
		            new EventoAbrigo().executar(jogador, inv);
		        } else if (chanceNarrativa < 0.6) {
		            System.out.println("Você encontrou um estranho pelo caminho...");
		            new EventoNPC().executar(jogador, inv);
		        } else {
		            System.out.println("Nada aconteceu. Você aproveita para descansar um pouco.");
		            jogador.addToEnergia(15);
		            jogador.addToSanidade(5);
		        }
		    } else {
		        aplicarEvento(jogador, evento, inv);
		    }

		    if (verificarStatusDeGameOver(jogador)) return false;
		    verificarStatusDeAlerta(jogador);
		    return true;
	}
	
	public boolean verificarStatusDeAlerta(Personagem jogador) {
		boolean alerta = false;
		
		if (jogador.getVida() <= 80) {
			System.out.println("\n>>> SUA VIDA ESTÁ BAIXA <<<");
	        System.out.println("Use algum item para se curar \n");
			alerta = true;
		}
		if (jogador.getEnergia() <= 30) {
			System.out.println("\n>>> SUA ENERGIA ESTÁ BAIXA <<<");
	        System.out.println("Use algum item ou descanse na fogueira para recuperar\n");
	        alerta = true;
		}
		if (jogador.getSanidade() <= 30) {
			System.out.println("\n>>> SUA SANIDADE ESTÁ BAIXA <<<");
	        System.out.println("Use algum item para recuperar sanidade\n");
	        alerta = true;
		}
		if (jogador.getFome() <= 30) {
			System.out.println("\n>>> SUA FOME ESTÁ ALTA <<<");
	        System.out.println("Use algum item para se alimentar e diminuir a fome\n");
	        alerta = true;
		}
		if (jogador.getSede() <= 30) {
			System.out.println("\n>>> SUA SEDE ESTÁ ALTA <<<");
	        System.out.println("Use algum item para se hidratar e diminuir a sede\n");
	        alerta = true;
		}
		return alerta;
	}
	public boolean verificarStatusDeGameOver(Personagem jogador) {
		if (jogador.getVida() <= 0) {
			System.out.println("\n>>> SUA VIDA CHEGOU A ZERO <<<");
	        System.out.println("Você está ferido demais para continuar sua jornada");
	        System.out.println("Seu corpo já não aguenta mais continuar");
	        System.out.println(">> FIM DE JOGO <<");
			return true;
		}
		if (jogador.getEnergia() <= 0) {
			System.out.println("\n>>> SUA ENERGIA CHEGOU A ZERO <<<");
	        System.out.println("Você está cansado demais para continuar e acaba desmaiando");
	        System.out.println("Mas dessa vez, você nunca mais vai acordar...");
	        System.out.println(">> FIM DE JOGO <<");
			return true;
		}
		if (jogador.getSanidade() <= 0) {
			System.out.println("\n>>> SUA SANIDADE CHEGOU A ZERO <<<");
	        System.out.println("Você não consegue mais distinguir realidade de ilusão.");
	        System.out.println("Sua mente colapsa completamente...");
	        System.out.println(">> FIM DE JOGO <<");
			return true;
		}
		if (jogador.getFome() <= 0) {
			System.out.println("\n>>> SUA FOME CHEGOU NO LIMITE <<<");
	        System.out.println("Você ficou faminto e perdeu o controle da mente");
	        System.out.println("Seu corpo não tem forças para continuar");
	        System.out.println(">> FIM DE JOGO <<");
			return true;
		}
		if (jogador.getSede() <= 0) {
			System.out.println("\n>>> SUA SEDE CHEGOU NO LIMITE <<<");
	        System.out.println("Você ficou sedento e perdeu o controle da mente");
	        System.out.println("Sua mente não consegue continuar");
	        System.out.println(">> FIM DE JOGO <<");
			return true;
		}
		return false;
	}

}
