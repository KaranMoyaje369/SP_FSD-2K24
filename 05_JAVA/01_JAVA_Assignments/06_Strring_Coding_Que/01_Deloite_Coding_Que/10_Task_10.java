//Write a program to compare two strings lexicographically Two Strings

public class Task_10 {

	public static void main(String[] args) {


		String str1 = "Welcome";
		System.out.println("String 1 : "+str1);
		
		String str2 = "Welcome";
		System.out.println("String 2 : "+str2);
		
		int res = str1.compareTo(str2);
		
		if(res < 0) {
			System.out.println("String 1 is less than String 2");
		} else if(res == 0) {
			System.out.println("String 1 is equal to String 2");
		} else {
			System.out.println("String 1 is greater than String 2");
		}

	}

}


// Output :



// String 1 : Welcome
// String 2 : Welcome
// String 1 is equal to String 2




