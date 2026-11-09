package animais;

public class Main {
	
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		
		cachorro.setRaca("Pastor Alemão");
		System.out.println("Raça:" +cachorro.getRaca());
		cachorro.latir();
		
		cachorro.setCor("Cinza");
		cachorro.setNome("Fred");
		cachorro.setIdade(10);
		
		System.out.println("Cor: "+cachorro.getCor());
		System.out.println("Nome: "+cachorro.getNome());
		System.out.println("Idade: "+cachorro.getIdade());
		
		cachorro.comer();
		cachorro.dormir();
		
		System.out.println("---------------");
		
		Canario canario = new Canario();
		
		canario.setTipo_de_canto("Canto Timbrado");
		System.out.println("Tipo do canto:" +canario.getTipo_de_canto());
		canario.cantar();
		
		canario.setCor("Amarelo");
		canario.setNome("Steve");
		canario.setIdade(15);
		
		System.out.println("Cor:" +canario.getCor());
		System.out.println("Nome:" +canario.getNome());
		System.out.println("Idade:" +canario.getIdade());
		
		canario.comer();
		canario.dormir();
		
	}

}
