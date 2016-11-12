package dlince;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Persona01{
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	
	@Persistent
	private String name;
	
	@Persistent
	private String lastname;
	
	@Persistent
	private String email;
	
	@Persistent
	private String color;

	public Persona01(String name, String lastname, String email, String color) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.color = color;
	}
	
	public String getId() {
		return Long.toString(id);
	}

	public void setId(String idPersona) {
		Long clave =Long.parseLong(idPersona);
		this.id = clave;
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

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}