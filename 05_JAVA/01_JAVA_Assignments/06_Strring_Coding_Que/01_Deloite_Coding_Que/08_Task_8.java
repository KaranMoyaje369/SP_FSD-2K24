//Write a program to compare two strings lexicographically , ignoring case differences

public class Task_8 {

	public static void main(String[] args) {


		String str1 = "Welcome";
		String str2 = "welcome";
		
		System.out.println("String 1 : "+str1);
		System.out.println("String 2 : "+str2);
		
		int finalRes = str1.compareToIgnoreCase(str2);
		
		if(finalRes < 0) {
			System.out.println("String 1 is less than String 2");
		} else if(finalRes == 0) {
			System.out.println("String 1 is equal to String 2");
		} else {
			System.out.println("String 1 is grerater than String 2");
		}
		
	
	}

}

// Output :



// String 1 : Welcome
// String 2 : welcome
// String 1 is equal to String 2 





