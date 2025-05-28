package takeTheWheel;
import Sistemas.Inventario;
import personagens.Personagem;

import java.util.Scanner;

public class InvTakeTheWheel {
	
	private Scanner scanner = new Scanner(System.in);
	private Inventario inventario;
	private Personagem personagem;
	
	public InvTakeTheWheel(Inventario inventario,Personagem personagem) {
		this.inventario = inventario;
		this.personagem = personagem;
	}
	
	public void DisplayInventario() throws NullPointerException{
		
		this.inventario.ler();
		System.out.println("");
		System.out.println("Opções: ");
		System.out.println("1.Descartar");
		System.out.println("2.Equipar / Desequipar");
		System.out.println("3.Usar");
		System.out.println("4.Inspecionar");
		System.out.println("5.Criar *Ainda não implementado*");
		System.out.println("6.Sair do Inventário");
		
		String C = this.scanner.nextLine();
		
		if (C.equals("Descartar") || C.equals("1")) {
			
			System.out.println("Qual item deseja descartar?");
			String item = this.scanner.nextLine();
			
			this.inventario.descartar(item, personagem);
			
			this.DisplayInventario();
			
		}
		
		else if (C.equals("Equipar") || C.equals("2") || C.equals("Desequipar")) {
			
			System.out.println("Qual item deseja equipar/desequipar?");
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
		
		else if (C.equals("Inspecionar") || C.equals("4")) {
			
			System.out.println("Qual item deseja inspecionar?");
			String item = this.scanner.nextLine();
			
			this.inventario.inspecionar(item);
			
			this.DisplayInventario();
		}
		
		else if (C.equals("Criar") || C.equals("5")) {
			
			/*System.out.println("Quais itens você deseja combinar?");
			System.out.println("Item 1: ");
			String item1 = this.scanner.nextLine();
			System.out.println("Item 2: ");
			String item2 = this.scanner.nextLine(); // ainda deve ser implementado!!
			
			this.DisplayInventario();*/
			
			this.DisplayInventario();
			
		}
		
		else if (C.equals("Sair do Inventário") || C.equals("6")) {
			
			System.out.println("Saindo do Inventário");
			System.out.println("Prosseguindo ao próximo turno!");
			return;
			
		}
		
		else {
			
			System.out.println("Entrada Inválida!");
			this.DisplayInventario();
		}
	}
	
	public Inventario getInventario() {
		return this.inventario;
	}
}