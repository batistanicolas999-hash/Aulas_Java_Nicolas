package calculadora;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Digite o valor para o primeiro número");
		int  numero1 = teclado.nextInt();
		
		System.out.println("Digite o valo para o segundo número");
		int numero2 = teclado.nextInt();
		
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		int divisao = numero1 / numero2;
		double exponencial = Math.pow(numero1, numero2);
		
		System.out.println("A subtração de "+numero1+" - "+numero2+" Corresponde a "+subtracao);
		System.out.println("A soma de "+numero1+" + "+numero2+" Corresponde a "+soma);
		System.out.println("A multiplicacao de "+numero1+" * "+numero2+" Corresponde a "+multiplicacao);
		System.out.println("A divisao de "+numero1+" / "+numero2+" Corresponde a "+divisao);
		System.out.println("A Potencia de "+numero1+" e "+numero2+" Corresponde a "+exponencial);
		teclado.close();
	}
}
