package ambientes;

import java.util.ArrayList;
import java.util.List;

import Sistemas.ClassItem;
import Sistemas.Inic_ItensEquip;
import Sistemas.Inic_ItensJog;
import Sistemas.Inic_ItensUsa;
import Sistemas.Inventario;
import eventos.Evento;
import eventos.EventoAtaqueDeYeti;
import eventos.EventoDeslizamentoDeNeve;

public class AmbienteMontanha extends Ambiente{
	private List<Evento> eventos;
	private Inventario inventario;
	
	
	
	private ArrayList<ClassItem> ItensUsa = new Inic_ItensUsa().Inicializar_ItensUsa();
	private ArrayList<ClassItem> ItensEquip = new Inic_ItensEquip().Inicializar_ItensEquip();
	private ArrayList<ClassItem> ItensJog = new Inic_ItensJog().Inicializar_ItensJog();
	
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
		eventosPossiveisFloresta.add(new EventoAtaqueDeYeti());
		eventosPossiveisFloresta.add(new EventoDeslizamentoDeNeve());
		
		
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
