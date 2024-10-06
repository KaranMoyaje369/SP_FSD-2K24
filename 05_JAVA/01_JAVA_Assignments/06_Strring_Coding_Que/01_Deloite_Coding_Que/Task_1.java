//Write a program to get the canonical representation of the string object


public class Task_1 {

	public static void main(String[] args) {


		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		
//		before interning
		System.out.println("Before Interning : ");
		System.out.println(str1 == str2);   // false
		

		String canoStr1 = str1.intern();
		String canoStr2 = str2.intern();
		
//		After interning
		System.out.println("After Interning : ");
		System.out.println(canoStr1 == canoStr2);  // true

	}

}


// Output :


// Before Interning : 
// false
// After Interning : 
// true



