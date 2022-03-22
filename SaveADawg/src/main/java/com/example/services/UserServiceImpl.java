package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.User;
import com.example.repositories.UserRepo;
import com.example.utils.LoggedInUser;

@Service
public class UserServiceImpl implements UserService {

	 @Autowired
    private UserRepo ur;

    @Autowired
    private LoggedInUser loggedInUser;
    
	@Override
	public UserRepo getRepo() {
		return ur;
	}

	@Override
	public Integer getIDFor(User value) {
		return value.getUserId();
	}

	@Override
	public User getUserByEmail(String email) {
		return this.ur.findByEmail(email);
	}

	@Override
	public User getLoggedInUser() {
		return this.loggedInUser.getUser();
	}

}
