
// Q5. Function Overloading
// An ice-cream vendor sells his ice-creams in cone(radius r and height h) and ball(radius r) shaped 
// containers. However, he is unsure
// of the quantity that can be filled in the two containers. You are required to write a program in java that 
// prints the volume of the
// containers given its respective dimensions as input. Your class must be named ‘Icecream’ which has two 
// methods with same
// name ‘Quantity’ each having the respective dimensions of the containers as the parameters. 
// Function Header:
// public void Quantity(int r, int h)
// public void Quantity(int r)
// Input Format
// If the quantity of the cone is to be calculated, the input must have the radius(r) and height(h) in the 
// same line separated by a space.
// For calculating the quantity of the ball, the input must have its radius(r).
// Note: Input type should be integer.
// Output Format
// The output must display the volume of the container rounded off to two decimal places for which the 
// dimensions are given.


class Icecream {
	
	public void quantity(int rad, int height) {
		double volumeOfCone = ((1.0 / 3)*Math.PI * rad * rad * height);
		System.out.printf("Volume Of Cone : %.2f  ",volumeOfCone);
	}
	
	public void quantity(int rad) {
		double volumeOfBall = ((4.0 / 3)*Math.PI * rad * rad * rad);
		System.out.printf("\nVolume Of Cone : %.2f  ",volumeOfBall);
	}
}
public class Tasks_5 {

	public static void main(String[] args) {


		Icecream ice = new Icecream();
		ice.quantity(3, 5);
		ice.quantity(3);
	}

}


// Output :

// Volume Of Cone : 47.12  
// Volume Of Cone : 113.10 



