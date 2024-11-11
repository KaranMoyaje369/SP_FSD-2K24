package com.demo.dao;

import com.demo.model.Employee;

public interface EmployeeDao {

	Employee getEmployeeById(int empID);

	void addEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void removeEmployee(Employee emp);

	void beginTransction();

	void commitTransction();
}
