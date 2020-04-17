package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.bean.Employee;

public interface EmployeeDaoI extends JpaRepository<Employee, Integer>{
	
}
