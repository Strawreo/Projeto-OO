package eventos;

import java.util.Random;
import java.util.Scanner;

import personagens.Personagem;
import sistemas.ItemUsavel;
import takeTheWheel.InvTakeTheWheel;

public class EventoNPC extends Evento{
	
	private Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	public EventoNPC() {
		super("Encontro com um estranho. Amigável?",
				"Um viajante surge, ele encara você com um olhar desconfiado.",
				"10%",
				"Ele pode oferecer ajuda ou itens",
				"Pode aparecer em qualquer ambiente"
			);

	}
	@Override
	public void executar(Personagem jogador, InvTakeTheWheel inv) {
		System.out.println("O viajante te oferece um item. Ver outro ser humano lhe faz lembrar que ainda existe chance de sobreviver");
		jogador.addToSanidade(15);
		jogador.addToEnergia(10);
		
		System.out.println("Aceitar item? \n Y/N");
		String decisao = scanner.nextLine();
		int aleatorio = random.nextInt(0,2);
		
		if (decisao.equalsIgnoreCase("Y")) {
			if (aleatorio == 0) {
				int ale = random.nextInt(0,11);
				if(ale >= 10) {
					System.out.println("O Estranho lhe entrega algo");
					jogador.getInventario().obter(new ItemUsavel("???","Cecidit et nihil in loco eius relictum est.", 4,15,0,6,5,0.2,0), jogador);
				} else {
				System.out.println("O Estranho lhe entrega um pedaço de pão");
				jogador.getInventario().obter(new ItemUsavel("Pão","Farinha de trigo, água e fermento", 4,15,0,6,5,0.2,0), jogador);}
			}else if(aleatorio == 1) {
				System.out.println("Ao chegar mais perto o Estranho se lança para cima de você!");
				System.out.println("Você toma 10 de dano!");
				jogador.takeFromDano(10);
			}
		} else if(decisao.equalsIgnoreCase("N")){
			System.out.println("Você decide não arriscar a sua sorte e vai embora sem olhar para trás");
		}
		
	}

}
