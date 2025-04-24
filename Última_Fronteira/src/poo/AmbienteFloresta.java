package poo;

import java.util.ArrayList;
import java.util.List;
import Sistemas.*;

public class AmbienteFloresta implements Ambiente {
	private List<Evento> eventos;
	private final String nome = "Floresta";
	private Inventario inventario;
	
	
	private ArrayList<Class_Item> ItensUsa = new Inic_ItensUsa().Inicializar_ItensUsa();
	private ArrayList<Class_Item> ItensEquip = new Inic_ItensEquip().Inicializar_ItensEquip();
	private ArrayList<Class_Item> ItensJog = new Inic_ItensJog().Inicializar_ItensJog();
	
	public AmbienteFloresta(Inventario inventario) {
		this.eventos = eventosPossiveis();
		this.inventario = inventario;
		
		
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
		ArrayList<Evento> eventosPossiveisFloresta = new ArrayList<Evento>();
		eventosPossiveisFloresta.add(new EventoAtaqueDeUrso());
		eventosPossiveisFloresta.add(new EventoClimático());
		eventosPossiveisFloresta.add(new EventoItemFloresta(this.inventario,this.ItensUsa,this.ItensEquip,this.ItensJog));
		
		this.getinventario().ler(); //debugging
		
		return eventosPossiveisFloresta;
	}
	
	public Inventario getinventario() {
		
		return this.inventario;
	}

}
