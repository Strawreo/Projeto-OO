package ambientes;

import java.util.ArrayList;
import java.util.List;

import eventos.Evento;
import eventos.EventoAtaqueDeUrso;
import eventos.EventoClimático;
import eventos.EventoCriatura;
import eventos.EventoItemFloresta;
import eventos.Tempestade;
import inimigos.Lobo;
import inimigos.Urso;
import personagens.Criatura;
import sistemas.*;

public class AmbienteFloresta extends Ambiente {
	
	
	private List<Evento> eventos;
	private Inventario inventario;
	
	
	
	private ArrayList<ClassItem> ItensUsa = new InicItensUsa().inicializarItensUsa();
	private ArrayList<ClassItem> ItensEquip = new InicItensEquip().Inicializar_ItensEquip();
	private ArrayList<ClassItem> ItensJog = new InicItensCraft().inicializarItensCraft();
	
	public AmbienteFloresta(Inventario inventario) {
		super(
				"Floresta.", 
				"Floresta úmida, com água presente e com árvores bem altas.",
				"Dificuldade 3",
				"Bandagens, madeira, água.",
				"100%.",
				"Umidade alta."
		);
		this.inventario = inventario;
		this.eventos = eventosPossiveis();
	}
	
	
	
	public ArrayList<Evento> eventosPossiveis() {
		
		ArrayList<Evento> eventosPossiveisFloresta = new ArrayList<Evento>();
		
		ArrayList<Criatura> criaturasFloresta = new ArrayList<>();
	    criaturasFloresta.add(new Urso());
	    criaturasFloresta.add(new Lobo());
	    
	    
		eventosPossiveisFloresta.add(new EventoCriatura(criaturasFloresta));
		eventosPossiveisFloresta.add(new Tempestade());
		eventosPossiveisFloresta.add(new EventoItemFloresta(this.inventario,this.ItensUsa,this.ItensEquip,this.ItensJog));
		
		if (this.inventario == null) {
			
			System.out.println("Inventario nulo");
			
		} else {
			
			this.inventario.ler(); //debugging
		
		}
		
		
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
	

	
	public Inventario getinventario() {
		
		return this.inventario;
	}

}
