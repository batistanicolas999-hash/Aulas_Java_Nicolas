package pacote;


public class Funcionario {
   public String nome;
   public String cpf;
   public int idade;
   public double salario;
   public double novoSalario= 0;
   public double valorAumento;
     
   
   public Funcionario(String nome, String cpf, int idade,double salario)
   {
	  this.nome = nome;
	  this.cpf = cpf;
	  this.idade = idade;
	  this.salario = salario;
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
	   else if(salario <= 700)
	   {
		   this.valorAumento = (salario * 15) /100;
		   this.novoSalario = salario + this.valorAumento;
	   }
	   else if(salario <= 1500)
	   {
		   this.valorAumento = (salario * 10) /100;
		   this.novoSalario = salario + this.valorAumento;
	   }
	   else if(salario > 1500)
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
		
 }
