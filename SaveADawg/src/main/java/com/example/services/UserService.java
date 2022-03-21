package com.example.services;

import java.util.List;

import com.example.models.User;
import com.example.repositories.UserRepo;

public interface UserService extends CrudService<User, Integer, UserRepo>{
	
	public User getUserByEmail(String email);
	public List<User> getAllUserByName(String firstname, String lastname);
	public List<User> getAllUserByEmail(String email);

	/**
	 * @return Currently logged-in user. Returns null if used outside an HTTP request scope.
	 */
	public User getLoggedInUser();

}
