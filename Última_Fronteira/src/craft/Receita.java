package craft;
import java.util.ArrayList;
import sistemas.*;

public class Receita {
	private ArrayList<ClassItem> ingredientes;
	private ClassItem item;
	
	public Receita(ArrayList<ClassItem> ingredientes, ClassItem item ) {
		
		this.ingredientes = ingredientes;
		this.setItem(item);
		
	}
	
	public ArrayList<ClassItem> getIngredientes(){
		return this.ingredientes;
	}

	public ClassItem getItem() {
		return item;
	}

	public void setItem(ClassItem item) {
		this.item = item;
	}
	
	public String getNome() {
		return this.item.getNome();
	}
	
}
