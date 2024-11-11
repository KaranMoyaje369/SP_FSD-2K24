package com.demo.service;

import com.demo.model.Employee;

public interface EmployeeService {

	Employee findEmployeeById(int empID);

	void addEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void removeEmployee(Employee emp);
}
