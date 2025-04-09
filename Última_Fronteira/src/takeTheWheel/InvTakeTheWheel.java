package takeTheWheel;
import Sistemas.Inventario;
import java.util.Scanner;

public class InvTakeTheWheel {
	
	private Scanner scanner = new Scanner(System.in);
	
	private Inventario inventario;
	
	public InvTakeTheWheel(Inventario inventario) {
		this.inventario = inventario;
	}
	
	public void DisplayInventario() {
		
		this.inventario.ler();
		System.out.println("1.Descartar");
		System.out.println("2.Equipar");
		System.out.println("3.Usar");
		System.out.println("4.Sair do Inventário");
		
		String C = this.scanner.nextLine();
		
		if (C.equals("Descartar") || C.equals("1")) {
			
			System.out.println("Qual item deseja descartar?");
			String item = this.scanner.nextLine();
			
			this.inventario.descartar(item);
			
			this.DisplayInventario();
			
		}
		
		else if (C.equals("Equipar") || C.equals("2")) {
			
			//Ainda não Implementado
			
		}
		else if (C.equals("Usar") || C.equals("3")) {
			
			//Ainda não implementado
			
		}
		else if (C.equals("Sair do Inventário") || C.equals("4")) {
			
			System.out.println("Saindo do Inventário");
			return;
			
		}
		
		else {
			
			System.out.println("Entrada Inválida!");
			this.DisplayInventario();
		}
	}
}