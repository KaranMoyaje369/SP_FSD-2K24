//Write a program to replace each substring of a given string


public class Task_24 {

	public static void main(String[] args) {


		String str = "Hello Welcome to JAVA. ";
		String str1 = str.replaceAll("JAVA", "String");
		
		System.out.println("Original String : "+str);
		System.out.println("After REplacing : "+str1);

	}

}


// Output : 


// Original String : Hello Welcome to JAVA. 
// After REplacing : Hello Welcome to String. 



