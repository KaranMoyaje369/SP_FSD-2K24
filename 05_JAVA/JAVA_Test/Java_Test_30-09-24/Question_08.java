package Java_Test;

public class Question_08 {

	public static void main(String[] args) {


		int[] array = { 1,2,3,4,5,6,7 };
		int sumOfArray = 0;
		int count = 0;
		
		for(int i : array ) {
			sumOfArray += i;
			count++;
		}

		int avg = sumOfArray / count;
		
		System.out.println("Average Is : "+avg);
	}

}

// Output :

// Average Is : 4