//Write a program to count a number of Unicode code points in the specified text range of a String


public class Task_7 {

	public static void main(String[] args) {


		String str = "Hello World";
		
		System.out.println("Current String : "+str);
		
		System.out.println("Count Is : "+(str.codePointCount(1, 10)));

	}

}


// Output : 


// Current String : Hello World
// Count Is : 9


