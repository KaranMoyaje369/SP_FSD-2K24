package Java_Test;

public class Question_19 {

	public static void main(String[] args) {


		    String str1 = "Apple";
	        String str2 = "Banana";
	        
	        int result = str1.compareTo(str2);
	        
	        if (result == 0) {
	            System.out.println("Both strings are equal.");
	        } else if (result > 0) {
	            System.out.println("The string '" + str1 + "' is lexicographically greater than '" + str2 + "'.");
	        } else {
	            System.out.println("The string '" + str2 + "' is lexicographically greater than '" + str1 + "'.");
	        }

	}

}


// output :

// The string 'Banana' is lexicographically greater than 'Apple'.
