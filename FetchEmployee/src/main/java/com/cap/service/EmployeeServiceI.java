package com.cap.service;

import java.util.Optional;

import com.cap.bean.Employee;

public interface EmployeeServiceI {

	Optional<Employee> fetchEmployee(int id);

}
