package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Credentials;


@Repository
public interface CredentialsRepo extends CrudRepository<Credentials, Integer>{
    Credentials findByUserEmail(String email);
    Credentials findByUserUserId(int userId);
}


