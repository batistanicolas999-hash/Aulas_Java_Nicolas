package lista_de_Alunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
	  Scanner teclado = new Scanner(System.in);
	
	  List<Aluno> alunos = new ArrayList<>();
	  
	  Boolean menu = true;
	  while(menu)
	  {
		   System.out.println("Digite 1 para cadastrar aluno\n"+
	                          "Digite 2 para listar os alunos\n"+
	                         "0 - para sair do programa ");
		   String resposta = teclado.nextLine();
		   
		   if(resposta.equals("1"))
		   {
			  Aluno aluno = new Aluno();
			  System.out.println("Digite o nome");
			  aluno.setNome(teclado.nextLine());
			  
			  System.out.println("Digite a idade");
			  aluno.setIdade(teclado.nextInt());
			  
			  System.out.println("Digite a Primeira nota");
			  aluno.setNota1(teclado.nextDouble());
			  
			  System.out.println("Digite a Segunda nota");
			  aluno.setNota2(teclado.nextDouble());
			  
			  System.out.println("Digite a Terceira nota");
			  aluno.setNota3(teclado.nextDouble());
			  
			  System.out.println("Digite a Quarta nota");
			  aluno.setNota4(teclado.nextDouble());
			  
			  aluno.setMedia();
			  
			  alunos.add(aluno);
			  
			  teclado.nextLine();
			  
		   }
		   else if (resposta.equals("2"))
		   {
		      for(Aluno listaAluno : alunos)
		      {
		    	  System.out.println("Nome: "+listaAluno.getNome());
		    	  System.out.println("Idade: "+listaAluno.getIdade());
		    	  System.out.println("Nota 1: "+listaAluno.getNota1());
		    	  System.out.println("Nota 2: "+listaAluno.getNota2());
		    	  System.out.println("Nota 3: "+listaAluno.getNota3());
		    	  System.out.println("Nota 4: "+listaAluno.getNota4());
		    	  System.out.println("Media: "+listaAluno.getMedia());
		    	 
		      }
		   }
		   else if (resposta.equals("0"))
		   {
			   menu = false;
			   System.out.println("Saindo do programa");
		   }
		   else
		   {
			   System.out.println("Opção invalida");
		   }
	  }
	  teclado.close();
	}
 }