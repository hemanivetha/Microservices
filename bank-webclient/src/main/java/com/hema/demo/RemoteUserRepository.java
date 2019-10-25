package com.hema.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


public class RemoteUserRepository implements UserRepository{
	
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	
	@Override
	public User getUserByUsername(String username) {
		return restTemplate.getForObject(serviceUrl + "/{username}/User",
				User.class, username);
	}
	
	

}
