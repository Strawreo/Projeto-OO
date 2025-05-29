package ambientes;
import eventos.Evento;

import eventos.EventoCriatura;
import eventos.TempestadeDeAreia;
import inimigos.Escorpiao;
import inimigos.GolemDoDeserto;
import personagens.Criatura;
import eventos.EventoItemDeserto;

import java.util.ArrayList;
import java.util.List;

public class AmbienteDeserto extends Ambiente{

private List<Evento> eventos;
	
	public AmbienteDeserto() {
		super(
				"Deserto.",
				"Deserto escaldante. Poucas árvores, água, e recursos.",
				"Dificuldade 5.",
				"Bandagens.",
				"100%.",
				"Seca escaldante."
				
		);
		this.eventos = eventosPossiveis();
	
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
	
	public ArrayList<Evento> eventosPossiveis() {
		ArrayList<Evento> eventosPossiveisDeserto = new ArrayList<Evento>();
		
		ArrayList<Criatura> criaturasDeserto = new ArrayList<>();
	    criaturasDeserto.add(new Escorpiao());
	    criaturasDeserto.add(new GolemDoDeserto());
	    
	    
		eventosPossiveisDeserto.add(new EventoCriatura(criaturasDeserto));
		eventosPossiveisDeserto.add(new TempestadeDeAreia());
		eventosPossiveisDeserto.add(new EventoItemDeserto());
		return eventosPossiveisDeserto;
	}

}
