package lista_de_Alunos;

public class Aluno {


	private String nome;
	private int idade;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double media;
	
	
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
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia() {
		this.media = (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
	}
	 
	 
	 
 }