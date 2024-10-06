
// Q2. METHOD OVERLOADING USING TYPE CONVERSION
// Create a class named 'Main'. Define a method 'print'
// 1. Create an object obj.
// 2. Call method 'print' with one argument in an Integer type, Output should display given Integer.
// 3. Call method 'print' with one argument in a String type, Output should display given String.
// 4. Call method 'print' with one argument in a Boolean type, Output should display given Boolean.
// Input Format
// No console input.
// Output Format
// The first line of the output should display 35
// The second line of the output should display 'Hello World'
// The third line of the output should display 24.35


public class Tasks_2 {

	public void print(int num) {
		System.out.println(num);	
	}
	
	public void print(String str) {
		System.out.println(str);	
	}
	
	public void print(boolean bool) {
		System.out.println(bool);	
	}
	
	public void print(double num) {
		System.out.println(num);	
	}
	
	public static void main(String[] args) {
		Tasks_2 obj = new Tasks_2();
		obj.print(35);
		obj.print("Hello World");
		obj.print("Boolean");
		obj.print(24.35);
	}
}


// Output : 

// 35
// Hello World
// Boolean
// 24.35


