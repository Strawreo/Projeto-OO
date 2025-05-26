package personagens;

public abstract 	class Criatura {
	
	private String nome;
	private double vida;
	private double defesa;
	private int dano;
	
	public Criatura( String nome,double vida,double defesa, int dano) {
		
		this.setNome(nome);
		this.setVida(vida);
		this.setDefesa(defesa);
		
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
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	public abstract void atacar(Personagem jogador);

}
