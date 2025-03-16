package Sistemas;
import java.util.ArrayList;

public class Main_TESTE {

	public static void main(String[] args) {
		
		int inv = 10;
		
		
		Inic_ItensEquip ItensEquip = new Inic_ItensEquip();
		Inic_ItensJog ItensJog = new Inic_ItensJog();
		Inic_ItensUsa ItensUsa = new Inic_ItensUsa();
		
		ArrayList <Class_Item> ArrayItensEquip = ItensEquip.Inicializar_ItensEquip();
		ArrayList <Class_Item> ArrayItensJog = ItensJog.Inicializar_ItensJog();
		ArrayList <Class_Item> ArrayItensUsa = ItensUsa.Inicializar_ItensUsa();
		
		Inventario Inv_Teste = new Inventario(inv);
		
		Inv_Teste.obter(ArrayItensEquip.get(0));
		Inv_Teste.obter(ArrayItensJog.get(0));
		Inv_Teste.obter(ArrayItensUsa.get(0));
		
		Inv_Teste.ler();
		
		Inv_Teste.descartar(ArrayItensEquip.get(0));
		
		Inv_Teste.ler();

	}

}
