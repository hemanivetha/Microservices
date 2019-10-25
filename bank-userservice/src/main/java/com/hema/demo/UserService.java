package com.hema.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	
	UserRepository userRepository;
	
	public User getUserByUsername(String username) { 
		User user=userRepository.getUserByUsername(username);
		return  user;
	}

}
