package Java_Test;

public class Question_20 {

	public static void main(String[] args) {


        String original = "Hello";

        StringBuilder repeatedString = new StringBuilder();

        for (char c : original.toCharArray()) {

            repeatedString.append(c).append(c);
        }
        
        String result = repeatedString.toString();

        System.out.println("Original String: " + original);
        System.out.println("String with characters repeated twice: " + result);
	}

}


// output :

// Original String: Hello
// String with characters repeated twice: HHeelllloo



