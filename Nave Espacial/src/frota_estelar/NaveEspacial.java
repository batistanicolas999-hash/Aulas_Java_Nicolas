package frota_estelar;

public class NaveEspacial {
	
	private double velocidadeBase;
	protected double consumoCombustivel;
	
	private double distanciaKm;
	
	private double tempoAnos;
	private double tempoDias;
	private double tempoHoras;
	
	final private double KM_POR_ANO_LUZ = 9.4607304725808e12;
	final private double HORAS_POR_ANO = 8766.0;
	
	public NaveEspacial()
	{
		
		this.velocidadeBase = 3000;
	}
	
	public double calcularCombustivelNecessario(double anosLuz)
	{
		this.consumoCombustivel = anosLuz * 1.5;
		return this.consumoCombustivel;
	}
	
	public void calcularTempoViagem(double anosLuz)
	{
		this.distanciaKm = anosLuz * this.KM_POR_ANO_LUZ;
		this.tempoHoras = this.distanciaKm / this.velocidadeBase;
		this.tempoAnos = this.tempoHoras / this.HORAS_POR_ANO;
		this.tempoDias = this.tempoHoras / 24.0;
	}
	
	public double getTempoAnos() {
		return tempoAnos;
	}
	
	public double getTempoDias() {
		return tempoDias;
	}
	
	public double getTempoHoras() {
		return tempoHoras;
	}
	
	public double getVelocidadeBase() {
		return velocidadeBase;
	}
	
	public void setVelocidadeBase(double velocidade) {
		this.velocidadeBase  = velocidadeBase;
	}
}
	
