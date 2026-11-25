package frota_estelar;

public class NaveCarga extends NaveEspacial{
	
	private double pesoCarga;
	
	{
		this.pesoCarga = 7000;
	}
	
	
	@Override
	public double calcularCombustivelNecessario(double anosLuz)
	{
		this.consumoCombustivel = (anosLuz * 1.5 + (this.pesoCarga *
				0.05));
		return this.consumoCombustivel;
	}

}
