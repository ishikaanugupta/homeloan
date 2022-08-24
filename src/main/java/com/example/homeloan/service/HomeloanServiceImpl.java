package com.example.homeloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.homeloan.model.Homeloan;
import com.example.homeloan.repository.HomeloanRepository;

@Service
public class HomeloanServiceImpl implements HomeloanService{

	@Autowired
	private HomeloanRepository homeloanRepository;
	
	
	@Override
	public Homeloan saveHomeloan(Homeloan homeloan) {
		// TODO Auto-generated method stub
		return homeloanRepository.save(homeloan);
	}
	
}
