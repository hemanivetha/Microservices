package com.hema.demo;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class UserController {
	
	protected Logger logger = Logger
			.getLogger(UserController.class.getName());
	
	@Autowired
	UserRepository userRepository;
	
	
	@RequestMapping("/{username}/User")
	public ResponseEntity<User> byUsername(@PathVariable("username") String username) {
		logger.info("accounts-microservice byId() invoked: " + username);
		User user = userRepository.getUserByUsername(username);
		logger.info("accounts-microservice byId() found: " + user);
		return new ResponseEntity<User>(user,new HttpHeaders(),HttpStatus.OK);
	}

}
