package Car_Showroom_App;

public class Employees extends Showroom {
	int empId;
	String empName;
	int empAge;
	String empDept;

	public void getDetails() {
		System.out.println("Employee Id               : " + empId);
		System.out.println("Employee Name             : " + empName);
		System.out.println("Employee Age              : " + empAge);
		System.out.println("Employee Department       : " + empDept);
		System.out.println(" Associated Showroom      : " + showroomName);
	}

	public void setDetails(int empId, String empName, int empAge, String empDept) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empDept = empDept;
	}

}
