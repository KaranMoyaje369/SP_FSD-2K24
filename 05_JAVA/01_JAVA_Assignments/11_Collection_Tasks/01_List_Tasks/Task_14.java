package list_tasks;

import java.util.ArrayList;
import java.util.List;

public class Task_14 {

	public static void main(String[] args) {

		List<String> list_Col = new ArrayList<String>();
		list_Col.add("Black");
		list_Col.add("Red");
		list_Col.add("Orange");
		list_Col.add("White");
		list_Col.add("Green");
		System.out.println(list_Col);
		System.out.println("Is Present : " + (list_Col.contains("Black") ? "True" : "False"));
	}
}

/*
 * Output :
 * 
 * [Black, Red, Orange, White, Green]
 * Is Present : True

*/