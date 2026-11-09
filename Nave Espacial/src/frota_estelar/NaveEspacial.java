package frota_estelar;

public class NaveEspacial {
	
	private double velocidadeBase;
	private double consumoCombustivel;
	private double tempoViagem;
	
	public NaveEspacial()
	{
		this.velocidadeBase = 3000;
	}

	public double calcularCombustivelNecessario(double distancia)
	{
		this.consumoCombustivel = distancia * 1.5;
		return this.consumoCombustivel;
	}
	
	public double calcularTempoviagem(double distancia)
	{
		this.tempoViagem = distancia / velocidadeBase;
		return this.tempoViagem;
	}
	
	public double getVelocidadeBase() {
		return velocidadeBase;
	}
	
	public void setVelocidadeBase(double velocidadeBase) {
		this.velocidadeBase = velocidadeBase;
	}
}

