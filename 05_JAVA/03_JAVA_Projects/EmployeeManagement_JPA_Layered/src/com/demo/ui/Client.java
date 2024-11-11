package com.demo.ui;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeServiceImpl();

		Employee emp = new Employee(100, "karan", 20000, "Hyd");
//		service.addEmployee(emp);
		
		Employee emp1 = service.findEmployeeById(100);
		System.out.println(emp1);
		emp1.setEmpAdd("Maharashtra");
		emp1.setEmpSal(10000);
		service.updateEmployee(emp1);
		
		service.removeEmployee(emp1);
	}
}
