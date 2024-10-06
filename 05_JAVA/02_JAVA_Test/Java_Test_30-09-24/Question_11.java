package Java_Test;

public class Question_11 {

	public static void main(String[] args) {
		
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        
        System.out.println("Before interning:");
        System.out.println("str1 == str2: " + (str1 == str2)); 

        String canonicalStr1 = str1.intern();
        String canonicalStr2 = str2.intern();
        
        System.out.println("\nAfter interning:");
        System.out.println("canonicalStr1 == canonicalStr2: " + (canonicalStr1 == canonicalStr2));
    
	}

}

