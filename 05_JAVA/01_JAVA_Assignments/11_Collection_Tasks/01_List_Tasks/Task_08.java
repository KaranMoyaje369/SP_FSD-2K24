package list_tasks;

// Comparing Two Array list

import java.util.ArrayList;

public class Task_08 {

	public static void main(String[] args) {

		ArrayList<String> color1 = new ArrayList<String>();
		color1.add("Black");
		color1.add("White");
		color1.add("blue");
		color1.add("Orange");

		System.out.println("Color List 1 : " + color1);

		ArrayList<String> color2 = new ArrayList<String>();
		color2.add("Purple");
		color2.add("Orange");
		color2.add("Red");
		color2.add("Black");

		System.out.println("Color List 2 : " + color2);

		for (String color : color1) {
			String res = color2.contains(color) ? "True" : "False";
			System.out.print(res + " ");
		}

	}

}

/*
 * Output : 
 * Color List 1 : [Black, White, blue, Orange]
 * Color List 2 : [Purple, Orange, Red, Black]
 * True False False True 

*/