package main; // Teste de Inventário : Eryck Emmanuel 
import java.util.ArrayList;
import takeTheWheel.InvTakeTheWheel;
import poo.Médico;
import Sistemas.Class_Item;
import Sistemas.Inic_ItensEquip;
//import Sistemas.Inic_ItensJog;
import Sistemas.Inic_ItensUsa;
import takeTheWheel.InvTakeTheWheel;
import Sistemas.Inventario;

public class Main_TESTE {

	public static void main(String[] args) {
		
		Inic_ItensEquip ItensEquip = new Inic_ItensEquip();
		//Inic_ItensJog ItensJog = new Inic_ItensJog();
		Inic_ItensUsa ItensUsa = new Inic_ItensUsa();
		
		ArrayList <Class_Item> ArrayItensEquip = ItensEquip.Inicializar_ItensEquip();
		//ArrayList <Class_Item> ArrayItensJog = ItensJog.Inicializar_ItensJog();
		ArrayList <Class_Item> ArrayItensUsa = ItensUsa.Inicializar_ItensUsa();
		
		Inventario Inv_Teste = new Inventario(10);
		Médico personagem =  new Médico("Eryck",10,10,10,10,10,"SLA",10,10,10);
		
		InvTakeTheWheel Display = new InvTakeTheWheel(Inv_Teste,personagem);
		
		for(int i = 0; i <= Inv_Teste.getTamanho();i++) {
			
			Inv_Teste.obter(ArrayItensEquip.get(i));
			Inv_Teste.obter(ArrayItensUsa.get(i));
		}
		
		Display.DisplayInventario();
		
		Inv_Teste.obter(ArrayItensEquip.get(2));
		Inv_Teste.obter(ArrayItensEquip.get(0));
		
		Display.DisplayInventario();

		
	}
	
}