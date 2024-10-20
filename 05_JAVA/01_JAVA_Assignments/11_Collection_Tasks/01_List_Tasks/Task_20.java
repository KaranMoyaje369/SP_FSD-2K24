package list_tasks;

import java.util.ArrayList;

public class Task_20 {

	public static void main(String[] args) {

		ArrayList<String> list_str = new ArrayList<String>();
		list_str.add("Printer");
		list_str.add("Derive");
		list_str.add("Monitor");
		list_str.add("Laptop");
		list_str.add("Keyboard");
		list_str.add("Mouse");
		list_str.add("CPU");

		for (int i = 0; i < list_str.size(); i++) {
			System.out.println(list_str.get(i));
		}
	}
}


/* 
 * Output :
 * 
 * Printer
 * Derive
 * Monitor
 * Laptop
 * Keyboard
 * Mouse
 * CPU
 
 */
