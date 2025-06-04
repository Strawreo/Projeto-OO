package takeTheWheel;
import personagens.Personagem;
import sistemas.*;
import java.util.ArrayList;
import java.util.Scanner;
import craft.*;

public class InvTakeTheWheel {
	
	private Scanner scanner = new Scanner(System.in);
	private Inventario inventario;
	private Personagem personagem;
	private ArrayList<Receita> receitas;
	
	
	public InvTakeTheWheel(Inventario inventario,Personagem personagem) {
		this.inventario = inventario;
		this.personagem = personagem;
		InicReceitas receita = new InicReceitas();
		
		if(personagem.getNome().equals("Ferreiro")) {
			this.receitas = receita.inicializarReceitasFerr();
		} else {
			this.receitas = receita.inicializarReceitas();	
		}
}
	
	public void displayInventario() throws NullPointerException{
		
		this.inventario.ler();
		System.out.println("");
		System.out.println("Opções: ");
		System.out.println("1.Descartar");
		System.out.println("2.Equipar / Desequipar");
		System.out.println("3.Usar");
		System.out.println("4.Inspecionar");
		System.out.println("5.Criar");
		System.out.println("6.Status");
		System.out.println("7.Sair do Inventário");
		
		String C = this.scanner.nextLine();
		
		if (C.equals("Descartar") || C.equals("1")) {
			
			System.out.println("Qual item deseja descartar?");
			String item = this.scanner.nextLine();
			
			this.inventario.descartar(item, personagem);
			
			this.displayInventario();
			
		}
		
		else if (C.equals("Equipar") || C.equals("2") || C.equals("Desequipar")) {
			
			System.out.println("Qual item deseja equipar/desequipar?");
			String item = this.scanner.nextLine();
			
			this.inventario.equipar(item, personagem);
			
			this.displayInventario();
			
		}
		
		else if (C.equals("Usar") || C.equals("3")) {
			
			System.out.println("Qual item deseja usar?");
			String item = this.scanner.nextLine();
			
			this.inventario.usar(item, personagem);
			
			this.displayInventario();
			
		}
		
		else if (C.equals("Inspecionar") || C.equals("4")) {
			
			System.out.println("Qual item deseja inspecionar?");
			String item = this.scanner.nextLine();
			
			this.inventario.inspecionar(item);
			
			this.displayInventario();
		}
		
		else if (C.equals("Criar") || C.equals("5")) {
			
			this.inventario.ler(receitas);
			
			System.out.println("Qual item deseja criar?");
			String itemCriar = this.scanner.nextLine();
			
			ReadInventario read = this.readRec(itemCriar);
			
			if (read.getBool()) {
				this.inventario.criar(receitas.get(read.getI()), personagem);
			} else {
				System.out.println("Receita não encontrada!");
				this.displayInventario();
			}
			
			this.displayInventario();
			
		}
		
		else if(C.equalsIgnoreCase("Status") || C.equals("6")) {
			
			String string = this.personagem.toString();
			System.out.println(string);
			this.displayInventario();
			
		}
		
		else if (C.equals("Sair do Inventário") || C.equals("7")) {
			
			System.out.println("Saindo do Inventário");
			System.out.println("Prosseguindo ao próximo turno!");
			return;
			
		}
		
		else {
			
			System.out.println("Entrada Inválida!");
			this.displayInventario();
		}
	}
	
	public ReadInventario readRec(String nome) {
		
		boolean achou = false;
		int local = -1;
		boolean isInteger = true;

		try {
		    Integer.parseInt(nome);
		} catch (NumberFormatException e) {
		    isInteger = false;
		}

		if (isInteger) {
			try {
				int numero = Integer.parseInt(nome);
				this.receitas.get(numero);
				return new ReadInventario(true,numero-1);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Entrada inválida!");
				return new ReadInventario(false,-1);
			}
} else {
		    for (int i = 0; i < this.receitas.size();i++) {
		        if (nome.equals(this.receitas.get(i).getNome())) {
		        achou = true;
		        local = i;
		        break;
		    }

		}
		    if (achou) {
		        return new ReadInventario(achou,local);
		    } else {
		        return new ReadInventario(false,-1);
		    }
		}
	}
	
	public Inventario getInventario() {
		return this.inventario;
	}
}