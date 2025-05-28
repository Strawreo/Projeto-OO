package ambientes;
import eventos.Evento;
import eventos.EventoAtaqueEscorpiao;
import eventos.EventoCriatura;
import eventos.TempestadeDeAreia;
import inimigos.Escorpiao;
import inimigos.GolemDoDeserto;
import inimigos.Lobo;
import inimigos.Yeti;
import personagens.Criatura;
import sistemas.Inventario;

import java.util.ArrayList;
import java.util.List;

public class AmbienteDeserto extends Ambiente{

private List<Evento> eventos;
private Inventario inventario;
	
	public AmbienteDeserto(Inventario inventario) {
		super(
				"Deserto.",
				"Deserto escaldante. Poucas árvores, água, e recursos.",
				"Dificuldade 5.",
				"Bandagens.",
				"100%.",
				"Seca escaldante."
				
		);
		this.eventos = eventosPossiveis();
		this.inventario = inventario;
	
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
		return eventosPossiveisDeserto;
	}

}
