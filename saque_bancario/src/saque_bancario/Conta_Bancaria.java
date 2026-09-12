package saque_bancario;


public class Conta_Bancaria {


	private String nome;
	private String cpf;
	private String numero_conta;
	private double saldo = 300;
	
	public void sacar(double valorSaque)
	{  
		if(valorSaque > this.saldo)
		{
			System.out.println("Voce não pode sacar um valor maior"
			+"do que o que possui na sua conta");		
			
		}
		else
		{
			this.saldo -= valorSaque;
		}
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

	public String getNumero_conta() {
		return numero_conta;
	}

	public void setNumero_conta(String numero_conta) {
		this.numero_conta = numero_conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
