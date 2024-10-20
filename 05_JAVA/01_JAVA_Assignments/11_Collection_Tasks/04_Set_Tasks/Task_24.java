package set_tasks;

import java.util.HashSet;

//Write a Java program to Create a set of Complex numbers using HashSet collections

public class Task_24 {

	public static void main(String[] args) {

		HashSet<Complex> hashSet = new HashSet<Complex>();
		hashSet.add(new Complex(10, 20));
		hashSet.add(new Complex(20, 30));
		hashSet.add(new Complex(30, 40));
		hashSet.add(new Complex(40, 50));
		hashSet.add(new Complex(50, 60));

		for (Complex e : hashSet) {
			e.printComplex();
		}
	}

}

class Complex {
	int reg;
	int img;

	Complex(int reg, int img) {
		this.reg = reg;
		this.img = img;
	}

	void printComplex() {
		System.out.println("Complex Number: " + reg + " + " + img + "i");
	}
}


// Output :

// Complex Number: 30 + 40i
// Complex Number: 20 + 30i
// Complex Number: 50 + 60i
// Complex Number: 40 + 50i
// Complex Number: 10 + 20i


