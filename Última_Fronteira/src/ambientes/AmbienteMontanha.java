package ambientes;

import java.util.ArrayList; 
import java.util.List;

import eventos.Evento;

import eventos.EventoCriatura;
import eventos.NevascaRepentina;
import inimigos.Lobo;
import inimigos.Urso;
import inimigos.Yeti;
import personagens.Criatura;
import eventos.EventoItemMontanha;


public class AmbienteMontanha extends Ambiente{
	private List<Evento> eventos;
	
	public AmbienteMontanha() {
		super(
				"Montanhas.", 
				"Picos montanhosos, íngrimes com neve. Chão bem instável",
				"Dificuldade 6",
				"Bandagens, madeira, água, comida, metais raros",
				"100%",
				"Muito frio, tempestade de neve"
		);
	
		this.eventos = eventosPossiveis();
	}
	
	public ArrayList<Evento> eventosPossiveis() {
		ArrayList<Evento> eventosPossiveisMontanha = new ArrayList<Evento>();
		
		ArrayList<Criatura> criaturasMontanha = new ArrayList<>();
	    criaturasMontanha.add(new Yeti());
	    criaturasMontanha.add(new Lobo());
	    criaturasMontanha.add(new Urso());
	    
	    
		eventosPossiveisMontanha.add(new EventoCriatura(criaturasMontanha));
		eventosPossiveisMontanha.add(new NevascaRepentina());
		eventosPossiveisMontanha.add(new EventoItemMontanha());
		
		return eventosPossiveisMontanha;
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
