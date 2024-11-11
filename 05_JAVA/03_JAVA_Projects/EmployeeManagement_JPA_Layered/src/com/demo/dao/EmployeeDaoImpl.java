package com.demo.dao;

import javax.persistence.EntityManager;

import com.demo.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManager entity;

	public EmployeeDaoImpl() {
		entity = JPAUtil.getEntityManager();
	}

	@Override
	public Employee getEmployeeById(int empID) {
		Employee emp = entity.find(Employee.class, empID);
		return emp;
	}

	@Override
	public void addEmployee(Employee emp) {
		entity.persist(emp);

	}

	@Override
	public void updateEmployee(Employee emp) {
		entity.merge(emp);

	}

	@Override
	public void removeEmployee(Employee emp) {
		entity.remove(emp);

	}

	@Override
	public void beginTransction() {
		entity.getTransaction().begin();

	}

	@Override
	public void commitTransction() {
		entity.getTransaction().commit();

	}

}
