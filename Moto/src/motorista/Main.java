package motorista;

public class Main {

	public static void main(String[]  args) 
	{
		Moto moto = new Moto ("Honda", 1997,2.0, "gasolina");
	 
		System.out.println(" Modelo "+moto.getModelo());
		System.out.println(" Modelo "+moto.getAno());
		System.out.println(" Potencial "+moto.getMotorMoto().getPotencia());
		System.out.println(" Tipo "+moto.getMotorMoto().getTipo());
	}
}