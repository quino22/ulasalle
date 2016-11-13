package ulasalle;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Curso{

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key idCurso;
    
    @Persistent
    private String name;
    
    @Persistent
    private String creditos;
    
    @Persistent
    private String estado;
    
    public Curso(String name, String creditos, String estado) {
    	super();
    	this.name = name;
    	this.creditos = creditos;
    	this.estado = estado;
	}

	
	public String getIdCurso() {
		return KeyFactory.keyToString(idCurso);
	}

	public void setIdCurso(String idCurso) {
		Key keyCurso= KeyFactory.stringToKey(idCurso);
		this.idCurso = KeyFactory.createKey(keyCurso,
		Profesor.class.getSimpleName(), java.util.UUID.randomUUID().toString());
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreditos() {
		return creditos;
	}
	
	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}


	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
    
    

}