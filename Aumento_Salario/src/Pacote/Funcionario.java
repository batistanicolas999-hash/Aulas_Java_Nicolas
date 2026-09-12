package Pacote;

public class Funcionario {
   private String nome;
   private String cpf;
   private int idade;
   private double salario;
   private double novoSalario= 0;
   private double valorAumento;
   private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
   
   
   public Funcionario(String nome, String cpf, int idade,double salario)
   {
	  this.nome = nome;
	  this.cpf = cpf;
	  this.idade = idade;
	  this.salario = saçarop
   }
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
	   else if(salario <= 1500)
	   {
		   this.valorAumento = (salario * 10) /100;
		   this.novoSalario = salario + this.valorAumento;
	   }
	   else
	   {
		   System.out.println("Valor informado é invalido");
	   }
	   
	   return this.novoSalario;
   }
		
 }
