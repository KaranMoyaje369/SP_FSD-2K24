/*
 * Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
 * */

import java.util.Scanner;

public class Task_15 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Physics Subject Marks : ");
		int phy = input.nextInt();
		
		System.out.print("Enter Chemistry Subject Marks : ");
		int che = input.nextInt();
		
		System.out.print("Enter Biology Subject Marks : ");
		int bio = input.nextInt();
		
		System.out.print("Enter Mathematics Subject Marks : ");
		int math = input.nextInt();
		
		System.out.print("Enter Computer Subject Marks : ");
		int comp = input.nextInt();
		
		int totalMarks = phy + che + bio + math + comp;
		float percentage = totalMarks / 5;
		
		if(percentage >= 90) {
			System.out.println();
			System.out.println("You got Grade A...");
		} else if(percentage >= 80) {
			System.out.println();
			System.out.println("Yoy got Grade B...");
		} else if(percentage >= 70) {
			System.out.println();
			System.out.println("Yoy got Grade C...");
		} else if(percentage >= 60) {
			System.out.println();
			System.out.println("Yoy got Grade D...");
		} else if(percentage >= 40) {
			System.out.println();
			System.out.println("Yoy got Grade E...");
		} else {
			System.out.println();
			System.out.println("You got Grade F...");
		}

	}

}

// Output : 


// Enter Physics Subject Marks : 90
// Enter Chemistry Subject Marks : 90
// Enter Biology Subject Marks : 90
// Enter Mathematics Subject Marks : 90
// Enter Computer Subject Marks : 90
//
// You got Grade A...



