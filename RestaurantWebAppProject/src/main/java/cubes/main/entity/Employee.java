package cubes.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Table
@Entity
public class Employee {
	
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@Size(min = 3, max = 50, message = "min 3, max 50 characters")
	private String name;
	
	@Column
	@Size(min = 3, max = 50, message = "min 3, max 50 characters")
	private String role;
	
	@Column
	@Size(min = 3, max = 200, message = "min 3, max 200 characters")
	private String description;
	
	@Column
	@Size(max = 300, message = "max 300 characters")
	private String image;
	
	public Employee() {		
	}

	public Employee(String name, String role, String description, String image) {
		super();
		this.name = name;
		this.role = role;
		this.description = description;
		this.image = image;
	}

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	@Override
	public String toString() {		
		return "Employee (id)-"+id+", name -"+name+"";
	}
	
	

}
