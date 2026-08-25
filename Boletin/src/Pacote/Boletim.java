package Pacote;

public class Boletim {
	
	public double media;
	
	public double calcular_media(double n1, double n2, double n3, double n4)
	{
		this.media = (n1 + n2 + n3 + n4) / 4;
		return this.media;
	}
	
	public void classificar_aluno()		
	{
		if(this.media >= 70)
		{
			System.out.println("aprovado");
		}
		else if(this.media >= 50)
		{
			System.out.println("Recuperacao");
		}
		else
		{
		    System.out.println("Reprovado");
		}
		
	}
}
