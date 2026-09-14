package da;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o numero inicial");
		int numero_inicial = teclado.nextInt();
		
		System.out.println("Digite o numero final");
		int numero_final = teclado.nextInt();
		
		int tamanho_intervalo = numero_final - numero_inicial;
		
		if(tamanho_intervalo > 100)
		{
			System.out.println("O tamanho do intervalo não pode ser maior que 100");
		}
		else
		{
			List<Integer> numeros = new ArrayList<Integer>();
			
			for(int i = numero_inicial; i <= numero_final; i++)
			{
				numeros.add(i);
			}
			
			for(Integer numero : numeros)
			{
			    System.out.println(numero);
			}
		

			teclado.close();
		
		}
	}
}
	
