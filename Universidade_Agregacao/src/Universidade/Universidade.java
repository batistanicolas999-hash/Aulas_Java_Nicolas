package Universidade;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
	private String nome;
	private List<Departamento> departamentos;
	 
	 public Universidade(String nome) {
		 this.nome = nome;
		 this.departamentos = new ArrayList<>();
	 }
	
	 //Receba objeto Ja existente
	 public void adicionarDepartamento(Departamento d) {
		  departamentos.add(d);
	 }
	 
	 public List<Departamento> getDepartamentos()
	 {
		 return this.departamentos;
	 }
}