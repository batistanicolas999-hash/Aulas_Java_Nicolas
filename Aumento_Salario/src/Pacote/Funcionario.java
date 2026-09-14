package Pacote;

public class Funcionario {
   private String nome;
   private String cpf;
   private int idade;
   private double salario;
   private double novoSalario= 0;
   private double valorAumento;
   
 /*
  * salarios até R$ 280,00 aumento de 20%
   o salario entre R$ 281,00 e R$ 700,00:aumento de 15%
   o salario entre R$ 701,00 e R$ 1501,00 aumento de 5%.*/
   public double aumentarSalario(double salario)
   {
	   if((salario > 0) && (salario <= 280))
	   {
		   this.valorAumento = (salario * 20) /100;
	       this.novoSalario = salario + this.valorAumento;
	   }
	   else if (salario <= 700)
	   {
		   this.valorAumento = (salario * 20) /100;
		   this.novoSalario = salario + this.valorAumento;
	   }
	   else if(salario <= 1500)
	   {
		   this.valorAumento = (salario * 10) /100;
		   this.novoSalario = salario + this.valorAumento;	   
	   }
	   else if (salario  > 1500)
	   {
		   
		   this.valorAumento = (salario * 5) /100;
	       this.novoSalario = salario + this.valorAumento;
	   }
       else
       {
		   System.out.println("Valor informado é invalido");
	   }
	   
	   return this.novoSalario;
   }

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getNovoSalario() {
		return novoSalario;
	}
	
	public void setNovoSalario(double novoSalario) {
		this.novoSalario = novoSalario;
	}
	
	public double getValorAumento() {
		return valorAumento;
	}
	
	public void setValorAumento(double valorAumento) {
		this.valorAumento = valorAumento;
	}
   
 }
