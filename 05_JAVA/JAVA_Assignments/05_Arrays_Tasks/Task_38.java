//Write a program to print sum values of an array
public class Task_38 {

	public static void main(String[] args) {


		int[] arr = {10,20,30,40,50};
		
		int sumOfArray = 0;
		for(int element : arr) {
			sumOfArray += element;
		}
		
		System.out.print("Sum of all Elements in a given Array Is : "+sumOfArray);

	}

}

// Output :

// Sum of all Elements in a given Array Is : 150
