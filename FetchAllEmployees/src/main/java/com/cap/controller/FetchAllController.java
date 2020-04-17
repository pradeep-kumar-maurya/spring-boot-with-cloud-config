package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.Employee;
import com.cap.service.EmployeeServiceI;

@RestController
public class FetchAllController {
	
	@Autowired
	private EmployeeServiceI service;
	
	@GetMapping("/list/Employees")
	public List<Employee> listEmployees(){
		List<Employee> list = service.getAllEmployees();
		return list;
	}
}
