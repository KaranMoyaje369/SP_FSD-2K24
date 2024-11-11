package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDaoImpl();
	}

	@Override
	public Employee findEmployeeById(int empID) {
		Employee emp = dao.getEmployeeById(empID);
		return emp;
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransction();
		dao.addEmployee(emp);
		dao.commitTransction();

	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransction();
		dao.updateEmployee(emp);
		dao.commitTransction();

	}

	@Override
	public void removeEmployee(Employee emp) {
		dao.beginTransction();
		dao.removeEmployee(emp);
		dao.commitTransction();

	}

}
