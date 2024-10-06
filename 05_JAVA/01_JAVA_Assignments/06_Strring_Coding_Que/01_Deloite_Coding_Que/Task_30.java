
//Write a program to compare a given string to the specified string buffer

public class Task_30 {

	public static void main(String[] args) {
		
		String str1 = "Welcome";
		String str2 = "India";
		
		StringBuffer buffer = new StringBuffer(str1);
		
		System.out.println("Comparing '"+str1+"' and "+buffer+": "+str1.contentEquals(buffer));
		System.out.println("Comparing '"+str2+"' and "+buffer+": "+str2.contentEquals(buffer));
	}
}


// Output :

// Comparing 'Welcome' and Welcome: true
// Comparing 'India' and Welcome: false

