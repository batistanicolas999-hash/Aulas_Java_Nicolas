package lista_animais_vertebrados;

import java.util.ArrayList;
import java.util.List;

public class Main {
     public static void main(String args[])
     {
    	 List<String> vertebrados = new ArrayList<String>();     	 
    	 
    	 vertebrados.add("Mamiferos");
    	 vertebrados.add("Réptil");
    	 vertebrados.add("Peixe");
    	 vertebrados.add("Anfíbios");
    	 vertebrados.add("Aves");
    	 
    	 for (String vertebrado : vertebrados)
    	 {
			System.out.println(vertebrado);
    	 }	
	}
}


