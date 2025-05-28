package sistemas;
import personagens.Personagem;


public class ItemEquipavel extends ClassItem {
	
	private double defesa;
	private boolean equipado;
	private double dano;
	
	public ItemEquipavel(String nome,String descricao,double defesa, double peso,double dano,boolean equipado) {
		
		super(nome,descricao,peso);
		
		this.defesa = defesa;
		this.equipado = equipado;
		this.setDano(dano);
		
		
	}
	
	public void equipar(Personagem personagem) {
		if (this.getEquipado()) {
			System.out.println("Item já equipado!");
		}
		else {
			
			this.equipado = true;
			personagem.addToDefesa(this.getDefesa());
			personagem.addToPeso(this.getPeso());
			personagem.addToDano(this.getDano());
			System.out.println("Item Equipado!");
		
		}
	}
	
	public void desequipar(Personagem personagem) {
		if (this.getEquipado()) {
			
			this.equipado = false;
			personagem.takeFromDefesa(this.getDefesa());
			personagem.takeFromPeso(this.getPeso());
			personagem.takeFromDano(this.getDano());
			
			System.out.println("Item Desequipado!");
		} else {
			System.out.println("Item já não está equipado!");
		}
		
	}
			
	
	
	public boolean getEquipado() {
		
		return this.equipado;
	}
	
	public double getDefesa() {
		return this.defesa;
		
	}

	public double getDano() {
		return dano;
	}

	public void setDano(double dano) {
		this.dano = dano;
	}
	
}
