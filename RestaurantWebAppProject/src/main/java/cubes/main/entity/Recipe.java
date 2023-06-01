package cubes.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table
public class Recipe {
	
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@Size(min=3,max=100,message="min 3, max 100 characters")
	private String name;
	
	@Column
	@Size(min=10,max=200,message="min 10, max 200 characters")
	private String description;
	
	
	public Recipe() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Recipe(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Recipe ("+id+")"+" - "+name;
	}
	
	
	

}
