package poo;

public class Treino {

	public static void main(String[] args) {

		/*
		 * Aqui eu crio o rastreador Diego que se refere a classe rastreador
		 */
		Rastreador diego = new Rastreador();
		Médico erick = new Médico();

		System.out.println(diego);
		diego.sentirFome();
		diego.sentirFome();
		diego.sentirFome();
		diego.sentirFome();
		diego.sentirFome();
		diego.sentirSede();
		diego.sentirSede();
		diego.sentirSede();
		System.out.println(diego);

		System.out.println(erick);
		erick.sentirFome();
		erick.sentirFome();
		erick.sentirFome();
		erick.sentirFome();
		erick.sentirFome();
		erick.sentirSede();
		erick.sentirSede();
		erick.sentirSede();
		System.out.println(erick);

	}
}