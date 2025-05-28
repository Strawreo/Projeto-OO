package ambientes;

import java.util.ArrayList;  
import Sistemas.Inventario;
import eventos.Evento;
import eventos.EventoCriatura;
import eventos.NevascaRepentina;
import inimigos.Lobo;
import inimigos.Yeti;
import personagens.Criatura;


public class AmbienteMontanha extends Ambiente{
	
	public AmbienteMontanha(Inventario inventario) {
		super(
				"Montanhas.", 
				"Picos montanhosos, íngrimes com neve. Chão bem instável",
				"Dificuldade 6",
				"Bandagens, madeira, água, comida, metais raros",
				"100%",
				"Muito frio, tempestade de neve"
		);
		setInventario(inventario);
		setEventos(eventosPossiveis());
	}
	
	public ArrayList<Evento> eventosPossiveis() {
		ArrayList<Evento> eventos = new ArrayList<Evento>();
		
		ArrayList<Criatura> criaturasMontanha = new ArrayList<>();
	    criaturasMontanha.add(new Yeti());
	    criaturasMontanha.add(new Lobo());
	    
	    
		eventos.add(new EventoCriatura(criaturasMontanha));		
		eventos.add(new NevascaRepentina());
		
		
		return eventos;
	}
}
