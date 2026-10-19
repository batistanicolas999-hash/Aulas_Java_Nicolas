package motorista;



public class Moto {
	private String modelo;
	private int ano;
	private MotorMoto motorMoto;
		     
    public Moto(String modelo, int ano, double potencia, String tipo) 
    {
    	 this.modelo = modelo;
    	 this.ano = ano;
    	 this.motorMoto = new MotorMoto(potencia, tipo);
    }
     

	public String getModelo()
	{
		 return this.modelo;
	}
	
	public int getAno()
	{
		 return this.ano;
	}
	
	
	public MotorMoto getMotorMoto()
	{
		return this.motorMoto;
	}
}