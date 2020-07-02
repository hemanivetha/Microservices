package com.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class LoanController {
	
	@Autowired
	LoanRepository lr;

	@RequestMapping("/show")
	public String saveLoan(Loan loan) {
		loan.getApplicantname();
		loan.getLoanamount();
		loan.getMortgageitem();
		loan.getCreditscore();
		loan.getPanNo();
		loan.getSalary();
		lr.save(loan);
	

		return "Saved Successfully";
	}


}