package pacote;

import java.util.Scanner;

public class Main {
 public static void main (String args[]) {
	 Scanner teclado = new Scanner(System.in);
	 String respostaMenu;
	 boolean menu = true;
	 Funcionario novoFuncionario = null;
	 
	 while(menu) {
		 System.out.println("\n================== MENU FUNCIONÁRIO====================");
		 System.out.println("1 - Cadastrar um Funcionario");
		 System.out.println("2 - Aumentar Salario");
		 System.out.println("3 - Calcular FGTS");
		 System.out.println("5 - Calcular Salário Fámilia");
		 System.out.println("6 - Calcular o Vale Transporte");
		 System.out.println("7 - Monstrar Holerite");
		 System.out.println("8 - Listar Funcionários");
		 System.out.println("0 - Sair");
		 
		 respostaMenu = teclado.nextLine();
		 
		 switch (respostaMenu) {
			 case "0":
				 menu = false;
				 System.out.println("Sistema encerrado.");
				 break;
				 
			 case "1":
				 System.out.println("\n--- Cadastro de funcionario ---");
				 
				 
				 System.out.print("Digite o nome de funcionario: ");;
				 String nome = teclado.nextLine();
				 
				 System.out.print("digite o CPF do titular ");
				 String cpf = teclado.nextLine();
				 
				 System.out.print("Digite a idade: ");
				 int idade = teclado.nextInt();
				 
				 System.out.print("Digite o salário: ");
				 double salario = teclado.nextDouble ();
				 teclado.nextLine();
				 
				 // Correção 2 : Instanciar o funcionario especifico aqui dentro do cadastro
				 novoFuncionario = new Funcionario(nome, cpf, idade, salario);
				 
				 System.out.println("Funcionario cadastrado com sucesso!");
				 break;
			 case"2":
				 double novoSalario = novoFuncionario.aumentarSalario();
				 System.out.println("Novo salário corresponde a:"+novoSalario);
				 break;
			default:
				System.out.println("Opção invalida! Tente novamente.");
			    break;  
			    
		 }
	 }
	 
	 teclado.close();
	 
 }
}
