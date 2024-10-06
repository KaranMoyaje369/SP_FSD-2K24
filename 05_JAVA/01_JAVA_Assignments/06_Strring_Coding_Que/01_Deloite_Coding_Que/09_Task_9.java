//Write a program to compare a given string to the specified character sequence

public class Task_9 {

	public static void main(String[] args) {


		String str1 = "Hello World";
		System.out.println("String 1 : "+str1);
		
		String str2 = "Welcome";
		System.out.println("String 2 : "+str2);
		
		String str3 = "Hello World";
		System.out.println("String 3 : "+str3);
		
		System.out.println("String 1 Compare with String 2 : "+(str1.contentEquals(str2)));
		System.out.println("String 1 is Compare with String 3 : "+(str1.contentEquals(str3)));
		
	}

}


// Output :


// String 1 : Hello World
// String 2 : Welcome
// String 3 : Hello World
// String 1 Compare with String 2 : false
// String 1 is Compare with String 3 : true



