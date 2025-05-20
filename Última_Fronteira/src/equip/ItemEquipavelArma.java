package equip;
import Sistemas.Item_Equipável;

public class ItemEquipavelArma extends Item_Equipável{

	public ItemEquipavelArma(String nome,String descricao,double defesa, double peso,double dano,boolean equipado) {
		super(nome, descricao, defesa, peso, dano, equipado);
	}
}
