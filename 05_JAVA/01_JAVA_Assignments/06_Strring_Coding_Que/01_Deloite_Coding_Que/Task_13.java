//Write a program to Count Number of Uppercase and Lowercase letters

public class Task_13 {
	
	static void count(StringBuffer str) {
		
		int lowerCase = 0, upperCase = 0, lengthOfString = str.length();
		
		for(int i = 0; i < lengthOfString; i++) {
			
			Character ch = str.charAt(i);
			
			if(Character.isLowerCase(ch)) {
				lowerCase += 1;
			} else {
				upperCase += 1;
			}
		}
		
		System.out.println("Current String : "+str);
		System.out.println("Total No. Of character in UpperCase in a given String : "+upperCase);
		System.out.println("Total No. Of Character in LowerCase in a given String : "+lowerCase);
	}

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("HelloWorld");
		count(str);

	}

}


// Output : 



// Current String : HelloWorld
// Total No. Of character in UpperCase in a given String : 2
// Total No. Of Character in LowerCase in a given String : 8





