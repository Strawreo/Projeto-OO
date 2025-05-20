package poo;

import java.util.ArrayList;
import java.util.List;
import Sistemas.*;

public class AmbienteFloresta extends Ambiente {
	
	
	private List<Evento> eventos;
	private Inventario inventario;
	
	
	
	private ArrayList<ClassItem> ItensUsa = new Inic_ItensUsa().Inicializar_ItensUsa();
	private ArrayList<ClassItem> ItensEquip = new Inic_ItensEquip().Inicializar_ItensEquip();
	private ArrayList<ClassItem> ItensJog = new Inic_ItensJog().Inicializar_ItensJog();
	
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
		eventosPossiveisFloresta.add(new EventoAtaqueDeUrso());
		eventosPossiveisFloresta.add(new EventoClimático());
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
