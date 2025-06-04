package eventos;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import personagens.Criatura;
import personagens.Personagem;
import sistemas.InicItensCraft;
import takeTheWheel.InvTakeTheWheel;
import java.util.ArrayList;
import java.util.InputMismatchException;

import sistemas.ClassItem;

public class EventoCriatura extends Evento{
	private Criatura criatura;
	private List<Criatura> criaturasPossiveis;
	private Random random = new Random();
	Scanner sc1 = new Scanner(System.in);
	private ArrayList<ClassItem> itensCraft = new InicItensCraft().inicializarItensCraft();
	
	public EventoCriatura(List<Criatura> criaturasDoAmbiente) {
		super(
				"ataque de uma criatura.",
				"uma criatura aparece e você pode atacar ou fugir.",
				"30%.",
				"diversos atributos do seu personagem podem ser alterados.",
				"a criatura que você enfrentará depende do ambiente atual."
		);
		this.criaturasPossiveis = criaturasDoAmbiente;
	}
	
	// melhoria do metodo de avaliarPerigo para ser possivel utlizar condicional com ele se necessário
	private NivelPerigo avaliarPerigo(Criatura c) {
	    double nivel = c.getVida() + c.getDefesa();
	    if (nivel < 20) return NivelPerigo.BAIXO;
	    if (nivel < 40) return NivelPerigo.MEDIO;
	    return NivelPerigo.ALTO;
	}
	public void executar(Personagem jogador, InvTakeTheWheel Display) {
		this.criatura = criaturasPossiveis.get(random.nextInt(criaturasPossiveis.size()));
	    double vidaCriaturaCombate = criatura.getVida();
	    
	    
		
	    NivelPerigo perigo = avaliarPerigo(criatura);
	    this.setDescricaoEvento("Você encontrou um " + criatura.getNome() + " !");
		this.setImpactoEvento("O nível de perigo é de " + perigo.toString().toLowerCase());
		this.setCondicaoAtivacaoEvento("Encontro aleatório de criatura");
		
		exibirDetalhes();
		
		System.out.println("A criatura tem " + vidaCriaturaCombate + " de vida!");
		System.out.println("Aperte 1 para atacar e 2 para fugir");
		int fugir = 1;
		int decisao;
		
		while(true) {
			try {
				decisao = sc1.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("Input inválido!!");
				sc1.next();
			}
		}
		
		do {
			if (decisao == 1) {
				System.out.println("Voce atacou o " + criatura.getNome());
				double danoReal = criatura.calcularDanoRecebido(jogador.getDano());
				vidaCriaturaCombate -= danoReal;
				System.out.printf("Você causou %.2f de dano!\n", danoReal);
				if (vidaCriaturaCombate <= 0) {
					System.out.println("Você ganhou!!");
					if (criatura.getNome().equals("Rei Caído")) {
						break;
					}else {
					jogador.getInventario().obter(this.itensCraft.get(random.nextInt(0,7)), jogador);}
					
					if (jogador.getNome().equals("Rastreador")) {
						int aleatorio = random.nextInt(0,2);
						if(aleatorio == 0) {
							break;
						} else if(aleatorio == 1) {
							System.out.println("Ao vasculhar os arredores você encontra mais um item!");
							jogador.getInventario().obter(this.itensCraft.get(random.nextInt(0,8)), jogador);
						}
					}
					break;
				} else {
				System.out.printf(criatura.getNome() + " tem %.2f de vida\n", vidaCriaturaCombate);
				criatura.atacar(jogador);
				System.out.println("Aperte 1 para atacar, 2 para fugir ou 3 para abrir o inventário");
				while(true) {
					try {
						decisao = sc1.nextInt();
						break;
					} catch(InputMismatchException e) {
						System.out.println("Input inválido!!");
						sc1.next();
					}
				}}
			}else if(decisao == 2) {
				System.out.println("Voce fugiu!!!");
				fugir = decisao;
			}else if(decisao == 3) {
				Display.displayInventario();
				System.out.println("Aperte 1 para realizar um ataque ou 2 para fugir");
				while(true) {
					try {
						decisao = sc1.nextInt();
						break;
					} catch(InputMismatchException e) {
						System.out.println("Input inválido!!");
						sc1.next();
					}
				};
			}else {
				System.out.println("Numero inválido!");
				System.out.println("Aperte 1 para atacar e 2 para fugir");
				decisao = sc1.nextInt();
			}
		} while (fugir == 1);
		
				
	}
}
