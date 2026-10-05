package Carro;

public class Motor {
      private double potencia ;
      private String tipo;
      
      public Motor(double potencia, String tipo)
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