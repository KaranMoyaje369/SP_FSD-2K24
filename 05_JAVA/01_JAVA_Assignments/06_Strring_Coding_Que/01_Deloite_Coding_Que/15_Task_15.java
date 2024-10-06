//Write a program to create a character array containing the contents of a string

public class Task_15 {

	public static void main(String[] args) {


		String str = "Hello Java!";
		System.out.println("Current String : "+str);
		char[] a = str.toCharArray();


//		Display the char array
		
		System.out.println("\n Display Char Array : ");
		
		for(char charArray : a) {
			System.out.print(charArray + " ");
		}

	}

}


// Output :



// Current String : Hello Java!

// Display Char Array : 
// H e l l o   J a v a ! 



