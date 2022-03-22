package com.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="breed")
public class DogBreed {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="breed_id", updatable=false, nullable = false, unique = true)
	private int breedId;
	
	@Column(name="name")
	private String name;
	
	public DogBreed() {
		// TODO Auto-generated constructor stub
	}
	
	public DogBreed(String name) {
		super();
		this.name = name;
	}

	public DogBreed(int breedId, String name) {
		super();
		this.breedId = breedId;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBreedId() {
		return breedId;
	}

	@Override
	public String toString() {
		return "DogBreed [breedId=" + breedId + ", name=" + name + "]";
	}
	
	
	
	
}
