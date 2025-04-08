package poo;

import java.util.ArrayList;
import java.util.List;

public class AmbienteFloresta implements Ambiente {
	private List<Evento> eventos;
	
	public AmbienteFloresta() {
		this.eventos = eventosPossiveis();
	
	}

	@Override
	public List<Evento> getEventosPossiveis() {
		return new ArrayList<>(eventos);
	}
	
	public ArrayList<Evento> eventosPossiveis() {
		ArrayList<Evento> eventosPossiveisFloresta = new ArrayList<Evento>();
		eventosPossiveisFloresta.add(new EventoAtaqueDeUrso());
		eventosPossiveisFloresta.add(new EventoClimático());
		return eventosPossiveisFloresta;
	}

}
