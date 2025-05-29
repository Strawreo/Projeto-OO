package ambientes;

import java.util.ArrayList;  
import eventos.*;
import inimigos.Lobo;
import inimigos.Yeti;
import personagens.Criatura;


public class AmbienteMontanha extends Ambiente{
	
	public AmbienteMontanha() {
		super(
				"Montanhas.", 
				"Picos montanhosos, íngrimes com neve. Chão bem instável",
				"Dificuldade 6",
				"Bandagens, madeira, água, comida, metais raros",
				"100%",
				"Muito frio, tempestade de neve"
		);
		
		setEventos(eventosPossiveis());
	}
	
	public ArrayList<Evento> eventosPossiveis() {
		ArrayList<Evento> eventos = new ArrayList<Evento>();
		
		ArrayList<Criatura> criaturasMontanha = new ArrayList<>();
	    criaturasMontanha.add(new Yeti());
	    criaturasMontanha.add(new Lobo());
	    
	    
		eventos.add(new EventoCriatura(criaturasMontanha));		
		eventos.add(new NevascaRepentina());
		eventos.add(new EventoItemMontanha());
		
		
		return eventos;
	}
}
