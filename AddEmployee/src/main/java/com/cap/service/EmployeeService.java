package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Employee;
import com.cap.dao.EmployeeDaoI;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceI{
	
	@Autowired
	EmployeeDaoI dao;

	@Override
	public Employee addEmployee(Employee emp) {
		return dao.save(emp);
	}

}
