package list_tasks;


import java.util.ArrayList;
import java.util.Collections;

public class Task_09 {

	public static void main(String[] args) {

		ArrayList<String> list_col = new ArrayList<String>();
		list_col.add("Black");
		list_col.add("Orange");
		list_col.add("Pink");
		list_col.add("Blue");
		list_col.add("White");
		list_col.add("Yellow");

		System.out.println("Array List before Swap : ");
		for (String a : list_col) {
			System.out.print(a + " ");
		}
		Collections.swap(list_col, 1, 4);
		System.out.println("\nArray List after swap : ");
		for (String b : list_col) {
			System.out.print(b + " ");
		}

	}

}

/*
 * Output :
 * 
 * Array List before Swap : 
 * Black Orange Pink Blue White Yellow 
 * Array List after swap : 
 * Black White Pink Blue Orange Yellow 
 
*/