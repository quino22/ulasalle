package pw2;

public class Votante {
	String dni;
	String nombres;
	String apellidos;
	boolean miembro;
	String departamento;
	String provincia;
	String distrito;
	String mesa;
	String local;
	String pabellon;
	String piso;
	String aula;
	String direccion;
	
	public Votante(){}
	public Votante(String dni,String nombres,String apellidos,boolean miembro,String departamento,String provincia,String distrito,String mesa,String local,String pabellon,String piso,String aula,String direccion){
		super();
		this.dni = dni;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.miembro = miembro;
		this.departamento = departamento;
		this.provincia = provincia;
		this.distrito = distrito;
		this.mesa = mesa;
		this.local = local;
		this.pabellon = pabellon;
		this.piso = piso;
		this.aula = aula;
		this.direccion = direccion;
	}
	
	public String getDni(){
		return dni;
	}
	public String getNombres(){
		return nombres;
	}
	public String getApellidos(){
		return apellidos;
	}
	public boolean getMiembro(){
		return miembro;
	}
	public String getDepartamento(){
		return departamento;
	}
	public String getProvincia(){
		return provincia;
	}
	public String getDistrito(){
		return distrito;
	}
	public String getMesa(){
		return mesa;
	}
	public String getLocal(){
		return local;
	}
	public String getPabellon(){
		return pabellon;
	}
	public String getPiso(){
		return piso;
	}
	public String getAula(){
		return aula;
	}
	public String getDireccion(){
		return direccion;
	}
	
	/********SETTERS************/
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setMiembro(boolean miembro) {
		this.miembro = miembro;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public void setMesa(String mesa) {
		this.mesa = mesa;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public void setPabellon(String pabellon) {
		this.pabellon = pabellon;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
}