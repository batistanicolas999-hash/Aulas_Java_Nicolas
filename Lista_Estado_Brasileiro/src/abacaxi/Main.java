package abacaxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> estados_brasileiros = new ArrayList<String>();
		estados_brasileiros.add("Rio de Janeiro");
		estados_brasileiros.add("Sao Paulo");
		estados_brasileiros.add("Bahia");
		estados_brasileiros.add("Rio Grande do Norte");
		estados_brasileiros.add("Pernanbuco");
		estados_brasileiros.add("Minas Gerais");
		estados_brasileiros.add("Sergipe");
		estados_brasileiros.add("Roraima");
		estados_brasileiros.add("Para");
		estados_brasileiros.add("Maranão");
		estados_brasileiros.add("Amapa");
		estados_brasileiros.add("Amazonas");
		estados_brasileiros.add("Piaui");
		estados_brasileiros.add("Tocantins");
		estados_brasileiros.add("Mato Groso");
		estados_brasileiros.add("Mato Groso do Sul");
		estados_brasileiros.add("Goiais");
		estados_brasileiros.add("Santa Catarina");
		estados_brasileiros.add("Espirito Santo");
		estados_brasileiros.add("Acre");
		estados_brasileiros.add("Ceara");
		estados_brasileiros.add("Alagoas");
		estados_brasileiros.add("Paraiba");
		estados_brasileiros.add("Rio Grande do Sul");
		estados_brasileiros.add("Brasilia");
		estados_brasileiros.add("Rondonia");
		estados_brasileiros.add("Parana");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome de um estado");
		String estado = teclado.next();
		
		Boolean verifica = false;
		int i = 0, posicao = -1;
		
		for(String estadoBrasileiro : estados_brasileiros)
		{
			if(estadoBrasileiro.equals(estado))
			{
				verifica = true;
			     posicao = i;
			}	
		}
		
		if(verifica)
		{
			 System.out.println("O estado já esta cadastrado na lista e está na posição"
			            +posicao);
		}
		else
		{
			estados_brasileiros.add(estado);
			mostraEstados(estados_brasileiros);
		}
		  
		  teclado.close();
		     
	}
	
	public static void mostraEstados(List<String> estados_brasileiros)
	{
		  for(String estadoBrasileiro : estados_brasileiros)
		  {
			  System.out.println(estadoBrasileiro);
		  }
	}
     
}

  
  
  
  
  