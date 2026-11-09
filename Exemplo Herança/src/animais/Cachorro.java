package animais;

public class Cachorro extends Animais{

	private String raca;
	
	public void latir()
	{
		System.out.println("O cachorro "+this.getRaca() +" está latindo");
	}
	
	@Override
	public void comer()
	{
		System.out.println("O cachorro está comendo carne");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
