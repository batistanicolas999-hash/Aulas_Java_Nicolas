package desconto;

public class Main {
     public static void main(String args[])
     {
    	 double valorProduto = 1450;
    	 double desconto = 15;
    	 
    	 double valorDesconto = (valorProduto * desconto) / 100;
    	 System.out.println("O valor do desconto corresponde a "+valorDesconto);
    	 
    	 double valorFinal = valorProduto - valorDesconto;
    	 System.out.println("O valor final corresonde a "+valorFinal);
     }
}
