package Java_Test;

public class Question_02 {

	public static void main(String[] args) {


		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		
		
		// Original Array 
		System.out.println("Even Number in a given Array : ");
		for(int i : arr) {
			if(i % 2 == 0)
			System.out.print(i+" ");
		}
	}

}


// Output : Even Number in a given Array : 
// 2 4 6 8 10 