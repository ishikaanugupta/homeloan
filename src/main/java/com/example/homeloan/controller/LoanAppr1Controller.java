
package com.example.homeloan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.homeloan.model.LoanAppr1;
import com.example.homeloan.repository.LoanAppr1Repository;


@RestController
@RequestMapping("/homeloan")
public class LoanAppr1Controller {

	@Autowired
	LoanAppr1Repository loanRepository;
	@GetMapping("/loans")
	public List<LoanAppr1> get() {
		
		List<LoanAppr1> loan_final= loanRepository.findAll();
		Double loan_finalamount=0.0;
		for(LoanAppr1 loanf: loan_final) {
			if(loanf.getLoanamount()>loanf.getSalary()) {
				loan_finalamount=loanf.getSalary()*50;
			}
			else {
				loan_finalamount=loanf.getLoanamount();
			}
			System.out.println("Loan approved amount: "+loan_finalamount);
			
			
		}
		return loan_final;
		
	}
	@GetMapping("/loans/{loanapp_id}")
	public String get(@PathVariable int loanapp_id) {
		Optional<LoanAppr1> loan = loanRepository.findById(loanapp_id);
		Double loan_finalamount=0.0;
		if(loan.isPresent()) {
			//return loan.get();
			LoanAppr1 loan_final= loan.get();
			
			
			if(loan_final.getLoanamount()>(50*loan_final.getSalary())) {
				loan_finalamount=loan_final.getSalary()*50;
			}
			else {
				loan_finalamount=loan_final.getLoanamount();
				}

		}
		return "Eligible Loan Amount " + loan_finalamount;
	}
	
}

