package personagens;
import java.util.ArrayList;

public class InicCriaturas {
	
	public ArrayList<Criatura> iniciarCriaturas(){
		
		ArrayList<Criatura> criaturas = new ArrayList<Criatura>();
		
		criaturas.add(new Criatura("Urso",20,10));
		criaturas.add(new Criatura("Cobra",30,10));
		criaturas.add(new Criatura("template",10,10));
		criaturas.add(new Criatura("template",10,10));
		criaturas.add(new Criatura("template",10,10));
		
		return criaturas;
	}
}
