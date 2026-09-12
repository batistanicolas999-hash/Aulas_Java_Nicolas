package saque_bancario;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner teclado = new Scanner(System.in);
					
		Conta_Bancaria novaConta = new Conta_Bancaria();  
			   
	    System.out.println("Digite o nome do titular da conta");
		novaConta.setNome(teclado.next());
		   
		System.out.println("Digite o cpf do titular da conta");
		novaConta.setCpf (teclado.next());
		   
		System.out.println("Digite o numero da conta do titular");
		novaConta.setNumero_conta  (teclado.next());
		   
		System.out.println("Conta criada com sucesso");
	    System.out.println("Titular: "+novaConta.getNome());
	    System.out.println("CPf: "+novaConta.getCpf());
	    System.out.println("Número da conta: "+novaConta.getNumero_conta());
	    System.out.println("Saldo inicial: "+novaConta.getSaldo());
	   
	    System.out.println("Digite um valor para o saque R$");
	    double valorSaque = teclado.nextDouble();
	   
	    novaConta.sacar(valorSaque);
	    
	    //essa linha de baixo esta burlando a validação do metodo sacar
	    //o atributo foi passado passa private logo nao é mais acessivel
	    //novaConta.saldo -= valorSaque;
	    
	    System.out.println("Saldo da conta atualizado R$ "+novaConta.getSaldo());
				   
		teclado.close();
				   
				  
	}

}
