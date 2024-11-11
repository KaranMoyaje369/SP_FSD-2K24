package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("karan");
		EntityManager entity = factory.createEntityManager();
		
//		insert, update
		
		entity.getTransaction().begin();
		Employee emp = new Employee(100, "karan", 20000, "Atm");
		entity.persist(emp);
		
		Employee emp1 = entity.find(Employee.class, 100);
		System.out.println(emp1.getEmpID());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpSal());
		System.out.println(emp1.getEmpAdd());
		
		emp1.setEmpAdd("Maharashtra");
		emp1.setEmpName("Vivek");
		emp1.setEmpSal(30000);
//		entity.merge(emp1);    // update value
		
//		entity.remove(emp1);
		
		
		entity.getTransaction().commit();
	}
}
