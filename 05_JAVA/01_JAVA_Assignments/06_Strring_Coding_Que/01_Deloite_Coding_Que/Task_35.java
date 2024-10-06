
// sum of number in given string

public class Task_35 {

	public int sum_digits(String str) {
		int l = str.length();
		int sum = 0;
		for (int i = 0; i < l; i++) {
			if (Character.isDigit(str.charAt(i))) {
				String tmp = str.substring(i, i + 1);
				sum += Integer.parseInt(tmp);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Task_35 obj = new Task_35();
		String str = "a1b23c3d4e5hf";
		System.out.println("Given String : " + str);
		System.out.println("Sum of Digits in String : " + obj.sum_digits(str));
	}
}

// Output :

// Given String : a1b23c3d4e5hf
// Sum of Digits in String : 18


