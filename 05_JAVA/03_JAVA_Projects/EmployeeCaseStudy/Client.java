package EmployeeCaseStudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		
	HashMap<Integer,Employee> employee= new HashMap<Integer,Employee>();	
	
		int empid=729938257-67326233;
		while(true)
		{
		System.out.println("*****Employee Management Application******");
		System.out.println("1.Add Employee");
		System.out.println("2.Update Employee");
		System.out.println("3.Get Employee");
		System.out.println("4.Delete Employee");
		System.out.println("5.Get All Employees");
		
		Scanner sc= new Scanner(System.in);
		int option=sc.nextInt();
		
		switch(option)
		{
		    case 1:
		    	System.out.println("***Add Employee***");
		    	System.out.println("Enter Employee Name");
		    	String empName=sc.next();
		    	System.out.println("Enter Employee Salary");
		    	int empSal=sc.nextInt();
		    	System.out.println("Enter Employee Address");
		    	String empAdd=sc.next();
		    	System.out.println("Enter EMployee Email Id");
		    	String empMail=sc.next();
		    	
		    	Employee emp= new Employee(empName, empSal, empAdd, empMail);
		    	
		    	employee.put(++empid, emp);
		    	System.out.println("Employe Added Successfully :"+empid);
		    	
		    	break;
		    case 2:
		    	System.out.println("***Update Employee***");
		    	System.out.println("Enter Employee Id");
		    	int eid=sc.nextInt();
		    	System.out.println("Enter Employee Name");
		    	String eName=sc.next();
		    	System.out.println("Enter Employee Salary");
		    	int eSal=sc.nextInt();
		    	System.out.println("Enter Employee Address");
		    	String eAdd=sc.next();
		    	System.out.println("Enter EMployee Email Id");
		    	String eMail=sc.next();
		    	
		    	Employee emp1=new Employee(eName, eSal, eAdd, eMail);
		    	
		    	employee.put(eid, emp1);
		    	
		    	System.out.println("Employee Updated susfully:"+eid);
		    	
		    	break;
		    case 3:
		    	System.out.println("***GET Employee***");
		    	System.out.println("Enter Employee Id");
		    	int eid1=sc.nextInt();
		    	Employee empobj=employee.get(eid1);
		    	System.out.println(empobj);
		    	break;
		    case 4:
		    	System.out.println("***Delete Employee***");
		    	System.out.println("Enter Employee Id");
		    	int eid2=sc.nextInt();
		    	employee.remove(eid2);
		    	System.out.println("Employee deleted succfully :"+eid2);
		    	break;
		    case 5:
		    	System.out.println("***Get All Employees***");
		    	
		    	Set<Entry<Integer,Employee>> result=employee.entrySet();
		    	Iterator<Entry<Integer,Employee>> itr=result.iterator();
		    	while(itr.hasNext())
		    	{
		    		Entry<Integer,Employee> finalResult=itr.next();
		    		System.out.println(finalResult.getKey()+"  "+finalResult.getValue());
		    	}
		    	break;
		    default:
		    	System.out.println("OOPS....Enter a Valid Option...");
		}
		
		}
	}
}


// Output :

// *****Employee Management Application******
// 1.Add Employee
// 2.Update Employee
// 3.Get Employee
// 4.Delete Employee
// 5.Get All Employees
// 1
// ***Add Employee***
// Enter Employee Name
// Karan
// Enter Employee Salary
// 20000
// Enter Employee Address
// Hyd
// Enter EMployee Email Id
// Krn@gmail.com
// Employe Added Successfully :662612025
// *****Employee Management Application******
// 1.Add Employee
// 2.Update Employee
// 3.Get Employee
// 4.Delete Employee
// 5.Get All Employees
// 2
// ***Update Employee***
// Enter Employee Id
// 662612025
// Enter Employee Name
// Krn
// Enter Employee Salary
// 30000
// Enter Employee Address
// Mumbai
// Enter EMployee Email Id
// krn456@gmail.com
// Employee Updated susfully:662612025
// *****Employee Management Application******
// 1.Add Employee
// 2.Update Employee
// 3.Get Employee
// 4.Delete Employee
// 5.Get All Employees
// 3
// ***GET Employee***
// Enter Employee Id
// 662612025
// Employee [empName=Krn, empSal=30000, empAdd=Mumbai, empMail=krn456@gmail.com]
// *****Employee Management Application******
// 1.Add Employee
// 2.Update Employee
// 3.Get Employee
// 4.Delete Employee
// 5.Get All Employees
// 4
// ***Delete Employee***
// Enter Employee Id
// 662612025
// Employee deleted succfully :662612025
// *****Employee Management Application******
// 1.Add Employee
// 2.Update Employee
// 3.Get Employee
// 4.Delete Employee
// 5.Get All Employees
// 5
// ***Get All Employees***
// *****Employee Management Application******
// 1.Add Employee
// 2.Update Employee
// 3.Get Employee
// 4.Delete Employee
// 5.Get All Employees



