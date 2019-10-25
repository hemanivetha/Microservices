package com.hema.demo;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Account")
public class AccountController {
	
	protected Logger logger = Logger
			.getLogger(AccountController.class.getName());
	
	@Autowired
	AccountRepository accountRepository;
	
	
	@RequestMapping("/{userid}/getacc")
	public ResponseEntity<Account> byUserid(@PathVariable("userid") int userid) {
		logger.info("accounts-microservice byUserId() invoked: " + userid);
		Account account = accountRepository.findAccountByUserid(userid);
		logger.info("accounts-microservice byUserId() found: " + account);
		return new ResponseEntity<Account>(account,new HttpHeaders(),HttpStatus.OK);
	}
	
	@RequestMapping("/add")
	public String addAcc(@RequestBody Account account) {
	accountRepository.save(account);
	return "Account Created";
	}
	
	@DeleteMapping("/del/{accountnum}")
	public String deleteAcc(@PathVariable int accountnum) {
	accountRepository.deleteById(accountnum);
	return "Account Deleted";
	}
	
	/*
	 * @RequestMapping("/getall") public List<Account> getAllAcc(@RequestBody
	 * Account account) { return (List<Account>) accountRepository.findAll(); }
	 */
	
	@RequestMapping("/{accountnum}/getaccountnum")
	public Account byaccountnum(@PathVariable("accountnum") int accountnum) {
		Account account=accountRepository.findAccountByAccountnum(accountnum);
		return account;
	}
}
