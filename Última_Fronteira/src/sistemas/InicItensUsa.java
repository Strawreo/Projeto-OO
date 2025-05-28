package sistemas;

import java.util.ArrayList;

public class InicItensUsa {
	
public ArrayList<ClassItem> inicializarItensUsa(){
	
		System.out.println("Inicializando itens usáveis");
		
		ArrayList<ClassItem> ArrayItensUsa = new ArrayList<>();
		
		//Organizado como: nome,vida,fome,sede,energia,sanidade, quantidade;
		
		ArrayItensUsa.add(new ItemUsavel("Bandagens","Um par de panos rasgados", 10,0,0,2,2,0.2,0)); 
		ArrayItensUsa.add(new ItemUsavel("Bandagens","Um par de panos rasgados", 10,0,0,2,2,0.2,0));
		ArrayItensUsa.add(new ItemUsavel("Bandagens","Um par de panos rasgados", 10,0,0,2,2,0.2,0));
		ArrayItensUsa.add(new ItemUsavel("Bandagens","Um par de panos rasgados", 10,0,0,2,2,0.2,0));
		ArrayItensUsa.add(new ItemUsavel("Bandagens","Um par de panos rasgados", 10,0,0,2,2,0.2,0));
		
		
		System.out.println("Itens Usáveis Inicializados");
		
		return ArrayItensUsa;
		
	}
 
}
