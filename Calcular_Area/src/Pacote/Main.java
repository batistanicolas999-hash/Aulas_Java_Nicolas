package Pacote;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
    	Scanner teclado = new Scanner(System.in);
    	
    	System.out.println("Digite 1 para calcular a área de um \n"+
    						"Digite 2 para calcular a aréa de um triangulo");
    		String resposta = teclado.next();
    		
    		System.out.println("Digite o valor da base da figura geometrica");
    		int base = teclado.nextInt();
    		System.out.println("Digite o valor da altura da figura geometrica");
    		int altura = teclado.nextInt();
    		int area = 0;
    		
    		if(resposta.equals("1"))
    		{
    		   area = base * altura;
    		   System.out.println("A área do quadrado ou retangulo corresponde a "+area+" Mestros quadrdos");
    		}
    		else if(resposta.equals("2"))
    		{
    			area = (base * altura) / 2;
    			System.out.println("A área do triangulo corresponde a "+area+" Metros quadrados");
    		}
    		else
    		{
    			System.out.println("Opção inválida");
    		}
    	
    	teclado.close();
    }
    
}
