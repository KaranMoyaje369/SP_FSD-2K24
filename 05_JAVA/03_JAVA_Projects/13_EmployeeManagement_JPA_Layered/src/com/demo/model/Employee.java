package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Layered")
public class Employee {

	@Id
	private int empID;
	private String empName;
	private int empSal;
	private String empAdd;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empID, String empName, int empSal, String empAdd) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
		this.empAdd = empAdd;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSal=" + empSal + ", empAdd=" + empAdd + "]";
	}

}
