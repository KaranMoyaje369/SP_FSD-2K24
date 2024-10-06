
//write a java program count the total number of characters in a string

package Wipro_Coding_Que;

public class Task_1 {

	public static void main(String[] args) {

		String str = "Welcome to Sleeping World";
		System.out.println("Given String Is : " + str);
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				count++;
			}
		}

		System.out.println("Total Number Of Character In a Given String : " + count);
	}
}

// Output : 

// Given String Is : Welcome to Sleeping World
// Total Number Of Character In a Given String : 22
