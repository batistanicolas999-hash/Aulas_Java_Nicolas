package pera;

public class Main {
	
	public static void main(String[] args) {
		FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Carlos",3000);
		System.out.println("FUNCIONARIO CLT");
		System.out.println("NOME " +funcionarioCLT.getNome());
		System.out.println("SALÁRIO BASE " +funcionarioCLT.getSalarioBase());
		System.out.println("SALARIO FINAL " +funcionarioCLT.calcularSalario());
		System.out.println("VALE ALIMENTAÇÃO " +funcionarioCLT.calcularValeAlimentacao());
		
		
		FuncionarioPJ funcionarioPJ = new FuncionarioPJ("Maria",5000);
		System.out.println("FUNCIONARIO PJ");
		System.out.println("NOME " +funcionarioPJ.getNome());
		System.out.println("SALÁRIO BASE " +funcionarioPJ.getSalarioBase());
		System.out.println("SALARIO FINAL " +funcionarioPJ.calcularSalario());
	}
	

}
