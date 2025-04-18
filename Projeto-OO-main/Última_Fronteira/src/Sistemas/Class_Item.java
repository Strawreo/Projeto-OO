package Sistemas;

public class Class_Item {

	private String nome;
	
	public Class_Item(String nome) //Estrutura básica de todos os itens 
	
	{
		this.nome = nome;
		
		System.out.println(nome);
	}
	
	public String getNome() {
		
		return this.nome;
		
	}

}
