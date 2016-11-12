package ulasalle;

public class Votante {
	String nombre;
	String apellido;
	int dni;
	String direccion;
	String ciudad;
	String mesa;
	boolean miembro;
	
	
	public Votante(){
		this.nombre = "";
		this.apellido = "";
		this.dni = 0;
		this.direccion = "";
		this.ciudad = "";
		this.mesa = "";
		this.miembro = false;
	}
	
	public Votante(String nombre,String apellido,int dni,String direccion,String  mesa,String ciudad,boolean miembro){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.mesa = mesa;
		this.ciudad = ciudad;
		this.miembro = miembro;
	}
	
	public void add(String nombre,String apellido,int dni,String direccion,String  mesa,String ciudad,boolean miembro){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.mesa = mesa;
		this.ciudad = ciudad;
		this.miembro = miembro;
	}
	

		
	
}