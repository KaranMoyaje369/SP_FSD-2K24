package com.demo.ui;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {

		// object creation of service layer
		EmployeeService service = new EmployeeServiceImpl();

		while (true) {
			System.out.println("*** Employee Management System ***");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Get Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Get All Employee");

			Scanner sc = new Scanner(System.in);
			System.out.print("\n Enter Choice : ");
			int option = sc.nextInt();

			switch (option) {

			case 1:
				System.out.println("Add Employee Details : ");
				System.out.print("\nEnter Employee Name : ");
				String empName = sc.next();
				System.out.print("Enter Employee Salary : ");
				int empSalary = sc.nextInt();
				System.out.print("Enter Employee Address : ");
				String empAdd = sc.next();
				System.out.print("Enter Employee Mail Id : ");
				String empMailId = sc.next();

				// create object of employee class
				Employee emp = new Employee(empName, empSalary, empAdd, empMailId);

				// service layer add employee
				int empId = service.addEmployee(emp);
				System.out.println("Employee Added SuccessFully... " + empId);

				break;

			case 2:
				System.out.println("Update Employee Details : ");
				System.out.print("/n Enter Employee Id : ");
				int eId = sc.nextInt();
				System.out.println("Enter Employee Name : ");
				String eName = sc.next();
				System.out.println("Enter Employee Salary : ");
				int eSalary = sc.nextInt();
				System.out.println("Enter Employee Address : ");
				String eAdd = sc.next();
				System.out.println("Enter Employee Mail Id : ");
				String eMailId = sc.next();

				Employee emp1 = new Employee(eName, eSalary, eAdd, eMailId);

				service.updateEmployee(eId, emp1);
				System.out.println("Employee Update SuccessFully... " + eId);

				break;

			case 3:
				System.out.println("Get Employee Details : ");
				System.out.print("\nEnter Employee Id : ");
				int eId1 = sc.nextInt();

				Employee empobj = service.getEmployee(eId1);
				System.out.println(empobj);

				break;

			case 4:
				System.out.println("Delete Employee : ");
				System.out.print("\n Enter Employee Id : ");
				int eId2 = sc.nextInt();

				service.deleteEmployee(eId2);
				System.out.println("Employee Delete SuccessFully...");
				break;

			case 5:
				Set<Entry<Integer, Employee>> itr = service.getAllEmployee();
				Iterator<Entry<Integer, Employee>> res = itr.iterator();

				while (res.hasNext()) {
					Entry<Integer, Employee> finalResult = res.next();
					System.out.println(finalResult.getKey() + " " + finalResult.getValue());
				}
				break;

			default:
				System.out.println("OOPS....Enter a Valid Option...");
				break;
			}
		}
	}
}
