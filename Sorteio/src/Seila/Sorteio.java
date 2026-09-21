package Seila;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorteio {

	public static void main(String[] args) {
	   Scanner teclado = new Scanner(System.in);
	   List<Integer> numeros = new ArrayList<Integer>();
	   List<Double> numerosSorteados = new ArrayList<Double>(); 
	      
	   double minimo = 1;
	   double maximo = 100;
	   
		for(int i = 0; i <= 4; i++)
		{		   
		          
			System.out.println("Digite um Numero para a posição "+i);
			int numero = teclado.nextInt();
			   	
			 while(!validaNumero(numero))
			 {
				 System.out.println("Número invalido! Digite novamente um número de 1 a 100 para  a posição "+i+":");
			     numero = teclado.nextInt(); // lê a nova tentativa do usuario
			 }
			 numeros.add(numero);
		}
		
		for(Integer n : numeros)
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
		teclado.close();
	}
	
	public static boolean validaNumero(int numero)
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
	
	
}