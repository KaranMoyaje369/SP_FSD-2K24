import java.util.Scanner;

public class StudentGradeCalculator {

//	Average grade calculator

	public int avgGrade(int math, int science, int eng) {

		return (math + science + eng) / 3;
	}

	public static void main(String[] args) {

		System.out.println("Student Grade Calculator.......");
		System.out.println(" \n Student Details :  ");

		Scanner input = new Scanner(System.in);

//		    Student Details 

		System.out.print("Enter Student Name : ");
		String name = input.nextLine();

		System.out.print("Enter Student Age : ");
		int age = input.nextInt();

		System.out.print("Enter Grade for Math : ");
		int math = input.nextInt();

		System.out.print("Enter Grade for Science : ");
		int science = input.nextInt();

		System.out.print("Enter Grade for English : ");
		int eng = input.nextInt();

//			Final Result

		System.out.println(" \n Final Output : ");

		System.out.println("Student Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Math Grade : " + (double) +math);
		System.out.println("Science Grade : " + (double) +science);
		System.out.println("English Grade : " + (double) +eng);

		StudentGradeCalculator obj = new StudentGradeCalculator();
		double avg = obj.avgGrade(math, science, eng);

		System.out.println("Average Grade : " + avg);

		if (avg > 60) {
			System.out.println("Grade Clasification : First Class");
		} else {
			System.out.println("Grade Classification : Second Class");
		}
	}

}

// Output :

// Student Grade Calculator.......

// Student Details :  
// Enter Student Name : Karan Moyaje
// Enter Student Age : 22
// Enter Grade for Math : 60
// Enter Grade for Science : 70
// Enter Grade for English : 50

// Final Output : 
// Student Name : Karan Moyaje
// Age : 22
// Math Grade : 60.0
// Science Grade : 70.0
// English Grade : 50.0
// Average Grade : 60.0
// Grade Classification : Second Class
