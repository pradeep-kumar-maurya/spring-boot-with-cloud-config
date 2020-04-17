package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cap.bean.Employee;
import com.cap.service.EmployeeServiceI;

@RestController
public class DeleteController {
	@Autowired
	private EmployeeServiceI service;
	
	@Autowired
	RestTemplate rest;
	
	@RequestMapping("/delete/Employee/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		Employee e = rest.getForObject("http://localhost:8001/fetch/Employee/"+id, Employee.class);
		if(e != null) {
			service.deleteEmployee(id);
			return "Employee was deleted successfully!!";
		}
		else {
			return "Sorry, employee with ID : "+id+" does not exist";
		}
	}
}
