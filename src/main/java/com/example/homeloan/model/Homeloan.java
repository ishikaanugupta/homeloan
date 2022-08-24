package com.example.homeloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Homeloan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanapp_id;
	private double loan_amt;
	private double net_mon_salary;
	private int tenure;
	private String prop_addr;
	private String prop_img;
	private String login_id;
	
	public Homeloan() {
		
	}

	public int getLoanapp_id() {
		return loanapp_id;
	}

	public void setLoanapp_id(int loanapp_id) {
		this.loanapp_id = loanapp_id;
	}

	public double getLoan_amt() {
		return loan_amt;
	}

	public void setLoan_amt(double loan_amt) {
		this.loan_amt = loan_amt;
	}

	public double getNet_mon_salary() {
		return net_mon_salary;
	}

	public void setNet_mon_salary(double net_mon_salary) {
		this.net_mon_salary = net_mon_salary;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public String getProp_addr() {
		return prop_addr;
	}

	public void setProp_addr(String prop_addr) {
		this.prop_addr = prop_addr;
	}

	public String getProp_img() {
		return prop_img;
	}

	public void setProp_img(String prop_img) {
		this.prop_img = prop_img;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	
	

}
