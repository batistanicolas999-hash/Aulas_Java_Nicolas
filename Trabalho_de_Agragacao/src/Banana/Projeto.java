package Banana;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String  nomeProjeto;
    private List<Desenvolvedor> desenvolvedores;
    
    public Projeto(String nomeProjeto) 
	{
		this.nomeProjeto = nomeProjeto;
		this.desenvolvedores = new ArrayList<Desenvolvedor>();
	}
	
	public void addDesenvolvedor(Desenvolvedor desenvolvedor)
	{
		this.desenvolvedores.add(desenvolvedor);
	}
	
	public void monstrarDetalhes()
	{
	    System.out.println("Nome do projeto "+this.nomeProjeto);
	    System.out.println("Desenvolvedores");
	    
	    for(Desenvolvedor desenvolvedor  : this.desenvolvedores)
	    {
	    	System.out.println("Nome: "+desenvolvedor.getNome());
	    	System.out.println("Principal Linguagem: "+desenvolvedor.getLinguagemPrincipal());
	    }
     
    }
    
}

	
	 
	 