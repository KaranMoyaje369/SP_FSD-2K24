//Write a program to merge two arrays elements to store third array

public class Task_40 {

	public static void main(String[] args) {


		int[] arr1 = {1,2,3};
		int[] arr2 = {3,4,5};
		int[] res = new int[arr1.length + arr2.length];
		
		for(int i = 0; i < arr1.length; i++) {
			res[i] = arr1[i];
		}
		
		for(int i = 0; i < arr1.length; i++) {
			res[arr1.length + i] = arr2[i];
		}
		
		System.out.print("Merged Array Is : ");
		for(int element : res) {
			System.out.print(element+" ");
		}

	}

}


// Output : 

// Merged Array Is : 1 2 3 3 4 5 



