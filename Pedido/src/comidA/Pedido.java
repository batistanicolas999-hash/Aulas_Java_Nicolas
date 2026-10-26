package comidA;


import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int numeroPedido;
	private double valorTotal;	
	private List<ItemPedido> itemPedido;
		
	public Pedido(int numeroPedido)
	{
	  this.numeroPedido = numeroPedido;
	  this.valorTotal = 0;
	  
	  this.itemPedido = new ArrayList<ItemPedido>();
	}

	public void adicionarItem(String nomePrato, double preco)
	{
		 ItemPedido itenPedido = new ItemPedido(nomePrato, preco);
         this.itemPedido.add(itenPedido);
         
         this.valorTotal += preco;
	}
	         
	
	public void exibirResumo()
	{
		System.out.println("Número Pedido: "+this.numeroPedido);
		
		for(ItemPedido item : this.itemPedido)
		{
	       System.out.println("Nome do prato: "+item.getNomePrato());
	       System.out.println("Preço: "+item.getPreco());
		}
		
		System.out.println("Valor Total: "+this.valorTotal);
	}
	
	
	
	public int getNumeroPedido() {
		return numeroPedido;
	}
	
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	public List<ItemPedido> getItemPedido() {
		return itemPedido;
	}
	
	public void setItemPedido(List<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
	

	