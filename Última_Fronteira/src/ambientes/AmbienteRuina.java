package ambientes;

import java.util.ArrayList;

import eventos.*;
import inimigos.Construto;
import personagens.Criatura;

public class AmbienteRuina extends Ambiente{
	public AmbienteRuina() {
		super(
				"Ruínas.", 
				"Não há mais nada aqui",
				"Dificuldade ?",
				"Nada, absolutamente nada",
				"100%.",
				"Atmosfera densa"
		);
		setEventos(eventosPossiveis());
	}
	
 public ArrayList<Evento> eventosPossiveis() {
		
		ArrayList<Evento> eventos = new ArrayList<Evento>();  
		
		ArrayList<Criatura> criaturasRuina = new ArrayList<>();
	    criaturasRuina.add(new Construto());
	    
	    eventos.add(new EventoCriatura(criaturasRuina));
		eventos.add(new EventoItemRuina());
		
		return eventos; 
	}

}
