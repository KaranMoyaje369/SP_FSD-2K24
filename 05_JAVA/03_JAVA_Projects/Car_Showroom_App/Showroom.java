package Car_Showroom_App;

public class Showroom {

	String showroomName;
	String showroomAdd;
	int totalEmp;
	int totalCarsInStock;
	String managerName;

	public void getDetails() {
		System.out.println("Showroom Name    : " + showroomName);
		System.out.println("Showroom Address : " + showroomAdd);
		System.out.println("Manager          : " + managerName);
		System.out.println("Total Employees  : " + totalEmp);
		System.out.println("Cars In Stock    : " + totalCarsInStock);
	}

	public void setDetails(String showroomName, String showroomAdd, String managerName, int totalEmp,
			int totalCarsInStock) {
		this.showroomName = showroomName;
		this.showroomAdd = showroomAdd;
		this.managerName = managerName;
		this.totalEmp = totalEmp;
		this.totalCarsInStock = totalCarsInStock;
	}
}
