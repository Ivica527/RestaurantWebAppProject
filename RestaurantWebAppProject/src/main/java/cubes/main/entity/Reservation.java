package cubes.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.lang.NonNull;

@Entity
@Table
public class Reservation {
	
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	@NonNull
	@NotEmpty (message = "Required")
	private String name;
	@Column
	@NonNull
	@NotEmpty (message = "Required")
	private String email;
	@Column
	@NonNull
	@NotEmpty (message = "Required")
	private String date;
	@Column
	@NonNull
	@NotEmpty (message = "Required")
	private String time;
	@Column
	@NonNull
	@NotEmpty (message = "Required")
	private String phone;
	@Column
	@NonNull
	@NotEmpty (message = "Required")
	private String number;
	@Column
	private boolean isSeen;
	
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}


	public Reservation(String name, String email, String date, String time, String phone, String number,
			boolean isSeen) {
		super();
		this.name = name;
		this.email = email;
		this.date = date;
		this.time = time;
		this.phone = phone;
		this.number = number;
		this.isSeen = isSeen;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public boolean getIsSeen() {
		return isSeen;
	}


	public void setIsSeen(boolean isSeen) {
		this.isSeen = isSeen;
	}
	
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+id+") - "+name;
	}
	
	

}
