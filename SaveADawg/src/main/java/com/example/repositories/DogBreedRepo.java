package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.DogBreed;

public interface DogBreedRepo extends JpaRepository<DogBreed, Integer>{

}
