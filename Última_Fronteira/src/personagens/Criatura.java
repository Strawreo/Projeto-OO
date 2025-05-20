package personagens;

public class Criatura {
	
	private String nome;
	private double vida;
	private double defesa;
	
	public Criatura( String nome,double vida,double defesa) {
		
		this.setVida(vida);
		this.setDefesa(defesa);
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getDefesa() {
		return defesa;
	}

	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}

}
