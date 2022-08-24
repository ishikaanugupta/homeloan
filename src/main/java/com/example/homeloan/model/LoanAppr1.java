
package com.example.homeloan.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Homeloan")

public class LoanAppr1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer loanapp_id;
	@Column
	private Double loan_amt;
	@Column
	private Double net_mon_salary;


	public Integer getId() {
		return loanapp_id;
	}
	public void setId(Integer loanapp_id) {
		this.loanapp_id = loanapp_id;
	}
	public Double getLoanamount() {
		return loan_amt;
	}
	public void setLoanamount(Double loan_amt) {
		this.loan_amt=loan_amt;
	}
	public Double getSalary() {
		return net_mon_salary;
	}
	public void setSalary(Double loan) {
		this.net_mon_salary=net_mon_salary;
	}

	@Override
	public String toString() {
		return "Loan [loanapp_id=" + loanapp_id + ", Loan Amount=" + loan_amt + ", Net monthy salary=" + net_mon_salary+"]";
	}
	
	
	

}