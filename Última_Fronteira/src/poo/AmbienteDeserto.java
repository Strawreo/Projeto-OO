package poo;

import java.util.ArrayList;
import java.util.List;

public class AmbienteDeserto implements Ambiente{

private List<Evento> eventos;
private final String nome = "Deserto";
	
	public AmbienteDeserto() {
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
		ArrayList<Evento> eventosPossiveisDeserto = new ArrayList<Evento>();
		eventosPossiveisDeserto.add(new EventoAtaqueEscorpiao());
		eventosPossiveisDeserto.add(new EventoTempestadeDeAreia());
		return eventosPossiveisDeserto;
	}

}
