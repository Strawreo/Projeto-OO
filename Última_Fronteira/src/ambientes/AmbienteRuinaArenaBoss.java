package ambientes;

import java.util.ArrayList;

import eventos.Evento;
import eventos.EventoCriatura;
import inimigos.ReiCaido;
import personagens.Criatura;

public class AmbienteRuinaArenaBoss extends Ambiente{
	public AmbienteRuinaArenaBoss() {
		super(
				"O fim.", 
				"Onde já se ergueu um império agora não resta nada",
				"Dificuldade ?",
				"Apenas a última fagulha de uma civilização",
				"100%.",
				"Só ele está no caminho de um trono de cinzas"
		);
		setEventos(eventosPossiveis());
	}
	
public ArrayList<Evento> eventosPossiveis() {
		
		ArrayList<Evento> eventos = new ArrayList<Evento>();  
		
		ArrayList<Criatura> arenaBoss = new ArrayList<>();
	    arenaBoss.add(new ReiCaido());
	    
	    eventos.add(new EventoCriatura(arenaBoss));
		
		return eventos; 
	}
}
