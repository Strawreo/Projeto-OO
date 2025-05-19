package takeTheWheel;
import Sistemas.Inventario;
import java.util.Scanner;
import poo.Personagem;

public class InvTakeTheWheel {
	
	private Scanner scanner = new Scanner(System.in);
	private Inventario inventario;
	private Personagem personagem;
	
	public InvTakeTheWheel(Inventario inventario,Personagem personagem) {
		this.inventario = inventario;
		this.personagem = personagem;
	}
	
	public void DisplayInventario() {
		
		this.inventario.ler();
		System.out.println("");
		System.out.println("Opções: ");
		System.out.println("1.Descartar");
		System.out.println("2.Equipar");
		System.out.println("3.Usar");
		System.out.println("4.Sair do Inventário");
		
		String C = this.scanner.nextLine();
		
		if (C.equals("Descartar") || C.equals("1")) {
			
			System.out.println("Qual item deseja descartar?");
			String item = this.scanner.nextLine();
			
			this.inventario.descartar(item, personagem);
			
			this.DisplayInventario();
			
		}
		
		else if (C.equals("Equipar") || C.equals("2")) {
			
			System.out.println("Qual item deseja equipar?");
			String item = this.scanner.nextLine();
			
			this.inventario.equipar(item, personagem);
			
			this.DisplayInventario();
			
		}
		
		else if (C.equals("Usar") || C.equals("3")) {
			
			System.out.println("Qual item deseja usar?");
			String item = this.scanner.nextLine();
			
			this.inventario.usar(item, personagem);
			
			this.DisplayInventario();
			
		}
		else if (C.equals("Sair do Inventário") || C.equals("4")) {
			
			System.out.println("Saindo do Inventário");
			System.out.println("Prosseguindo ao próximo turno!");
			return;
			
		}
		
		else {
			
			System.out.println("Entrada Inválida!");
			this.DisplayInventario();
		}
	}
}