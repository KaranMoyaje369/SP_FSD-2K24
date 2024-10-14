package Exception_Handling_Tasks;

// Exercise 2: Array Index Out of Bounds Exception

// Write a Java program that attempts to access an element at an invalid index in an array and handles the "ArrayIndexOutOfBoundsException" that may occur.
public class Exercise_2 {

	public static void main(String[] args) {


		int arr[] = {1,2,3,4};
		
		try {
		
			System.out.println("Element : "+arr[4]);
		} catch (Exception e) {
			System.out.println("Exception : "+e.getMessage());
			System.out.println("Index Out Of Bound.");
		}

	}

}
