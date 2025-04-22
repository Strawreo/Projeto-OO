package poo;

import java.util.ArrayList;
import java.util.List;

public class AmbienteFloresta implements Ambiente {
	private List<Evento> eventos;
	private final String nome = "Floresta";
	
	public AmbienteFloresta() {
		this.eventos = eventosPossiveis();
	
	}
	
	@Override
	public String getNome() {
		return nome;
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
