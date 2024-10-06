package Java_Test;

public class Question_07 {

	public static void main(String[] args) {


		int [] arr = {5,-10, 20,-34, 28,-3};
		
		System.out.println("Positive Number in agivrn array is : ");
		for(int i : arr ) {
			if(i > 0) {
				System.out.println(i+" ");
			}
		}

	}

}


// Output :

// Positive Number in agivrn array is : 
// 5 
// 20 
// 28

