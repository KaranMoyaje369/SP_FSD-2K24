package com.demo.dao;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.demo.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	// database information collection

	HashMap<Integer, Employee> employee = new HashMap<Integer, Employee>();

	int empId = 7869; // auto increment of employee id

	@Override
	public int addEmployee(Employee emp) {
		employee.put(++empId, emp);
		return empId;
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		Employee empObj = employee.put(empId, emp);
		return empObj;
	}

	@Override
	public Employee getEmployee(int empId) {
		Employee empOj1 = employee.get(empId);
		return empOj1;
	}

	@Override
	public void deleteEmployee(int empId) {
		employee.remove(empId);

	}

	@Override
	public Set<Entry<Integer, Employee>> getAllEmployee() {
		Set<Entry<Integer, Employee>> result = employee.entrySet();

		return result;
	}

}
