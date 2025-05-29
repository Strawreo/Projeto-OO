package sistemas;
import java.util.ArrayList;
import personagens.*;

public class InicPersonagem {
	
	public ArrayList<Personagem> inicializarPersonagens(){
		ArrayList<Personagem> array = new ArrayList<Personagem>();
		Rastreador rastreador = new Rastreador();
		Medico medico = new Medico();
		Arqueiro arqueiro = new Arqueiro();
		ZeNinguem zeNinguem = new ZeNinguem();
		
		array.add(rastreador);
		array.add(medico);
		array.add(arqueiro);
		array.add(zeNinguem); 
		
		return array;
	}

}
