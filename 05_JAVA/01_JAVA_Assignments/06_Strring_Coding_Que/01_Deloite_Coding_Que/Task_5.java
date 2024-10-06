//Write a program to check whether two String objects contain the same data

public class Task_5 {

	public static void main(String[] args) {


		String str1 = "Hello World";
		System.out.println("String 1 : "+str1);
		
		String str2 = "Welcome";
		System.out.println("String 2 : "+str2);
		
		String str3 = "Hello World";
		System.out.println("String 3 : "+str3);
		
		System.out.println();
		
		System.out.println("Str1 is equal to Str2 : "+(str1.equals(str2)));
		System.out.println("Str1 is equal to Str3 : "+(str1.equals(str3)));
	}

}


// Output :



// String 1 : Hello World
// String 2 : Welcome
// String 3 : Hello World

// Str1 is equal to Str2 : false
// Str1 is equal to Str3 : true



