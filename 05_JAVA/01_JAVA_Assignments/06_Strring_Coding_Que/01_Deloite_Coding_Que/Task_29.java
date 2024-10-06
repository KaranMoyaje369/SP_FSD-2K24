
//Write a program to get the contents of a given string as a byte array

public class Task_29 {

	public static void main(String[] args)
	{
		String str = "Welcome to Sleeping World";
		byte[] byteArr = str.getBytes();
		String str1 = new String(byteArr);
		System.out.println("Given String : " + str);
		System.out.println("The new String equals " +str1);
	}
}

// Output :

// Given String : Welcome to Sleeping World
// The new String equals Welcome to Sleeping World

