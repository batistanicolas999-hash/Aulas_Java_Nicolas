
package frota_estelar;

public class Main{
	public static void main(String[] args) {
		 NaveEspacial  naveEspacial = new NaveEspacial();
		
		Double consumoCombustivel = naveEspacial.calcularCombustivelNecessario(100);
		System.out.println("O consumo de combustivel foi de: "+consumoCombustivel);
		
		naveEspacial.calcularTempoViagem(1);
				
		naveEspacial.calcularTempoViagem(1);
		System.out.println("DADOS DA NAVE ESPACIAL COMUM");
		System.out.println("O tempo da viagem foi em anos de "+naveEspacial.getTempoAnos());
		System.out.println("O tempo da viagem foi em Dias de "+naveEspacial.getTempoDias());
		System.out.println("O tempo da viagem foi em anos de "+naveEspacial.getTempoHoras());

		System.out.println("DADOS DA NAVE ESPACIAL DA CARGA");
		
		NaveCarga naveCarga = new NaveCarga();
		
		double consumoCombustivelNaveCarga = naveCarga.calcularCombustivelNecessario(100);
		System.out.println("O consumo de combustivel foi de: "+consumoCombustivelNaveCarga);
		
		System.out.println("DADOS DA NAVE ESPACIAL DA CACA");
		
		NaveCaca naveCaca = new NaveCaca();
		
		double consumoCombustivelNaveCaca = naveCaca.calcularCombustivelNecessario(100);
		System.out.println("O consumo de combustivel foi de: "+consumoCombustivelNaveCaca);
	    
	    
	}
}
