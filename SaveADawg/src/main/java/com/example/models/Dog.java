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
	@Column(name="dog_id")//this tells hibernate this field is a column and the column name it should be mapped to	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dogId;
	
	@Column(name="dateofbirth", nullable=false)
	private Date dateOfBirth;
	
	@JoinColumn(name="breed_id")
	@ManyToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	private DogBreed dogBreed;

}
