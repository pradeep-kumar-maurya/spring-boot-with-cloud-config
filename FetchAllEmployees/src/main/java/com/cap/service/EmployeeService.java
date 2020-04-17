package com.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Employee;
import com.cap.dao.EmployeeDaoI;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceI{
	
	@Autowired
	private EmployeeDaoI dao;

	@Override
	public List<Employee> getAllEmployees() {
		return dao.findAll();
	}
}