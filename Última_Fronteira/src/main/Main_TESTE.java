package main; // Teste de Inventário : Eryck Emmanuel 
import java.util.ArrayList;

import Sistemas.Class_Item;
import Sistemas.Inic_ItensEquip;
import Sistemas.Inic_ItensJog;
import Sistemas.Inic_ItensUsa;
import Sistemas.Inventario;

public class Main_TESTE {

	public static void main(String[] args) {
		
		Inic_ItensEquip ItensEquip = new Inic_ItensEquip();
		Inic_ItensJog ItensJog = new Inic_ItensJog();
		Inic_ItensUsa ItensUsa = new Inic_ItensUsa();
		
		ArrayList <Class_Item> ArrayItensEquip = ItensEquip.Inicializar_ItensEquip();
		ArrayList <Class_Item> ArrayItensJog = ItensJog.Inicializar_ItensJog();
		ArrayList <Class_Item> ArrayItensUsa = ItensUsa.Inicializar_ItensUsa();
		
		Inventario Inv_Teste = new Inventario(10);
		
		Inv_Teste.ler();
		
		for (int i = 0; i < Inv_Teste.getTamanho(); i++) {
			Inv_Teste.obter(ArrayItensEquip.get(0));
		}
		
		Inv_Teste.ler();
		
		Inv_Teste.obter(ArrayItensEquip.get(0));
		
		Inv_Teste.descartar(ArrayItensEquip.get(0));
		
		Inv_Teste.ler();
		
		Inv_Teste.descartar(ArrayItensEquip.get(0));
		
		Inv_Teste.ler();
	}
}
		
