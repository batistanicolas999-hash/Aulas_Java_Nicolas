package pera;

public class FuncionarioCLT extends Funcionario implements IValeAlimentacao{
	
	private double valeAlimentacao;

	public FuncionarioCLT(String nome, double salarioBase)
	{
		super(nome,salarioBase);
			
	}
	
	public double calcularSalario()
	{
		double valorAdicional =super.getSalarioBase() * 0.1;
		this.salarioFinal = super.getSalarioBase() + valorAdicional;
		return this.salarioFinal;
	}
	public double calcularValeAlimentacao()
	{
		this.valeAlimentacao = super.getSalarioBase() * 0.15;
		return this.valeAlimentacao;
	}
	
	
}
