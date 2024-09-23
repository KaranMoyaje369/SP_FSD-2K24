package Employee_Management_System;


class Employee {
	
	String name;
	int empId;
	double salary;
	
	public Employee( String name, int empId, double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	
	
	public void displayDetails() {
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Salary : "+salary);
	}
}

class Manager extends Employee {
	
	String department;
	
	public Manager(String name, int empId, double salary, String department) {
		
		super(name, empId, salary);
		this.department = department;
	}
	
	public void manageTeam() {
		System.out.println(name+" Managing the Team in Department "+department);
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Department : "+department);
	}
	
}

class Develpoer extends Employee {
	
	String programmingLang;
	
	public Develpoer(String name, int empId, double salary, String programmingLang) {
		super(name, empId, salary);
		this.programmingLang = programmingLang;
	}
	
	public void writeCode() {
		System.out.println(name+" Write Code in "+programmingLang);
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Programming Language : "+programmingLang);
	}
	
}


public class Employee_Management_System {

	public static void main(String[] args) {

System.out.println("============== Employee Management System ===============");
System.out.println();

Manager manager = new Manager("Nitesh", 1100, 60000, "HR");
manager.displayDetails();
manager.manageTeam();

System.out.println();
System.out.println();

Develpoer developer = new Develpoer("Mohit", 2010, 40000, "JAVA");
developer.displayDetails();
developer.writeCode();

	}

}
