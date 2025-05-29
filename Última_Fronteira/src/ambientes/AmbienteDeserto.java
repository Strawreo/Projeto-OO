package ambientes;

import eventos.*;
import inimigos.Escorpiao;
import inimigos.GolemDoDeserto;
import personagens.Criatura;
import java.util.ArrayList;


public class AmbienteDeserto extends Ambiente{

	
	public AmbienteDeserto() {
		super(
				"Deserto.",
				"Deserto escaldante. Poucas árvores, água, e recursos.",
				"Dificuldade 5.",
				"Bandagens.",
				"100%.",
				"Seca escaldante."
				
		);
	
		setEventos(eventosPossiveis());
	}
	
	public ArrayList<Evento> eventosPossiveis() {
		ArrayList<Evento> eventos = new ArrayList<Evento>();
		
		ArrayList<Criatura> criaturasDeserto = new ArrayList<>();
	    criaturasDeserto.add(new Escorpiao());
	    criaturasDeserto.add(new GolemDoDeserto());
	    
	    
		eventos.add(new EventoCriatura(criaturasDeserto));
		eventos.add(new TempestadeDeAreia());
		eventos.add(new EventoItemDeserto());
		return eventos;
	}

}
