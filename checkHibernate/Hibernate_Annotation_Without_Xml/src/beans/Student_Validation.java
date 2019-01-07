package beans;
import java.beans.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;




@Entity
@Table(name="Student" ,schema="david")
public class Student_Validation {

	
	@Id
	@Column(name="sid")
	@Min(value=111,message="it should not lessthan 111")
	@Max(value=999,message="it should not greater 999")
	private int id;
	
	@Column(name="sname")
	@NotEmpty(message="name should not empty")
	private String name;
	

	
	@Column(name="semail")
	@NotEmpty(message="name should not empty")
	@Email(message="emial not in correct format")
	private String email;
	
	@Column(name="address")
	@NotEmpty(message="name should not empty")
	private String adddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAdddress() {
		return adddress;
	}

	public void setAdddress(String adddress) {
		this.adddress = adddress;
	}
	
	
	

}
