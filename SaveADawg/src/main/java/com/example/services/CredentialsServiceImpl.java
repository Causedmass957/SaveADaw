package com.example.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Credentials;
import com.example.repositories.CredentialsRepo;
import com.example.repositories.UserRepo;

@Service
public class CredentialsServiceImpl implements CredentialsService{

    @Autowired
    CredentialsRepo credentialsRepo;
    
    @Autowired
    UserRepo ur;

    @Override
    public CredentialsRepo getRepo() {
        return credentialsRepo;
    }

    @Override
    public Integer getIDFor(Credentials value) {
        return value.getCredentialsId();
    }

    @Override
    public Credentials getByEmail(String email) {
        return credentialsRepo.findByUserEmail(email);
    }

    @Override
    public Integer getIdByUserId(int id)
    {
        Credentials credResult = credentialsRepo.findByUserUserId(id);
        return (credResult != null)? credResult.getCredentialsId() : 0;
    }

	@Override
	public String changePassword(int id, String password) {
		Credentials credResult = credentialsRepo.findByUserUserId(id);		
		String answer = "Password Changed.";
		credResult.setPassword(password);
		credentialsRepo.save(credResult);
		return answer;
	}

	@Override
	public String getPasswordByEmail(String email) {
		Credentials credResult = credentialsRepo.findByUserEmail(email);
		return credResult.getPassword();
	}
}
