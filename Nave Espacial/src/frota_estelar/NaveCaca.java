package frota_estelar;

public class NaveCaca extends NaveEspacial{
	
	private double propulsores;

	public NaveCaca()
	{	
		this.propulsores = 300;
	}
	
	@Override
	public double calcularCombustivelNecessario(double anosLuz)
	{
		this.consumoCombustivel = (anosLuz * 1.5)  * (Math.pow(this.propulsores, 2));
     	return this.consumoCombustivel;
	}
}