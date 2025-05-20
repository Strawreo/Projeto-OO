package Sistemas;
import java.util.ArrayList;
import poo.*;

public class Inic_Personagem {
	
	public ArrayList<Personagem> inicializarPersonagens(){
		ArrayList<Personagem> array = new ArrayList<Personagem>();
		
		// nome, vida, fome, sede, energia, sanidade, tamanhoInventario, peso, defesa
		
		array.add(new Personagem("Rastreador","Habituado a morar na floresta" + "\n" + "Chance aumentada de encontrar itens ao explorar",100,100,120,100,100,10,30,2));
		array.add(new Personagem("Médico","Um médico" + "\n" + "Ao encontrar bandagens elas virão em dobro",80,100,100,100,100,20,20,1));
		array.add(new Personagem("Arqueiro","O rei já não precisa de sua ajuda" + "\n" + "Dá mais danos a utilizar arcos",90,100,100,100,100,15,25,1));
		array.add(new Personagem("Zé ninguém","Você não se lembra de seu nome" + "\n" + "Ao acordar no meio da floresta você não tem opção a não ser seguir em frente" + "\n" + "Nada o pode ajudar aqui",70,80,80,80,120,10,20,0)); 
		
		return array;
	}

}
