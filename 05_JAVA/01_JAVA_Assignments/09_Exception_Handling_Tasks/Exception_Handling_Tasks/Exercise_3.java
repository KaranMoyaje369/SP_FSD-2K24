package Exception_Handling_Tasks;

// Exercise 3: File Not Found Exception

// Write a Java program that attempts to open a file that does not exist and handles the "FileNotFoundException.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {

		String fileName = "file.txt";

		try {
			File file = new File(fileName);
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
			sc.close();
		} catch (FileNotFoundException e) {

			System.out.println("Exception caught : " + e.getMessage());
			System.out.println("File not found : " + fileName);

		}

		
	}

}
