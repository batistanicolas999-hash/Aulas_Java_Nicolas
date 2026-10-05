package investimento;

public class Investimento {
	 private double montante;
     private double taxa_juros;
     private int tempo;
     private double aportes;
     
     public Investimento()
     {
    	 this.taxa_juros = 0.01;
    	 this.tempo = 6;
    	 this.aportes = 10;
    	 this.montante = this.aportes;
     }

	 public double getTaxa_juros(){
		 return taxa_juros;
	 }

	 public int getTempo() {
		 return tempo;
	 }
	
	 public double getAportes() {
		return aportes;
	}
	
	public void setAportes(double aportes) {
		this.aportes = aportes;
	}
		
	public void addJurosAoMontante(double juros_atual)
	{
		this.montante += juros_atual;
	}

	public void realizando_aporte(double aporte)
	{
	   this.montante += aporte;
	}
	
	public double getMontante()
	{
	   return Math.round(this.montante *100.0) /100.0;
	}

}