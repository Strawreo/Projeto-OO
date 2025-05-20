package poo;

import java.util.ArrayList;
import java.util.List;

public abstract class Ambiente {
	
	private final String nomeAmbiente;
	private final String descricaoAmbiente;
	private final String dificuldadeExploracaoAmbiente;
	private String recursosDisponiveisAmbiente;
	private String probabilidadeEventosAmbiente;
	private String condicoesClimaticasAmbiente;
	
	public Ambiente(String nomeAmbiente, String descricaoAmbiente, String dificuldadeExploracaoAmbiente, String recursosDisponiveisAmbiente, String probabilidadeEventosAmbiente, String condicoesClimaticasAmbiente) {
		this.nomeAmbiente = nomeAmbiente;
		this.descricaoAmbiente = descricaoAmbiente;
		this.dificuldadeExploracaoAmbiente = dificuldadeExploracaoAmbiente;
		this.recursosDisponiveisAmbiente = recursosDisponiveisAmbiente;
		this.probabilidadeEventosAmbiente = probabilidadeEventosAmbiente;
		this.condicoesClimaticasAmbiente = condicoesClimaticasAmbiente;
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
	
	
	
	 public List<Evento> getEventosPossiveis(){
		 return new ArrayList<>();
	 }
	  

	 

}
