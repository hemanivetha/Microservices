package com.hema.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


public class RemoteAccountRepository implements AccountRepository{
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;

	@Override
	public Account findAccountByUserid(int userid) {
		return restTemplate.getForObject(serviceUrl + "/Account//{userid}/getacc",
				Account.class, userid);
	}

	@Override
	public Account findAccountByAccountnum(int accountnum) {
		return restTemplate.getForObject(serviceUrl + "/Account/{accountnum}/getaccountnum",
				Account.class, accountnum);
	}

	@Override
	public String addAcc(Account account) {
		restTemplate.getForObject(serviceUrl + "/Account/add",
				Account.class, account);
		return "Account Added";
	}
	@Override
	public String deleteAcc(int accountnum) {
		restTemplate.getForObject(serviceUrl + "/Account/del/{accountnum}",
				Account.class, accountnum);
		return "Account Deleted";
	}

}
