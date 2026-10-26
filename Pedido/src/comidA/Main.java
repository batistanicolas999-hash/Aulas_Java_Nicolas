package comidA;

import java.util.Scanner;

public class Main {

	public static void main (String[] args ) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o Númweo Pedido: ");
		int numeroPedido = teclado.nextInt();
		teclado.nextLine();
		
		Pedido pedido = new Pedido(numeroPedido);
		
		System.out.print("Digite a quantidade de itens que irá pedir: ");
		int qtdeItens = teclado.nextInt();
		teclado.nextLine(); 
		
		for (int i = 1; i <= qtdeItens; i++) {
			System.out.println("\n--- Item " + i + "---");
			System.out.println("Digite o nome do prato: ");
			String nomePrato = teclado.nextLine();
			
			System.out.print("Digite o preço: ");
			double preco = teclado.nextDouble();
			teclado.nextLine();
			
			
			pedido.adicionarItem(nomePrato,preco);
		}
		
		pedido.exibirResumo();
		
		teclado.close();
	
	}
}
