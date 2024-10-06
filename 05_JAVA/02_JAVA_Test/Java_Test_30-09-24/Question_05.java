package Java_Test;

public class Question_05 {

	public static void main(String[] args) {


		int [] arr = {5,-10, 20,-34, 28,-3};
		
		int sumOfNegNum = 0;
		
		for(int i : arr) {
			if(i < 0) {
				sumOfNegNum += i;
			}
		}
		
		System.out.println("Sum Of Negative Number : "+sumOfNegNum);
	}

}


// Output :

// Sum Of Negative Number : -47