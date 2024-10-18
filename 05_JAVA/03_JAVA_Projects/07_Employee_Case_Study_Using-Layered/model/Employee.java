package com.demo.model;

public class Employee {

	private String empName;
	private int empSalary;
	private String empId;
	private String empMailId;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpMailId() {
		return empMailId;
	}

	public void setEmpMailId(String empMailId) {
		this.empMailId = empMailId;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, int empSalary, String empId, String empMailId) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empId = empId;
		this.empMailId = empMailId;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + ", empId=" + empId + ", empMailId="
				+ empMailId + "]";
	}

}
