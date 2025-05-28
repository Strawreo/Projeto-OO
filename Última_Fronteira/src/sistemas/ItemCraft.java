package sistemas;

public class ItemCraft extends ClassItem {
	
	private int quantidade;
	
	public ItemCraft(String nome,String descricao,int quantidade) {
		
		super(nome,descricao,0.5);
		
		
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return this.quantidade;
		
	}
	
	public void addToQuantidade(int quantia) {
		this.quantidade += quantia;
	}
	
	public void takeFromQuantidade(int quantia) {
		this.quantidade-= quantia;
	}
}
