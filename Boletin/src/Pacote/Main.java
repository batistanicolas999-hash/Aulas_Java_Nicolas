package Pacote;

import java.util.Scanner;

public class Main {
     public static void main(String args[])
     {
    	 Scanner teclado = new Scanner (System.in);
          
	     System.out.println("Digite a primeira nota");
	     double nota1 = teclado.nextDouble();
	     
	     System.out.println("Digite a terceira nota");
	     double nota2 = teclado.nextDouble();
	     
	     System.out.println("Digite a terceira nota");
	     double nota3 = teclado.nextDouble();
	     
	     System.out.println("Digite a quarta nota");
	     double nota4 = teclado.nextDouble();
	     
	     Boletim boletim = new Boletim();
	     
	     double media = boletim.calcular_media(nota1, nota2, nota3, nota4);
	     
	     System.out.println("A media corresponde a "+media);
	     
	     boletim.classificar_aluno();
	     
	     teclado.close();
     }
}
