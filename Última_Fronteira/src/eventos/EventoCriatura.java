package eventos;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import personagens.Criatura;
import personagens.Personagem;
import takeTheWheel.InvTakeTheWheel;

public class EventoCriatura extends Evento{
	private Criatura criatura;
	private List<Criatura> criaturasPossiveis;
	private Random random = new Random();
	Scanner sc1 = new Scanner(System.in);
	
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
	
	private String avaliarPerigo(Criatura c) {
        double nivel = c.getVida() + c.getDefesa();
        if (nivel < 20) return "baixo";
        if (nivel < 40) return "médio";
        return "alto";
    }
	public void executar(Personagem jogador, InvTakeTheWheel Display) {
		this.criatura = criaturasPossiveis.get(random.nextInt(criaturasPossiveis.size()));
	    double vidaCriaturaCombate = criatura.getVida();
		
	    this.setDescricaoEvento("Você encontrou um " + criatura.getNome() + " !");
		this.setImpactoEvento("O nível de perigo é de " + avaliarPerigo(criatura));
		this.setCondicaoAtivacaoEvento("Encontro aleatório de criatura");
		
		System.out.println("Evento " + getNomeEvento());
		System.out.println(getDescricaoEvento());
		System.out.println("A probabilidade de ocorrência desse evento é de: " + getProbabilidadeOcorrenciaEvento());
		System.out.println(getImpactoEvento());
		System.out.println(getCondicaoAtivacaoEvento());
		
		this.setImpactoEvento("O nível de perigo é " + avaliarPerigo(criatura));
		this.setCondicaoAtivacaoEvento("Encontro aleatório de criatura");
		
		criatura.atacar(jogador);
		
		System.out.println("A criatura tem " + vidaCriaturaCombate + " de vida!");
		System.out.println("Aperte 1 para atacar e 2 para fugir");
		int fugir = 1;
		int decisao = sc1.nextInt();
		
		do {
			if (decisao == 1) {
				System.out.println("Voce atacou o " + criatura.getNome());
				vidaCriaturaCombate = (vidaCriaturaCombate - jogador.getDano());
				if (vidaCriaturaCombate <= 0) {
					System.out.println("Você ganhou!!");
					break;
				} else {
				System.out.println("A criatura tem " + vidaCriaturaCombate + " de vida!");
				System.out.println("Aperte 1 para atacar, 2 para fugir ou 3 para abrir o inventário");
				decisao = sc1.nextInt(); }
			}else if(decisao == 2) {
				System.out.println("Voce fugiu!!!");
				fugir = decisao;
			}else if(decisao == 3) {
				Display.displayInventario();
				System.out.println("Aperte 1 para realizar um ataque ou 2 para fugir");
				decisao = sc1.nextInt();
			}else {
				System.out.println("Numero inválido!");
				System.out.println("Aperte 1 para atacar e 2 para fugir");
				decisao = sc1.nextInt();
			}
		} while (fugir == 1);
		
				
	}
}
