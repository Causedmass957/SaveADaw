package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>, JpaRepository<User, Integer>
{
	/**
	 * Finds a user who has this email, if any.
	 * @param email Email string to search users for.
	 * @return User with that email if it exists.
	 * Returns null if no user exists with that email.
	 */
	public User findByEmail(String email);
}
