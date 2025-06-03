package sistemas;

import java.util.ArrayList;

public class InicItensUsa {
	
public ArrayList<ClassItem> inicializarItensUsa(){
		
		ArrayList<ClassItem> ArrayItensUsa = new ArrayList<>();
		
		//Organizado como: nome,descricao,vida,fome,sede,energia,sanidade,peso, quantidade;
		
		ArrayItensUsa.add(new ItemUsavel("Bandagens","Um par de panos rasgados", 10,0,0,2,2,0.2,0)); 
		ArrayItensUsa.add(new ItemUsavel("Pão","Farinha de trigo, água e fermento", 4,15,0,6,5,0.2,0));
		ArrayItensUsa.add(new ItemUsavel("Cantil C/água","Um cantil simples de madeira com água potável dentro", 3,0,15,6,5,0.2,0));
		ArrayItensUsa.add(new ItemUsavel("Sugar Plum","Uma bola de açúcar refinado \n normalmente colocam-se remédios em seu interior para convencer crianças a tomá-los", 1,0,0,15,15,0.2,0));
		ArrayItensUsa.add(new ItemUsavel("Folhas de chá","Pare um pouco e tome um chá", 7,0,10,10,10,0.2,0));
		
		return ArrayItensUsa;
		
	}
 
}
