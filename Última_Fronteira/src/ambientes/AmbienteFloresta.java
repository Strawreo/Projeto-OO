package ambientes;

import java.util.ArrayList;  

import Sistemas.*;
import eventos.Evento;
import eventos.EventoCriatura;
import eventos.EventoItemFloresta;
import eventos.Tempestade;
import inimigos.Lobo;
import inimigos.Urso;
import personagens.Criatura;

public class AmbienteFloresta extends Ambiente {
		
	public AmbienteFloresta(Inventario inventario) {
		super(
				"Floresta.", 
				"Floresta úmida, com água presente e com árvores bem altas.",
				"Dificuldade 3",
				"Bandagens, madeira, água.",
				"100%.",
				"Umidade alta."
		);
		setInventario(inventario);
		setEventos(eventosPossiveis()); // aqui ele gera todos os eventos para esse ambiente onde utlizando o metodo da superclasse ele protege
	}
	
	// após estudos em herança e encapsulamento foi possível evitar MUITA repetição nesse código
	
	public ArrayList<Evento> eventosPossiveis() {
		
		ArrayList<Evento> eventos = new ArrayList<Evento>(); // criação da lista local de eventos para cada ambiente 
		
		ArrayList<Criatura> criaturasFloresta = new ArrayList<>();
	    criaturasFloresta.add(new Urso());
	    criaturasFloresta.add(new Lobo());
	    
	    
		eventos.add(new EventoCriatura(criaturasFloresta));
		eventos.add(new Tempestade());
		eventos.add(new EventoItemFloresta(getInventario(),getItensUsa(),getItensEquip(),getItensJog()));
		

		verificarInventario();
		
		return eventos; // aqui eu crio uma lista para uso próprio na classe, então não tem problema de encapsulamento
	}
	

	
	
	

	

}
