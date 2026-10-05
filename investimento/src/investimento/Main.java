package investimento;
/*
 Joaqui decidiu investir na bovespa por 6 meses,
ele escolhe 1 ativo, que paga 1% de juros mensais,
sob o montante aplicado.

Joaqui fez seu primeiro aporte com R$ 10, 00
e dobrou o valor do aporte a cada mês, desevolva
o algoritmo em java que demonstre esse cenário.
  
 **/
public class Main {

	public static void main(String[] args) {
		Investimento investimento = new Investimento();
		
		double juros_atual;
		
		System.out.println("...............NOVO MÊS............ ");
		System.out.println("Total final do Mês 1 "+investimento.getMontante());
		System.out.println("Valor do montante ");
		for(int i = 2; i <= investimento.getTempo(); i++)
		{
			System.out.println("...............NOVO MÊS............ ");
			System.out.println("Total final do Mês " +i);
			System.out.println("Valor do montante antes de aplicar o juros: "+investimento.getMontante());
			
			juros_atual = (investimento.getMontante() * investimento.getTaxa_juros());
			
			// arrendonda para 2 casas decimais
			juros_atual = Math.round(juros_atual * 100.0) / 100.0;
			System.out.println("Valor do juro atual: "+juros_atual);
			
			investimento.addJurosAoMontante(juros_atual);
			System.out.println("Valor do montante depois de aplicar o juros: "+investimento.getMontante());
					
			investimento.setAportes(investimento.getAportes() * 2);
			System.out.println("Valor do aporte "+investimento.getAportes());
			
			investimento.realizando_aporte(investimento.getAportes());
			System.out.println("Valor do montante depois de aplicar o novo aporte: "+investimento.getMontante());
		}

	}
	

}
