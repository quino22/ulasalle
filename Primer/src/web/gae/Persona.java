package web.gae;

public class Persona {
	String nombre;
	boolean sexo;
	
	public Persona() {
		this.nombre ="Demo";
	}	
	
	public Persona(String algo1){
		this.nombre = algo1;
	}
	
	public Persona(String algo1,boolean algo2){
		this.nombre = algo1;
		this.sexo = algo2;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
	


	
	 
	
	
}
