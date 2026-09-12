package Pacote;

import java.util.Scanner;

public class Main {
    public static void main(String args{[])
    Scanner teclado = new Scanner(System.in);
    String respostaMenu;
    boolean menu = true;
    
    // CORREÇÂO 1: A lista global agora fica aqui fora e armazena todos os funcionari
    List<funcionarios> listaGlobalFuncionarios=new ArrayList<>();
    	
    	  whie (menu) {
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
    		     
    		     swith (respostaMenu) {
    		    	 case "0":
    		    		 menu = false;
    		    		 System.out.println("Sistema encerrado.");
    		    		 break;
    		    		 
    		    	 case "1":
    		    		 System.out.println("\n--- Cadastro de funcionario ---");
    		    		 
    		    		 Funcionario novoFuncionario = new Funcionario();
    		    		 
    		    		 System.out.print("Digite o nome do funcionario: ");
    		    		 String nome = teclado.nextLine();
    		    		 
    		    		 System.out.print("Digite o CPF do titular: ";
    		    		 String cpf = teclado.nextLine();
    		    		 
    		    		 System.out.print("Digite a idade: ");
    		    		 int idade = teclado.nextInt();
    		    		 
    		    		 System.out.print("Digite o salario: ");
    		    		 double salario = teclado.nextDouble();
    		    		 teclado.nextLine();
    		    		 
    		    		 novoFuncionario.setNome(nome);
    		    		 novoFuncionario.setCpf(cpf);
    		    		 novoFuncionario.setIdade(idade);
    		    		 novoFuncionario.setSalario(salario);
    		    		 
    		    		 listaGlobalFuncionarios.add(novoFuncionario);
    		    		 System.out.println("Funcionario cadastrado com sucesso!");
    		    		 break;
    		    		 
    		    		 case "8"
    		    		 System.out.println("\n--- Lista de Funcionarios ---");
    		    		 if (listaGlobalFuncionarios.isEmpty()) {
    		    			 System.out.println("Nenhum funcionario cadastrado ainda."
    		    		 }else {
    		    			 
    		    			 for (Funcionario f : listaGlobalFuncionarios) {
    		    				 System.out.println("----------------------");
    		    				 System.out.println("Funcionario: " + f.getNome());
    		    				 System.out.println("Cpf: " +  F.getCpf());
    		    				 System.out.println("Idade: " + f.getIdade());
    		    				 Sstem.out.println("Salario: R$ " + f.getSalario());
    		    			 }
    		    		 }
    		    		 break;
    		    		 
    		    		 default:
    		    			 System.out.println("Opção invalida! Tente novamente.");
    		    			 break;
    		     }
    	  }
    	  teclado.close();0
    		    				 
    		    			 }
    		    		 }
    		    		 }
    		     }
    	  }
    	     
    
