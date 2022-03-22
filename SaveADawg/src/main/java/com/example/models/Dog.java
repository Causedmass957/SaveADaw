package com.example.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Dog")
public class Dog {
	
	@Id
	@Column(name="dog_id", updatable = false, nullable = false, unique = true)//this tells hibernate this field is a column and the column name it should be mapped to	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dogId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dateofbirth", nullable=false)
	private Date dateOfBirth;
	
	@JoinColumn(name="breed_id")
	@ManyToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	private DogBreed dogBreed;
	
	@JoinColumn(name="user_id")
	@ManyToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	private User dogOwner;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, Date dateOfBirth, DogBreed dogBreed, User dogOwner) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.dogBreed = dogBreed;
		this.dogOwner = dogOwner;
	}
	
	public Dog(int dogId, String name, Date dateOfBirth, DogBreed dogBreed, User dogOwner) {
		super();
		this.dogId = dogId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.dogBreed = dogBreed;
		this.dogOwner = dogOwner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public DogBreed getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(DogBreed dogBreed) {
		this.dogBreed = dogBreed;
	}

	public User getDogOwner() {
		return dogOwner;
	}

	public void setDogOwner(User dogOwner) {
		this.dogOwner = dogOwner;
	}

	public int getDogId() {
		return dogId;
	}

	@Override
	public String toString() {
		return "Dog [dogId=" + dogId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", dogBreed=" + dogBreed
				+ ", dogOwner=" + dogOwner + "]";
	}
	
	
	
	

}
