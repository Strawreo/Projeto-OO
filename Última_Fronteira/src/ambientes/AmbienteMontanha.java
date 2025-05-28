package ambientes;

import java.util.ArrayList; 
import java.util.List;

import eventos.Evento;
import eventos.EventoAtaqueDeYeti;
import eventos.EventoCriatura;
import eventos.NevascaRepentina;
import inimigos.Lobo;
import inimigos.Urso;
import inimigos.Yeti;
import personagens.Criatura;
import sistemas.ClassItem;
import sistemas.InicItensEquip;
import sistemas.InicItensCraft;
import sistemas.InicItensUsa;
import sistemas.Inventario;


public class AmbienteMontanha extends Ambiente{
	private List<Evento> eventos;
	private Inventario inventario;
	
	
	
	private ArrayList<ClassItem> ItensUsa = new InicItensUsa().inicializarItensUsa();
	private ArrayList<ClassItem> ItensEquip = new InicItensEquip().Inicializar_ItensEquip();
	private ArrayList<ClassItem> ItensJog = new InicItensCraft().inicializarItensCraft();
	
	public AmbienteMontanha(Inventario inventario) {
		super(
				"Montanhas.", 
				"Picos montanhosos, íngrimes com neve. Chão bem instável",
				"Dificuldade 6",
				"Bandagens, madeira, água, comida, metais raros",
				"100%",
				"Muito frio, tempestade de neve"
		);
		this.inventario = inventario;
		this.eventos = eventosPossiveis();
	}
	
	public ArrayList<Evento> eventosPossiveis() {
		ArrayList<Evento> eventosPossiveisFloresta = new ArrayList<Evento>();
		
		ArrayList<Criatura> criaturasMontanha = new ArrayList<>();
	    criaturasMontanha.add(new Yeti());
	    criaturasMontanha.add(new Lobo());
	    
	    
		eventosPossiveisFloresta.add(new EventoCriatura(criaturasMontanha));
		
		eventosPossiveisFloresta.add(new NevascaRepentina());
		
		
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
