package ambientes;

import java.util.ArrayList;
import java.util.List;

import eventos.Evento;

public abstract class Ambiente {
	
	private final String nomeAmbiente;
	private final String descricaoAmbiente;
	private final String dificuldadeExploracaoAmbiente;
	private String recursosDisponiveisAmbiente;
	private String probabilidadeEventosAmbiente;
	private String condicoesClimaticasAmbiente;
	
	private ArrayList<Evento> eventos;// lista privada do ambiente atual e preenchida em cada ambiente pelo setEventos
	
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
	
	public void setEventos(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public abstract ArrayList<Evento> eventosPossiveis();// todas as classes filhas de Ambiente precisam obrigatoriamente implementar esse método
	
	public List<Evento> getEventosPossiveis(){
		 return new ArrayList<>(eventos);// lista defensiva para evitar problemas no futuro(opcional)
	}
	
	
	

	 

}
