package ambientes;

import java.util.ArrayList;
import java.util.List;

import eventos.Evento;
import eventos.EventoCriatura;
import eventos.EventoItemFloresta;
import eventos.Tempestade;
import inimigos.Lobo;
import inimigos.Urso;
import personagens.Criatura;
import sistemas.*;

public class AmbienteFloresta extends Ambiente {
	
	
	private List<Evento> eventos;
	
	public AmbienteFloresta() {
		super(
				"Floresta.", 
				"Floresta úmida, com água presente e com árvores bem altas.",
				"Dificuldade 3",
				"Bandagens, madeira, água.",
				"100%.",
				"Umidade alta."
		);
		
		this.eventos = eventosPossiveis();
	}
	
	
	
	public ArrayList<Evento> eventosPossiveis() {
		
		ArrayList<Evento> eventosPossiveisFloresta = new ArrayList<Evento>();
		
		ArrayList<Criatura> criaturasFloresta = new ArrayList<>();
	    criaturasFloresta.add(new Urso());
	    criaturasFloresta.add(new Lobo());
	    
	    
		eventosPossiveisFloresta.add(new EventoCriatura(criaturasFloresta));
		eventosPossiveisFloresta.add(new Tempestade());
		eventosPossiveisFloresta.add(new EventoItemFloresta());
		
		return eventosPossiveisFloresta;
	}
	

	String nome = getNomeAmbiente();
	String descricao = getDescricaoAmbiente();
	String dificuldade = getDificuldadeExploracaoAmbiente();
	String recursos = getRecursosDisponiveisAmbiente();
	String probabilidade = getProbabilidadeEventosAmbiente();
	String clima = getCondicoesClimaticasAmbiente();
	
	public List<Evento> getEventosPossiveis() {
		return new ArrayList<>(eventos);
	}

}
