package com.demo.service;

import java.util.Map.Entry;
import java.util.Set;

import com.demo.model.Employee;

public interface EmployeeService {

	// employee services to get security
	
	int addEmployee(Employee emp);
	
	Employee updateEmployee(int empId, Employee emp);
	
	Employee getEmployee(int empId);
	
	void deleteEmployee(int empId);
	
	Set<Entry<Integer, Employee>> getAllEmployee();
}
