package poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmbienteFloresta implements Ambiente {
	private List<Evento> eventos;
	
	public AmbienteFloresta() {
		this.eventos = new ArrayList<>(Arrays.asList(new EventoClimático()));
		eventos.add(new EventoAtaqueDeUrso());
	
	}

	@Override
	public List<Evento> getEventosPossiveis() {
		return new ArrayList<>(eventos);
	}

}
