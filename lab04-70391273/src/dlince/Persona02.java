package dlince;

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
public class Persona02 {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key idPersona;
	
	@Persistent
	private String name;
	
	@Persistent
	private String lastname;
	
	@Persistent
	//@Unique
	private String email;
	
	//@Persistent(mappedBy = "")
	@Persistent
	@Unowned
	private Color color;

	public Persona02(String name, String lastname, String email) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		//this.color = color;
	}
	
	public String getIdPersona() {
		return KeyFactory.keyToString(idPersona);
	}

	public void setIdPersona(String idPersona) {
		Key keyPersona = KeyFactory.stringToKey(idPersona);
		this.idPersona = KeyFactory.createKey(keyPersona,
		Persona02.class.getSimpleName(), java.util.UUID.randomUUID().toString());
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Color getColor() {
		return this.color;
	}
	
	public String cualEsElColor() {
		return this.color.getName();
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}