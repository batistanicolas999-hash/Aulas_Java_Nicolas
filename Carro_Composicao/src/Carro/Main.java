package Carro;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Corsa", 1997, 1.0, "Gasolina");

		System.out.println("Modelo "+carro.getModelo());
		System.out.println("Modelo "+carro.getAno());
		System.out.println("Potencia "+carro.getMotor().getPotencia());
		System.out.println("Tipo "+carro.getMotor().getTipo());
		
	}

}
