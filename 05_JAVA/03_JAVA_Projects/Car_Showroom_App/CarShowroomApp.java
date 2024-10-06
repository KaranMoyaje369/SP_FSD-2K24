package Car_Showroom_App;

public class CarShowroomApp {

	public static void main(String[] args) {

		Showroom showroom = new Showroom();
		showroom.setDetails("Royal Car Showroom", "Hyderabad", "Rakesh Kumar", 50, 20);
		System.out.println("-----Showroom Details-----");
		showroom.getDetails();

		System.out.println("\n--------------------------------\n");

		Cars car = new Cars();
		car.setDetails("BMW", "White", "Petrol", 100000, "Super Car", "Automatic");
		System.out.println("-----Car Details-----");
		car.getDetails();

		System.out.println("\n--------------------------------\n");

		Employees employees = new Employees();
		employees.setDetails(101, "Shivkumar Yadav", 30, "Sales");
		employees.showroomName = showroom.showroomName;
		System.out.println("-----Employee Details-----");
		employees.getDetails();
	}
}


// Output :

// -----Showroom Details-----
// Showroom Name    : Royal Car Showroom
// Showroom Address : Hyderabad
// Manager          : Rakesh Kumar
// Total Employees  : 50
// Cars In Stock    : 20

// --------------------------------

// -----Car Details-----
// Car Name              : BMW
// Car Color             : White
// Fuel Type             : Petrol
// Car Price             : 100000.0
// Car Type              : Super Car
// Car Transmission Type : Automatic

// --------------------------------

// -----Employee Details-----
// Employee Id               : 101
// Employee Name             : Shivkumar Yadav
// Employee Age              : 30
// Employee Department       : Sales
// Associated Showroom      : Royal Car Showroom


 