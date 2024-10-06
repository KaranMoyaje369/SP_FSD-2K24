
// Returns a string which contains first l
// characters of 'a' and last l characters of 'b'.

package Wipro_Coding_Que;

import java.io.IOException;

public class Task_19 {

	public static String prefixSuffix(String a, String b, int length) {
		
		String prefix = a.substring(0, length);

		int lb = b.length();

		String suffix = b.substring(lb - length);

		return (prefix + suffix);
	}

	public static void main(String args[]) throws IOException {
		String a = "Karan", b = "Moyaje";
		int l = 5;
		System.out.println(prefixSuffix(a, b, l));
	}
}

// Output :

// Karanoyaje

