package com.loan;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class Loan {
	
	
	private String applicantname;
	private double loanamount;
	private String mortgageitem;
	private double creditscore;
	private String panNo;
	private double salary;
	
	
	
	
	@Override
	public String toString() {
		return "Loan [applicantname=" + applicantname + ", loanamount=" + loanamount + ", mortgageitem=" + mortgageitem
				+ ", creditscore=" + creditscore + ", panNo=" + panNo + ", salary=" + salary + "]";
	}
	public String getApplicantname() {
		return applicantname;
	}
	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public double getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}
	public String getMortgageitem() {
		return mortgageitem;
	}
	public void setMortgageitem(String mortgageitem) {
		this.mortgageitem = mortgageitem;
	}
	
	public double getCreditscore() {
		return creditscore;
	}
	public void setCreditscore(double creditscore) {
		this.creditscore = creditscore;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
