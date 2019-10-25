package com.hema.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
@Autowired
	
	AccountRepository accountRepository;
	
	public Account findAccountByUserid(int userid) { 
		Account account=accountRepository.findAccountByUserid(userid);
		return  account;
	}
	
	
}
