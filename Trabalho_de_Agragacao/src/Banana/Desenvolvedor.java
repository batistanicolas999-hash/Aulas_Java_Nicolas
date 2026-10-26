package Banana;

public class Desenvolvedor {
    private String nome;
    private String linguagemPrincipal;
	
    public Desenvolvedor(String nome, String linguagemPrincipal) {
    	this.nome = nome;
    	this.linguagemPrincipal = linguagemPrincipal;
    }
    
    
	public String getNome() {
		return nome;
	}
     public String getLinguagemPrincipal () {
    	 return linguagemPrincipal;
     }
}
