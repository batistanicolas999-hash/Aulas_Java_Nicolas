package motorista;

public class MotorMoto {
	private double potencia;
	private String tipo;
	
	public MotorMoto(double potencia, String tipo)
	{
		this.potencia = potencia;
		this.tipo = tipo;
	}

	public double getPotencia()
	{
		return this.potencia;
	}

	public String getTipo()
	{
		return this.tipo;
	}
}
