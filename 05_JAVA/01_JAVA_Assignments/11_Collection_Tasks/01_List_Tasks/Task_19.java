package list_tasks;

import java.util.ArrayList;

public class Task_19 {

	public static void main(String[] args) {
		ArrayList<String> list_str = new ArrayList<String>();
		list_str.add("Printer");
		list_str.add("   Derive");
		list_str.add("Monitor");
		list_str.add("Laptop");
		list_str.add("Keyboard");
		list_str.add("Mouse");
		list_str.add("CPU");
		System.out.println("Given Array List : " + list_str);
		System.out.println("Let trim to size the above array.. ");
		list_str.trimToSize();
		System.out.println(list_str);
	}
}

/* 
 * Output :
 * 
 * Given Array List : [Printer,    Derive, Monitor, Laptop, Keyboard, Mouse, CPU]
 * Let trim to size the above array..
 * [Printer,    Derive, Monitor, Laptop, Keyboard, Mouse, CPU] 
 
*/