package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.Facilities;

public interface FacilitiesRepo extends JpaRepository<Facilities, Integer> {

}
