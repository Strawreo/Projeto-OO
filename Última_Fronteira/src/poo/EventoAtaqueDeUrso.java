package poo;
import takeTheWheel.*;
import java.util.Scanner;

public class EventoAtaqueDeUrso implements Evento{
	Scanner sc1 = new Scanner(System.in);
	private int vidaUrso;
	private int decisao;
	private int fugir;
	
	@Override
	public void executar(Personagem jogador, InvTakeTheWheel Display) {
		vidaUrso = 20;
		
		System.out.println("Voce sofreu o ataque de um urso!");
		jogador.perderVida(20);
		
		System.out.println("O urso tem " + vidaUrso + " de vida!");
		System.out.println("Aperte 1 para atacar e 2 para fugir");
		fugir = 1;
		int decisao = sc1.nextInt();
		
		do {
			if (decisao == 1) {
				System.out.println("Voce atacou o urso");
				System.out.println("O urso tem " + vidaUrso + " de vida!");
				System.out.println("Aperte 1 para atacar, 2 para fugir ou 3 para abrir o inventário");
				decisao = sc1.nextInt();
			}else if(decisao == 2) {
				System.out.println("Voce fugiu!!!");
				fugir = decisao;
			}else if(decisao == 3) {
				Display.DisplayInventario();
				System.out.println("Aperte 1 para realizar um ataque ou 2 para fugir");
				decisao = sc1.nextInt();
			}else if (decisao != 1 && decisao != 2 && decisao != 3) {
				System.out.println("Numero inválido!");
				System.out.println("Aperte 1 para atacar e 2 para fugir");
				decisao = sc1.nextInt();
			}
		} while (fugir == 1);
				
	}
	public void setVidaUrso(int vidaUrso) {
		this.vidaUrso = vidaUrso;
	}
	public int getVidaUrso() {
		return this.vidaUrso;
	}
	public void setDecisao(int decisao) {
		this.decisao = decisao;
	}
	public int getDecisao() {
		return this.decisao;
	}
	

}
