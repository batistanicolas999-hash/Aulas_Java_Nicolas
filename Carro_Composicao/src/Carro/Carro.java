package Carro;

public class Carro {
     private String modelo;
     private int ano;
     private Motor motor;
     
     public Carro(String modelo, int ano, double potencia, String tipo) 
     {
    	 this.modelo = modelo;
    	 this.ano = ano;
    	 this.motor = new Motor(potencia, tipo);
     }
     
     public String getModelo()
     {
    	 return this.modelo;
     }
     
     public int getAno()
     {
    	 return this.ano;
     }
     
     public Motor getMotor()
     {
    	 return this.motor;
     }
}
