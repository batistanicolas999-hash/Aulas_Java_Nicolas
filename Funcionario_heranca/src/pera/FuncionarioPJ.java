package pera;

public class FuncionarioPJ extends Funcionario{
	
	public FuncionarioPJ (String nome, double salarioBase)
	{
		super(nome, salarioBase);
		
	}
	public double calcularSalario()

	{
		double valorAdicional =super.getSalarioBase() * 0.05;
		this.salarioFinal = super.getSalarioBase() + valorAdicional;
		return this.salarioFinal;
	}
	
}
