
// Q4. Create a parent class that consists of two methods m1 and m2.
// m1 doesn't take any arguments and it just prints from parent.
// m2 takes an integer value as parameter and prints the same.
// Create a child class that extends parent class and override its methods.
// m1 doesn't take any arguments and it just prints from child.
// m2 takes an integer value as parameter and prints the same.
// In the main class, create objects for the above classes and call the corresponding methods.
// Input Format
// The input consists of the integer value for both the classes separated by a space.
// Output Format
// The output displays the result. Refer sample output.

class Parent {

	public void m1() {
		System.out.println("From Parent");
	}

	public void m2(int parent) {
		System.out.println("Parent : " + parent);
	}
}

class Child extends Parent {

	public void m1() {
		System.out.println("From Child");
	}

	public void m2(int child) {
		System.out.println("Child : " + child);
	}
}

public class Tasks_4 {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.m1();
		p.m2(10);

		Child c = new Child();
		c.m1();
		c.m2(20);

	}

}

// Output :

// From Parent
// Parent : 10
// From Child
// Child : 20
