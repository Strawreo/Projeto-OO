package poo;
import takeTheWheel.*;

public interface Evento {
	
	void executar(Personagem jogador, InvTakeTheWheel Inv);
	
	default void teste(){
		
	}

}
