package Seila;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorteio {

	public static void main(String[] args) {
	   Scanner teclado = new Scanner(System.in);
	   List<Double> numeros = new ArrayList<Double>();
	   List<Double> numerosSorteados = new ArrayList<Double>();
	   List<Double> numerosAcertados = new ArrayList<Double>();
	      
	   double minimo = 1;
	   double maximo = 100;
	   
		for(int i = 0; i <= 4; i++)
		{		   
		          
			System.out.println("Digite um Numero para a posição "+i);
			Double numero = teclado.nextDouble();
			   	
			 while(!validaNumero(numero))
			 {
				 System.out.println("Número invalido! Digite novamente um número de 1 a 100 para  a posição "+i+":");
			     numero = teclado.nextDouble(); // lê a nova tentativa do usuario
			 }
			 numeros.add(numero);
		}
		
		for(Double n : numeros)
		{
			System.out.println("Número cadastrado pelo usuario "+n);
		}
		
		for(int i = 0; i <= 9; i++)	
		{
			numerosSorteados.add(sorteio(minimo, maximo));
		}
		
		for(Double sorteados : numerosSorteados)
		{
			System.out.println("Numero sorteados "+sorteados);
		}
		
		verificaNumerosAcertados(numeros, numerosSorteados, numerosAcertados);
		
		teclado.close();
	}
	
	public static boolean validaNumero(Double numero)
	{
		if(numero< 1 || numero > 100)
		{
			return false;
		}
		return true;
	}
	
	
	public static double sorteio(double minimo, double maximo)
	{
		double resultado = Math.round( minimo +(Math.random() * (maximo - minimo)));
		return resultado;
	}
	
	public static void verificaNumerosAcertados(List<Double> numeros,
			List<Double> numerosSorteados, List<Double> numerosAcertados)
	{
		for(Double sorteado : numerosSorteados)
		{
			for(Double numero : numeros)
			{
				if(sorteado.equals(numero))
				{
					numerosAcertados.add(sorteado);
				}
			}
		}
		
		for(Double acertados : numerosAcertados)
		{
				System.out.println("Número acertados "+acertados);
				
		}
		
		
	}
	
	
	
}