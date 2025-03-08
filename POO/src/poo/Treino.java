package poo;

public class Treino {

	public static void main(String[] args) {

		/*
		 * Aqui eu crio o rastreador Diego que se refere a classe rastreador
		 */
		Rastreador diego = new Rastreador("Diego", 100, 0, 0, 100, 100, "Vazio", 22);
		Médico erick = new Médico("Erick", 150, 0, 0, 100, 100, "Vazio", 22);

		System.out.println(diego.toString());
		diego.sentirFome();
		diego.sentirFome();
		diego.sentirFome();
		diego.sentirFome();
		diego.sentirFome();
		diego.sentirSede();
		diego.sentirSede();
		diego.sentirSede();
		System.out.println(diego.toString());

		System.out.println(erick.toString());
		erick.sentirFome();
		erick.sentirFome();
		erick.sentirFome();
		erick.sentirFome();
		erick.sentirFome();
		erick.sentirSede();
		erick.sentirSede();
		erick.sentirSede();
		System.out.println(erick.toString());

	}
}