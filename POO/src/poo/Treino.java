package poo;

public class Treino {

	public static void main(String[] args) {

		/*
		 * Aqui eu crio o rastreador Diego que se refere a classe rastreador
		 */
		Rastreador jogador = new Rastreador("Diego", 100, 0, 0, 100, 100, "Vazio", 22);
		GerenciadorDeEventos gerenciador = new GerenciadorDeEventos();
		Ambiente ambienteAtual = new AmbienteFloresta();
		
		

		
		for (int i = 0; i < 3; i++) { // Simula 5 rodadas de jogo
            System.out.println("\nRodada " + (i + 1) + " no ambiente: Floresta");

            Evento eventoSorteado = gerenciador.sortearEvento(ambienteAtual);
            gerenciador.aplicarEvento(jogador, eventoSorteado);

            // Simulação de mudança de ambiente
            if (i == 3) { // Depois de 3 rodadas, muda o ambiente
                ambienteAtual = new AmbienteDeserto();
                System.out.println("\n>> O jogador chegou ao deserto! <<");
            }
        }
		
		
		System.out.println(jogador.toString());
		/*
		 * diego.sentirFome(); diego.sentirFome(); diego.sentirFome();
		 * diego.sentirFome(); diego.sentirFome(); diego.sentirSede();
		 * diego.sentirSede(); diego.sentirSede();
		 */

		System.out.println(jogador.toString());

		
		for(Evento e : ambienteAtual.getEventosPossiveis()) {
			System.out.println(e.getClass().getSimpleName());
		}
		
		
		

	}
}