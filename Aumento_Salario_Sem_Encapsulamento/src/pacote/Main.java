package pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 public static void main (String args[]) {
	 Scanner teclado = new Scanner(System.in);
	 String respostaMenu;
	 boolean menu = true;
	 
	 List<Funcionario> listaGlobalFuncionarios = new ArrayList<>();
	 
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
				 Funcionario novoFuncionario = new Funcionario(nome, cpf, idade, salario);
				 
				 listaGlobalFuncionarios.add(novoFuncionario);
				 
				 System.out.println("Funcionario cadastrado com sucesso!");
				 break;
			 case"2":
				 System.out.println("\n--- Aumento de Salario ---");
				 
				 if (listaGlobalFuncionarios.isEmpty()) {
					 System.out.println("nenhum funcionario cadastrado");
					 break;
				 }
				 // Monstra os funcionarios para o usuario escolher
				 for (int i = 0; i < listaGlobalFuncionarios.size(); i++)
				 {
					 Funcionario f = listaGlobalFuncionarios.get(i);
					 System.out.println((i + 1) + " - " + f.nome
							 + "| Salarios R$ " + f.salario);
				 }
			      
				 System.out.print("Selecione o funcionario: ");
				 int opcaoFuncionario = teclado.nextInt();
				 teclado.nextLine();
				 
				 // Verifica  se a opção é válida
				 if (opcaoFuncionario < 1 || opcaoFuncionario > listaGlobalFuncionarios.size())
				 {
					 System.out.println("funconario inválido");
				     break;
				 }
					 
				     
				 Funcionario funcionarioSelecionado = listaGlobalFuncionarios.get(opcaoFuncionario -1);
				 
				 double salarioAntigo = funcionarioSelecionado.salario;
				 
				 double novoSalario = funcionarioSelecionado.aumentarSalario(funcionarioSelecionado.salario);
				 funcionarioSelecionado.salario = novoSalario; 
				 
				 System.out.println("\nAumento realizado com sucesso!");
				 System.out.println("funcionario: " + funcionarioSelecionado.nome);
				 System.out.println("Salario anterior: R$ " + salarioAntigo);
				 System.out.println("Valor do aumento: R$"
				         + funcionarioSelecionado.valorAumento);
				 System.out.println("Novo salario R$ "
						 + funcionarioSelecionado.salario);
				 break;
			 case "8":
			    System.out.println("\n--- Lista de Funcionarios ---");
			    if (listaGlobalFuncionarios.isEmpty()) {
			    	System.out.println("Nenhum funcionario cadastrado ainda. ");
			    } else {
			    	// percorre a lista global criada na Main
			    	for (Funcionario f : listaGlobalFuncionarios) {
			    		System.out.println("------------------------");
			    		System.out.println("Funcionario: " + f.nome);
			    		System.out.println("Idade: " + f.idade);
			    		System.out.println("Salario R$ " + f.salario);
			    	}
			    }
			    break;
			default:
				System.out.println("Opção invalida! Tente novamente.");
			    break;  
			    
		 }
	 }
	 
	 teclado.close();
	 
 }
}
