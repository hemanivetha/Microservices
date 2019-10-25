package com.hema.demo;

import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository{
	
	public Account findAccountByUserid(int userid);
	
	public Account findAccountByAccountnum(int accountnum);
	
	public String addAcc(Account account);
	
	public String deleteAcc(int accountnum);
}
