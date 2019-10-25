package com.hema.demo;

import org.springframework.stereotype.Repository;

public interface UserRepository {
	
	public User getUserByUsername(String username);
	
	

}
