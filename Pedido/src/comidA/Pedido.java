package comidA;


import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int numeroPedido;
	private double ValorTotal;
	
	private List<ItemPedido> itemPedido;
	
	public Pedido(int numeroPedido, String nomePrato, double preco)
	{
	  this.numeroPedido = numeroPedido;
	  this.ValorTotal = 0;
	  
	  this.itemPedido = new ArrayList<ItemPedido>();
	}

   
}