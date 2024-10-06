package Java_Test;

public class Question_17 {

	public static void main(String[] args) {


		 String str = "Hello World! Welcome to Java Programming 2024.";
	        
	        int upperCaseCount = 0;
	        int lowerCaseCount = 0;
	        
	        for (char c : str.toCharArray()) {
	            if (Character.isUpperCase(c)) {
	                upperCaseCount++;
	            }
	            else if (Character.isLowerCase(c)) {
	                lowerCaseCount++;
	            }
	        }
	        
	        System.out.println("Number of Uppercase letters: " + upperCaseCount);
	        System.out.println("Number of Lowercase letters: " + lowerCaseCount);

	}

}

// output :

// Number of Uppercase letters: 5
// Number of Lowercase letters: 29



