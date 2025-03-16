package Sistemas;

public class Main_TESTE {

	public static void main(String[] args) {
		Inic_ItensEquip ItensEquip = new Inic_ItensEquip();
		Inic_ItensJog ItensJog = new Inic_ItensJog();
		Inic_ItensUsa ItensUsa = new Inic_ItensUsa();
		
		ItensEquip.Inicializar_ItensEquip();
		ItensJog.Inicializar_ItensJog();
		ItensUsa.Inicializar_ItensUsa();
		
		Inventario Inv_Teste = new Inventario(10);
		
		Inv_Teste.obter(new Item_Equipável("Botas",2,2));
		Inv_Teste.ler();
		
		Inv_Teste.descartar(new Item_Equipável("Botas",2,2));
		Inv_Teste.ler();
		
		Inv_Teste.obter(new Item_Equipável("Botas",2,2));
		Inv_Teste.obter(new Item_Equipável("Botas",2,2));
		Inv_Teste.obter(new Item_Equipável("Botas",2,2));
		Inv_Teste.obter(new Item_Equipável("Botas",2,2));
		Inv_Teste.obter(new Item_Equipável("Botas",2,2));
		Inv_Teste.obter(new Item_Equipável("Botas",2,2));
		Inv_Teste.obter(new Item_Equipável("Botas",2,2));
		Inv_Teste.obter(new Item_Equipável("Botas",2,2));
		Inv_Teste.obter(new Item_Equipável("Botas",2,2));
		Inv_Teste.obter(new Item_Equipável("Botas",2,2));
		Inv_Teste.obter(new Item_Equipável("Botas",2,2));
		Inv_Teste.ler();

	}

}
