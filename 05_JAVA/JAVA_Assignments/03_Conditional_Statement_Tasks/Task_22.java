//Write a program to input week number and print week day

import java.util.Scanner;

public class Task_22 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Day between (1 - 7)...");
		
		int day = input.nextInt();
		
		if(day == 1) {
			System.out.println("Monday");
		} else if(day == 2) {
			System.out.println("Tuesday");
		} else if(day == 3) {
			System.out.println("Wednesday");
		}  else if(day == 4) {
			System.out.println("Thursday");
		}  else if(day == 5) {
			System.out.println("Friday");
		}  else if(day == 6) {
			System.out.println("Saturday");
		}  else if(day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Enter Valid Day Between range 1 to 7....");
		}

	}

}


// Output :

// Enter Day between (1 - 7)...
// 7
// Sunday



