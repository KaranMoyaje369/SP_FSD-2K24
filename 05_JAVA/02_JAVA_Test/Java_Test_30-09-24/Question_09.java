package Java_Test;

public class Question_09 {

	public static void main(String[] args) {


		int[] array = { 1,2,3,4,5,6,7 };
		int sumOfArray = 0;
		
		for(int i : array ) {
			sumOfArray += i;
		}
		
		System.out.println("Sum Is : "+sumOfArray);
	}

	}

// Output : 

// Sum Is : 28