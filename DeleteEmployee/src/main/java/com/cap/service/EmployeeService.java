package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.EmployeeDaoI;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceI{
	@Autowired
	private EmployeeDaoI dao;

	@Override
	public void deleteEmployee(int id) {
		dao.deleteById(id);
	}
}
