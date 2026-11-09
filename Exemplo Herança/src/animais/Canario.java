package animais;

public class Canario extends Animais {
	
	private String tipo_de_canto;
	
	public void cantar()
	{
		System.out.println("O canário está cantando");		
	}
	
	@Override
	public void comer()
	{
		System.out.println("O canário está comendo uma pequena mariposa");
	}
	
	public String getTipo_de_canto() {
		return tipo_de_canto;
	}

	public void setTipo_de_canto(String tipo_de_canto) {
		this.tipo_de_canto = tipo_de_canto;
	}

}
