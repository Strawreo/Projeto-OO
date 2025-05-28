package eventos;
import personagens.Personagem;
import takeTheWheel.*;

public abstract class Evento {
	
	private String nomeEvento;
	private String descricaoEvento;
	private String probabilidadeOcorrenciaEvento;
	private String impactoEvento;
	private String condicaoAtivacaoEvento;
	
	public Evento(String nomeEvento, String descricaoEvento, String probabilidadeOcorrenciaEvento, String impactoEvento, String condicaoAtivacaoEvento) {
		this.nomeEvento = nomeEvento;
		this.descricaoEvento = descricaoEvento;
		this.probabilidadeOcorrenciaEvento = probabilidadeOcorrenciaEvento;
		this.impactoEvento = impactoEvento;
		this.condicaoAtivacaoEvento = condicaoAtivacaoEvento;
	}
	public String getNomeEvento() {
		return this.nomeEvento;
	}
	public String getDescricaoEvento() {
		return this.descricaoEvento;
	}
	public String getProbabilidadeOcorrenciaEvento() {
		return this.probabilidadeOcorrenciaEvento;
	}
	public String getImpactoEvento() {
		return this.impactoEvento;
	}
	public String getCondicaoAtivacaoEvento() {
		return this.condicaoAtivacaoEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}
	public void setProbabilidadeOcorrenciaEvento(String probabilidadeOcorrenciaEvento) {
		this.probabilidadeOcorrenciaEvento = probabilidadeOcorrenciaEvento;
	}
	public void setImpactoEvento(String impactoEvento) {
		this.impactoEvento = impactoEvento;
	}
	public void setCondicaoAtivacaoEvento(String condicaoAtivacaoEvento) {
		this.condicaoAtivacaoEvento = condicaoAtivacaoEvento;
	}
	
	public abstract void executar(Personagem jogador, InvTakeTheWheel Inv);
	
	

}
