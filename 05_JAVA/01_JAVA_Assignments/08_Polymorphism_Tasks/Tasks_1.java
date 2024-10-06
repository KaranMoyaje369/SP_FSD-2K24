

// Q1. OVERLOADING THE MAIN FUNCTION
// 1. Overload the main method by passing a single String.
// 2. Overload the main method by passing a two String.
// Input Format
// No console input.
// Output Format
// The first line of the output should display 'Hi'.
// The second line of the output should display 'Overloaded: Hello World'.
// The third line of the output should display 'Overloaded: Tom & Jerry

public class Task_1 {

	public static void main(String[] args) {
		System.out.println("Hi.");
		main("Hello World");
		main("Tom", "Jerry");
		
	}
	
	// Overload the main method by passing a single String.
	public static void main(String str1) {
		System.out.println("Overloaded : "+str1);
		
	}
	
	// Overload the main method by passing a two String.
		public static void main(String str1, String str2) {
			System.out.println("Overloaded : "+str1 +" & "+str2);
			
		}
}


// Output :

// Hi.
// Overloaded : Hello World
// Overloaded : Tom & Jerry


