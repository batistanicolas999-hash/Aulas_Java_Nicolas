package Pacote;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) {
		Carro carro1 = new Carro();
	
	    carro1.marca = "Chevrolet";
	    carro1.modelo = "Corsa";
	    carro1.cor = "Vermelho";
	    carro1.acelerar();
	    
	    Carro carro2 = new Carro();
	    
	    carro2.marca = "Jeep";
	    carro2.modelo = "Renagade";
	    carro2.cor = "Branco";
	    carro2.acelerar();
	    carro2.acelerar();
	    
	    exibirCarros(carro1,  carro2);
    
	    boolean menu = true;
	    
	    Scanner teclado = new Scanner(System.in);
	    
	    while(menu)
	    {
	    	System.out.println("1 Para aumentar a velocidade do "+carro1.modelo+"\n"
	    			+"2 Para aumentar a velocidade do "+carro2.modelo+"\n"
	    			+"3 Para diminuir a velocidade do "+carro1.modelo+"\n"
	    			+"4 Para diminuir a velocidade do "+carro2.modelo+"\n"
	    			+"0 Para sair do programa ");
	    	
	    	String resposta = teclado.nextLine();
	    	
	    	if(resposta.equals("1"))
	    	{
	    		carro1.acelerar();
	    		exibirCarros(carro1,  carro2);
	    	}
	    	else if(resposta.equals("2"))
	    	{
	    		carro2.acelerar();
	    		exibirCarros(carro1,  carro2);
	    	}
	        if(resposta.equals("3"))
	        {
	        	carro1.frear();
	        	exibirCarros(carro1,  carro2);
	        }
	        else if(resposta.equals("4"))
	        {
	        	carro2.frear();
	        	exibirCarros(carro1,  carro2);
	        }
	        else if(resposta.equals(0))
	        {
	        	menu = false;
	        	System.out.println("Saindo do programa");
	        }
	        else
	        {
	        	System.out.println("Opção inválida");
	        }
	    }
	        
	}
	
	public static void exibirCarros(Carro carro1, Carro carro2)
   {
	   System.out.println("carro1.marca "+carro1.marca+"\n"
			   + "carro1.modelo "+carro1.modelo+"\n"
			   + "carro1.cor "+carro1.cor+"\n"
			   + "carro1.velocidade "+carro1.velocidade+"\n");
	   
	   System.out.println("carro2marca "+carro2.marca+"\n"
			   +"carro2.modelo "+carro2.modelo+"\n"
			   +"carro2.cor "+carro2.cor+"\n"
			   +"carro2.velocidade "+carro2.velocidade+"\n");
	   
	   }
}
	        
	   //aprenda a sair das suas contas por gentileza, para que os outros nao precise ficar fazendo isso por voce grato
	   	        
        
    