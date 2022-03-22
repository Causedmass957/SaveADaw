package com.example.services;


import com.example.models.User;
import com.example.repositories.UserRepo;

public interface UserService extends CrudService<User, Integer, UserRepo>{
	
	public User getUserByEmail(String email);

	/**
	 * @return Currently logged-in user. Returns null if used outside an HTTP request scope.
	 */
	public User getLoggedInUser();

}
