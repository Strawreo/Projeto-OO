package Sistemas;

public class ClassItem {

	private String nome;
	private String descricao;
	private double peso;
	
	public ClassItem(String nome,String descricao,double peso) //Estrutura básica de todos os itens 
	
	{
		this.nome = nome;
		this.descricao = descricao;
		this.peso = peso;
	}
	
	public String getNome() {
		
		return this.nome;
		
	}
	
	public String getDescricao() {
		return this.descricao;
		
	}
	
	public double getPeso() {
		
		return this.peso;
	}

}
