package ambientes;

import java.util.ArrayList;
import java.util.List;

import Sistemas.ClassItem;
import Sistemas.Inic_ItensEquip;
import Sistemas.Inic_ItensJog;
import Sistemas.Inic_ItensUsa;
import Sistemas.Inventario;
import eventos.Evento;

public abstract class Ambiente {
	
	private final String nomeAmbiente;
	private final String descricaoAmbiente;
	private final String dificuldadeExploracaoAmbiente;
	private String recursosDisponiveisAmbiente;
	private String probabilidadeEventosAmbiente;
	private String condicoesClimaticasAmbiente;
	
	private Inventario inventario;
	private ArrayList<Evento> eventos;// lista privada do ambiente atual e preenchida em cada ambiente pelo setEventos
	
	private ArrayList<ClassItem> ItensUsa = new Inic_ItensUsa().Inicializar_ItensUsa();
	private ArrayList<ClassItem> ItensEquip = new Inic_ItensEquip().Inicializar_ItensEquip();
	private ArrayList<ClassItem> ItensJog = new Inic_ItensJog().Inicializar_ItensJog();
	
	public Ambiente(String nomeAmbiente, String descricaoAmbiente, String dificuldadeExploracaoAmbiente, String recursosDisponiveisAmbiente, String probabilidadeEventosAmbiente, String condicoesClimaticasAmbiente) {
		this.nomeAmbiente = nomeAmbiente;
		this.descricaoAmbiente = descricaoAmbiente;
		this.dificuldadeExploracaoAmbiente = dificuldadeExploracaoAmbiente;
		this.recursosDisponiveisAmbiente = recursosDisponiveisAmbiente;
		this.probabilidadeEventosAmbiente = probabilidadeEventosAmbiente;
		this.condicoesClimaticasAmbiente = condicoesClimaticasAmbiente;
		
		this.eventos = new ArrayList<>();
		
	}
	
	public String getNomeAmbiente() {
		return this.nomeAmbiente;
	}
	public String getDescricaoAmbiente() {
		return this.descricaoAmbiente;
	}
	public String getDificuldadeExploracaoAmbiente() {
		return this.dificuldadeExploracaoAmbiente;
	}
	public String getRecursosDisponiveisAmbiente() {
		return this.recursosDisponiveisAmbiente;
	}
	public String getProbabilidadeEventosAmbiente() {
		return this.probabilidadeEventosAmbiente;
	}
	public String getCondicoesClimaticasAmbiente() {
		return this.condicoesClimaticasAmbiente;
	}
	
	public Inventario getInventario() {
		return inventario;
	}
	
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	
	public void setEventos(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public void verificarInventario() {
	    if (getInventario() == null) {
	        System.out.println("Inventário nulo");
	    } else {
	        getInventario().ler();
	    }
	}
	public abstract ArrayList<Evento> eventosPossiveis();// todas as classes filhas de Ambiente precisam obrigatoriamente implementar esse método
	
	public List<Evento> getEventosPossiveis(){
		 return new ArrayList<>(eventos);// lista defensiva para evitar problemas no futuro(opcional)
	}

	public ArrayList<ClassItem> getItensJog() {
		return ItensJog;
	}

	public void setItensJog(ArrayList<ClassItem> itensJog) {
		ItensJog = itensJog;
	}
	
	public ArrayList<ClassItem> getItensUsa(){
		return ItensUsa;
	}
	
	public void setItensUsa(ArrayList<ClassItem> itensUsa) {
		ItensUsa = itensUsa;
	}
	public ArrayList<ClassItem> getItensEquip(){
		return ItensEquip;
	}
	public void setItensEquip(ArrayList<ClassItem> itensEquip) {
		ItensEquip = itensEquip;
	}
	
	
	

	 

}
