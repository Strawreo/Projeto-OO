package poo;
import Sistemas.*;
import java.util.ArrayList;
import java.util.Random;


public class EventoItemFloresta implements Evento {
	
	private Inventario inventario;
	private ArrayList<ClassItem> ArrayUsa,ArrayEquip,ArrayJog;
	
	
	public EventoItemFloresta(Inventario inventario, ArrayList<ClassItem> ArrayUsa,ArrayList<ClassItem> ArrayEquip,ArrayList<ClassItem> ArrayJog) {
		
		this.inventario = inventario;
		this.ArrayEquip = ArrayEquip;
		this.ArrayUsa = ArrayUsa;
		this.ArrayJog = ArrayJog;
		
		
	}
	
	@Override
	public void executar(Personagem jogador) {
		
		Random random = new Random();
		int num = random.nextInt(1, 3);
		
		if (num == 1) {
			
			int i = random.nextInt(0,3);
			this.inventario.obter(ArrayEquip.get(i));
			
			
		}
		else if(num == 2) {
			
			int i = random.nextInt(0,3);
			this.inventario.obter(ArrayUsa.get(i));
		
		}
		else if (num == 3) {
			
			int i = random.nextInt(0,3);
			this.inventario.obter(ArrayJog.get(i));
		}
		

	}



}
