package ulasalle;


import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.datanucleus.annotations.Unowned;

//@PersistenceCapable(identityType = IdentityType.APPLICATION,detachable="true")
@PersistenceCapable(identityType = IdentityType.APPLICATION)

public class Profesor {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key idProfesor;
	
	@Persistent
	private String name;
	
	@Persistent
	private String email;
	
	@Persistent
	private String estado;
	
	@Persistent
	@Unowned
	private Curso curso;
	
	public Profesor(String name, String email, String estado) {
		super();
		this.name = name;
		this.email = email;
		this.estado = estado;
	}

	public String getIdProfesor() {
		return KeyFactory.keyToString(idProfesor);
	}

	public void setIdProfesor(String idProfesor) {
		Key keyProfesor= KeyFactory.stringToKey(idProfesor);
		this.idProfesor = KeyFactory.createKey(keyProfesor,
		Profesor.class.getSimpleName(), java.util.UUID.randomUUID().toString());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Curso getCurso() {
		return curso;
	}
	
	public String cualEsElCurso(){
		return this.curso.getName();
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}
