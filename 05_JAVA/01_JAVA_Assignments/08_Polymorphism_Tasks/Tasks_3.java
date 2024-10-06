
// Q3. Write a program to illustrate dynamic polymorphism, create two classes Vehicle and Motorbike. 
// Motorbike inherits the Vehicle
// class.
// Create a method move() in base class that takes a string as input and print them.
// Override the method move() in derived class that also takes a string as input and prints them.
// Input Format
// Input two strings in separate line
// Output Format
// Displays the string after execution.

class Vehicle {
	public void move(String msg) {
		System.out.println("Vehicle Is Moving : " + msg);
	}
}

class Motorbike extends Vehicle {

	@Override
	public void move(String msg) {
		System.out.println("Bike Is Moving : " + msg);
	}
}

public class Tasks_3 {

	public static void main(String[] args) {

		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Motorbike();

		vehicle1.move("Safe Driving");
		vehicle2.move("Safe Ride");

	}

}

// Output : 

// Vehicle Is Moving : Safe Driving
// Bike Is Moving : Safe Ride

