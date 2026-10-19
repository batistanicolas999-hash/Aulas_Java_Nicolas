package Universidade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome da universidade ");
		String nomeUniversidade = teclado.next();
		
		Universidade universidade = new Universidade(nomeUniversidade);
		
		String resposta = "1";
				
		while(resposta.equals("1"))
		{
			System.out.println("Digite 1 para cadastrar um departamento "+
					 "para a universidade "+nomeUniversidade+"/n"+
					 "ou qualquer outra tecla para sair");
			resposta = teclado.next();
			
			if(resposta.equals("1"))
			{
				System.out.println("Digite o nome do departamento");
				String nomeDepartamento = teclado.next();
				
				Departamento departamento = new Departamento(nomeDepartamento);
				universidade.adicionarDepartamento(departamento);
				
			}
			
		}
		
		for(Departamento d : universidade.getDepartamentos() )
		{
			System.out.println("Departamento "+d.getNome());
		}
		
		
		teclado.close();
			
			
			
	
	
		
	
	}

}