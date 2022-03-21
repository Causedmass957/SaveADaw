package com.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column (name="user_id", updatable=false, nullable = false, unique = true)
	private int userId;
	
	@Column(name="email", length=100, nullable=false, unique=true)
	private String email;
	
	@Column(name="first_name", length=50, nullable=false)
	private String firstName;
	
	@Column(name="last_name", length=50, nullable=false)
	private String lastName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String email, String firstName, String lastName, String city, String state) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
	}

	public User(int userId, String email, String firstName, String lastName, String city, String state) {
		super();
		this.userId = userId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getUserId() {
		return userId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
	
	

}

