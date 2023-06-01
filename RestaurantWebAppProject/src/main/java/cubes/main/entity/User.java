package cubes.main.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@Column	
	@Size(min = 7, max = 20,message = "min 7, max 20 characters")
	private String username;
	
	@Column
	@Size(min = 7, max = 20,message = "min 7, max 20 characters")
	private String password;
	
	@Column
	@Size(min = 3, max = 20,message = "min 3, max 20 characters")
	private String name;
	
	@Column
	@Size(min = 3, max = 20,message = "min 3, max 20 characters")
	private String surname;
	
	@Column
	private boolean enabled;
	
	@JoinTable(name = "authorities", joinColumns = @JoinColumn(name="username"), inverseJoinColumns = @JoinColumn(name="authority"))
	@ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch = FetchType.EAGER)
	private List<Role> authorities;
	
	
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, String name, String surname, boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.enabled = enabled;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
	
	public List<Role> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Role> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {		
		return "Username - "+username;
	}
	
}
