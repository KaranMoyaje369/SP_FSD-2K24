package com.demo.service;

import java.util.Map.Entry;
import java.util.Set;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	// creating object of dao layer
	EmployeeDao dao = new EmployeeDaoImpl();

	@Override
	public int addEmployee(Employee emp) {
		return dao.addEmployee(emp);
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		return dao.updateEmployee(empId, emp);
	}

	@Override
	public Employee getEmployee(int empId) {
		return dao.getEmployee(empId);
	}

	@Override
	public void deleteEmployee(int empId) {
		dao.deleteEmployee(empId);

	}

	@Override
	public Set<Entry<Integer, Employee>> getAllEmployee() {
		return dao.getAllEmployee();
	}

}
