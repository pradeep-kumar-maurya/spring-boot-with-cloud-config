package com.cap.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.Employee;
import com.cap.service.EmployeeServiceI;

@RestController
public class FetchController {
	
	@Autowired
	private EmployeeServiceI service;
	
	@GetMapping("/fetch/Employee/{id}")
	public Optional<Employee> fetchEmployee(@PathVariable("id") int id) {
		Optional<Employee> e = service.fetchEmployee(id);
		return e;
	}
}
