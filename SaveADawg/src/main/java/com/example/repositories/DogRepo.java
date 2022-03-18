package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.Dog;

public interface DogRepo extends JpaRepository<Dog, Integer>{

}
