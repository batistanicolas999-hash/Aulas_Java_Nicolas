package Pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
    	
	     Scanner teclado = new Scanner(System.in);
	     String respostaMenu;
	     boolean menu = true;
	    
	      // CORREÇÂO 1: A lista global agora fica aqui fora e armazena todos os funcionari
	      List<Funcionario> listaGlobalFuncionarios = new ArrayList<>();
	    	
		  while (menu) 
		  {
			     System.out.println("\n================= MENU FUNCIONÁRIO ===============");
			     System.out.println("1 - Cadastrar um Funcionario");
			     System.out.println("2 - Aumentar Sálario");
			     System.out.println("3 - Calcular FGTS");
			     System.out.println("4 - Calcular INSS");
			     System.out.println("5 - Calcular Salário Família");
			     System.out.println("6 - Calcular o Vale Transporte");
			     System.out.println("7 - Monstrar Holerite");
			     System.out.println("8 - Monstrar Funcionarios");
			     System.out.println("0 - Sair");
			     System.out.println("Escola uma opção: ");
			     
			     respostaMenu = teclado.nextLine();
			     
			     switch (respostaMenu) {
			    	 case "0":
			    		 menu = false;
			    		 System.out.println("Sistema encerrado.");
			    		 break;
			    		 
			    	 case "1":
			    		 System.out.println("\n--- Cadastro de funcionario ---");
			    		 
			    		 Funcionario novoFuncionario = new Funcionario();
			    		 
			    		 System.out.println("Digite o nome do funcionario: ");
			    		 String nome = teclado.nextLine();
			    		 
			    		 System.out.println("Digite o CPF do titular: ");
			    		 String cpf = teclado.nextLine();
			    		 
			    		 System.out.println("Digite a idade: ");
			    		 int idade = teclado.nextInt();
			    		 
			    		 System.out.println("Digite o salario: ");
			    		 double salario = teclado.nextDouble();
			    		 teclado.nextLine();
			    		 
			    		 novoFuncionario.setNome(nome);
			    		 novoFuncionario.setCpf(cpf);
			    		 novoFuncionario.setIdade(idade);
			    		 novoFuncionario.setSalario(salario);
			    		 
			    		 listaGlobalFuncionarios.add(novoFuncionario);
			    		 System.out.println("Funcionario cadastrado com sucesso!");
			    		 break;
			    		 
			    	 case "2":
			    		 System.out.println("\n---  Aumento de Salario ---");
			    		 
			    		 if (listaGlobalFuncionarios.isEmpty()) {
			    			 System.out.println("Nenhum funcionario cadastrado.");
			    			 break;
			    		 }
			    		 
			    		 //Mostra os funcionarios para o usuário escolher
			    		 for (int i = 0; i < listaGlobalFuncionarios.size(); i++) {
			    		     Funcionario f = listaGlobalFuncionarios.get(i);
			    		     
			    		     System.out.println((i + 1) + " - " + f.getNome()
			    		             + " | Salário: R$ " + f.getSalario());
			    		     {
			    		     }}
			    		 System.out.println("Selecionado o funcionaro:");
			    		 int opcaoFuncionario = teclado.nextInt();
			    		 teclado.nextLine();
			    		 
			    		     		    		 
			    		 //Verifica se a opcão é valida
			    		 if (opcaoFuncionario < 1 || opcaoFuncionario > listaGlobalFuncionarios.size()) {
			    			 System.out.println("Funcionários inválido.");
			    		     break;
			    		 }
			    		 
			    		 //Pega o funcionario escolhido
			    		 Funcionario funcionarioSelecionado =
			    				 listaGlobalFuncionarios.get(opcaoFuncionario - 1);
			    		 
			    		 //Calculo o aumento
			    		 funcionarioSelecionado.aumentarSalario(funcionarioSelecionado.getSalario());
			    		 
			    		 System.out.println("\nAumento realizado com sucesso!");
			    		 System.out.println("Funcionario: " + funcionarioSelecionado.getNome());
			    		 System.out.println("Salario anterior: R$ " + funcionarioSelecionado.getSalario());
			    		 System.out.println("Valor do aumento: R$ "
			    				 + funcionarioSelecionado.getValorAumento());
			    		 System.out.println("Novo salario: R$ "
			    				 + funcionarioSelecionado.getNovoSalario());
			    		 
			    		 break;
			    		
			    		 
			    		 case "8":
	    		    		 System.out.println("\n--- Lista de Funcionarios ---");
	    		    		 if (listaGlobalFuncionarios.isEmpty()) {
	    		    			 System.out.println("Nenhum funcionario cadastrado ainda.");
	    		    		 }else {
	    		    			 
	    		    			 for (Funcionario f : listaGlobalFuncionarios) {
	    		    				 System.out.println("----------------------");
	    		    				 System.out.println("Funcionario: " + f.getNome());
	    		    				 System.out.println("Cpf: " +  f.getCpf());
	    		    				 System.out.println("Idade: " + f.getIdade());
	    		    				 System.out.println("Salario: R$ " + f.getSalario());
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
    		    		 
    	     
    
