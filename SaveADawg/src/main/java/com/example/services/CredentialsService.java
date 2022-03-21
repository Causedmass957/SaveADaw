package com.example.services;

import com.example.models.Credentials;
import com.example.repositories.CredentialsRepo;

public interface CredentialsService extends CrudService<Credentials, Integer, CredentialsRepo> {

    Credentials getByEmail(String email);

    /**
     * gets credentialsId by userId
     * @param id the userId to search for
     * @return credentialsId of result if found, 0 if not found
     */
    Integer getIdByUserId(int id);
    

    public String changePassword(int id, String password);
    public String getPasswordByEmail(String email);

}
