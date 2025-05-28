package ambientes;

import Sistemas.Inventario;  
import eventos.Evento;
import eventos.EventoCriatura;
import eventos.TempestadeDeAreia;
import inimigos.Escorpiao;
import inimigos.GolemDoDeserto;
import personagens.Criatura;
import java.util.ArrayList;


public class AmbienteDeserto extends Ambiente{

	
	public AmbienteDeserto(Inventario inventario) {
		super(
				"Deserto.",
				"Deserto escaldante. Poucas árvores, água, e recursos.",
				"Dificuldade 5.",
				"Bandagens.",
				"100%.",
				"Seca escaldante."
				
		);
		setInventario(inventario);
		setEventos(eventosPossiveis());
	}
	
	public ArrayList<Evento> eventosPossiveis() {
		ArrayList<Evento> eventos = new ArrayList<Evento>();
		
		ArrayList<Criatura> criaturasDeserto = new ArrayList<>();
	    criaturasDeserto.add(new Escorpiao());
	    criaturasDeserto.add(new GolemDoDeserto());
	    
	    
		eventos.add(new EventoCriatura(criaturasDeserto));
		eventos.add(new TempestadeDeAreia());
		return eventos;
	}

}
