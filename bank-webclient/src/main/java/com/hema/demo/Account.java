package com.hema.demo;

import java.io.Serializable;

public class Account implements Serializable {
	
	private int accountnum;
	private int userid;
	private char accounttype;
	private double amount;
	
	public int getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public char getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(char accounttype) {
		this.accounttype = accounttype;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Account [accountnum=" + accountnum + ", userid=" + userid + ", accounttype=" + accounttype + ", amount="
				+ amount + "]";
	}
	
	
}
