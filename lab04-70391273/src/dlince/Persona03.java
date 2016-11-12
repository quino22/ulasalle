package dlince;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
//import javax.jdo.annotations.Unique;



import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.datanucleus.annotations.Unowned;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Persona03 {
	
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
	
	@Persistent
	@Unowned
	private List<Color> color = new ArrayList<Color>();

	public Persona03(String name, String lastname, String email) {
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
		Persona03.class.getSimpleName(), java.util.UUID.randomUUID().toString());
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

	public List<Color> getColor() {
		return this.color;
	}

	public void setColor(List<Color> color) {
		this.color = color;
	}
	
}