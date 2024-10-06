//Write a program to print after removing duplicates from a given string

public class Task_21 {
	
	
	public static void removeDuplicate(String s) {
		
		char [] arr = s.toCharArray();
		String str = "";
		
		for(char e:arr) {
			if(str.indexOf(e)== -1) {
				str += e;
				
			}
		}
		
		System.out.println("After Removing duplicate characters in a given string : "+str);
	}

	public static void main(String[] args) {


		String str = "Hello World";
		System.out.println("Given String : "+str);
		removeDuplicate(str);

	}

}


// Output :


// Given String : Hello World
// After Removing duplicate characters in a given string : Helo Wrd



