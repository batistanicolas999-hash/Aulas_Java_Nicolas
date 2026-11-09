package animais;

public abstract class Animais {
	private String cor;
	private String nome;
	private int idade;
	
	public void comer()
	{
		System.out.println("O animal está se alimentando");
	}

	public void dormir()
	{
		System.out.println("O animal está dormindo");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}