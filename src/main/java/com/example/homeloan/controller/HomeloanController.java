package com.example.homeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.homeloan.model.Homeloan;
import com.example.homeloan.service.HomeloanService;

@RestController
@RequestMapping("/homeloan")
public class HomeloanController {
	@Autowired
	private HomeloanService homeloanService;
	
	@PostMapping("/loans")
	public String add(@RequestBody Homeloan homeloan) {
		homeloanService.saveHomeloan(homeloan);
		return "New loan application is added";
	}
}
