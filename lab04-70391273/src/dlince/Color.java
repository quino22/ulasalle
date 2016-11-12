package dlince;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Color{
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key idColor;
	
	@Persistent
	private String name;
	
	@Persistent
	private String email;
	
	@Persistent
	private boolean estado;
	
	public Color(String name,String email,boolean estado) {
		super();
		this.name = name;
		this.email = email;
		this.estado = estado;
	}
	
	public String getIdColor() {
		return KeyFactory.keyToString(idColor);
	}

	public void setIdColor(String idColor) {
		Key keyColor = KeyFactory.stringToKey(idColor);
		this.idColor = KeyFactory.createKey(keyColor,
		Persona02.class.getSimpleName(), java.util.UUID.randomUUID().toString());
	}

	public String getName() {
		return this.name;
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}