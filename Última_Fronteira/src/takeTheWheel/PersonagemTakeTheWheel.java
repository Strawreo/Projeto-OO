package takeTheWheel;
import java.util.Scanner;
import java.util.ArrayList;

import personagens.Personagem;
import sistemas.InicPersonagem;

public class PersonagemTakeTheWheel {
	
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Personagem> array;
	
	public PersonagemTakeTheWheel() {
		
		InicPersonagem inicializador = new InicPersonagem();
		this.array = inicializador.inicializarPersonagens();
		
		System.out.println("Bem vindo a Última Fronteira");
		System.out.println("Aperte Enter para começar");
		
		scanner.nextLine();
	}
	
	public Personagem escolha() {
		return this.displayPersonagem();
	}
	
	public Personagem displayPersonagem() {
		
		while(true) {
		
		System.out.println("Escolha seu personagem: ");
		
		for(int i = 0; i < this.array.size(); i++ ) {
			int num = i + 1;
			System.out.println(num + ". " + this.array.get(i).getNome());
		}
		
		String decisao = scanner.nextLine();
		
		if(decisao.equals("1") || decisao.equals("Rastreador")) {
			System.out.println(this.array.get(0).getDescricao());
			System.out.println(this.array.get(0).toString());
			System.out.println("Tamanho do inventário: " + this.array.get(0).getTamanhoInventario());
			
			System.out.println("Escolher este personagem?");
			System.out.println("Y/N");
			String dec1 = scanner.nextLine();
			
			if (dec1.equals("Y") || dec1.equals("y")) {
				return this.array.get(0);
			} else {
				System.out.println("");
			}
		} else if(decisao.equals("2") || decisao.equals("Médico")) {
				System.out.println(this.array.get(1).getDescricao());
				System.out.println(this.array.get(1).toString());
				System.out.println("Tamanho do inventário: " + this.array.get(1).getTamanhoInventario());
				
				System.out.println("Escolher este personagem?");
				System.out.println("Y/N");
				String dec1 = scanner.nextLine();
			
				if (dec1.equals("Y") || dec1.equals("y")) {
					return this.array.get(1);
				} else {
					System.out.println("");
				}
			} else if(decisao.equals("3") || decisao.equals("Arqueiro")) {
				System.out.println(this.array.get(2).getDescricao());
				System.out.println(this.array.get(2).toString());
				System.out.println("Tamanho do inventário: " + this.array.get(2).getTamanhoInventario());
			
				System.out.println("Escolher este personagem?");
				System.out.println("Y/N");
				String dec1 = scanner.nextLine();
			
				if (dec1.equals("Y") || dec1.equals("y")) {
					return this.array.get(2);
				} else {
					System.out.println("");
				}
			} else if(decisao.equals("4") || decisao.equals("Zé ninguém")) {
				System.out.println(this.array.get(3).getDescricao());
				System.out.println(this.array.get(3).toString());
				System.out.println("Tamanho do inventário: " + this.array.get(3).getTamanhoInventario());
			
				System.out.println("Escolher este personagem?");
				System.out.println("Y/N");
				String dec1 = scanner.nextLine();
			
				if (dec1.equals("Y") || dec1.equals("y")) {
					return this.array.get(3);
				} else {
					System.out.println("");
				}
			} else if(decisao.equals("5") || decisao.equalsIgnoreCase("Ferreiro")) {
				System.out.println(this.array.get(4).getDescricao());
				System.out.println(this.array.get(4).toString());
				System.out.println("Tamanho do inventário: " + this.array.get(4).getTamanhoInventario());
			
				System.out.println("Escolher este personagem?");
				System.out.println("Y/N");
				String dec1 = scanner.nextLine();
			
				if (dec1.equals("Y") || dec1.equals("y")) {
					return this.array.get(4);
				} else {
					System.out.println("");
				}
			}
		}
	}
}