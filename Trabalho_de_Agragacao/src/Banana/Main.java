package Banana;

import java.util.Scanner;

public class Main{
	public static void main(String args[])
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do projeto");
		String nomeProjeto = teclado.nextLine();
		
		Projeto projeto = new Projeto(nomeProjeto);
		
		System.out.println("Digite a quantidade de desenvolvedores que irá add nesse projeto");
		int qtDesenvolvedores = teclado.nextInt();
		
		for(int i = 1; i <= qtDesenvolvedores; i++)
		{
			System.out.println("Digite o nome do Desenvolvedor");
			String nomeDesenvolvedor = teclado.next();
			System.out.println("Digite Sua principal linguagem de programação");
	        String nomeLinguagemProgramacao = teclado.next();
			
			Desenvolvedor desenvolvedor = new Desenvolvedor(nomeDesenvolvedor, nomeLinguagemProgramacao);
			projeto.addDesenvolvedor(desenvolvedor);
		}
		
		projeto.monstrarDetalhes();
		
		teclado.close();
	}
}
