//Write a program to concatenate Two strings

public class Task_11 {

	public String Concat(String str1, String str2) {
		
		if(str1.length() !=0 && str2.length() != 0 && str1.charAt(str1.length() -1) == str2.charAt(0)) {
			return str1 + str2.substring(1);
		} else {
			return str1 + str2;
		}
	}
	public static void main(String[] args) {


		String str1 = "Hello";
		System.out.println("String 1 : "+str1);
		
		String str2 = "World";
		System.out.println("String 2 : "+str2);
		
		Task_11 conc = new Task_11();
		System.out.println("String After Concatenation : "+(conc.Concat(str1, str2)));

	}

}


// Output :


// String 1 : Hello
// String 2 : World
// String After Concatenation : HelloWorld




