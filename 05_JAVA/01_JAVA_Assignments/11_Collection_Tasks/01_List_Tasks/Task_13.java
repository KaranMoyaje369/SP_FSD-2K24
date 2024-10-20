package list_tasks;

import java.util.ArrayList;
import java.util.List;

public class Task_13 {

	public static void main(String[] args) {
		List<String> list_Col = new ArrayList<String>();
		list_Col.add("Black");
		list_Col.add("Red");
		list_Col.add("Orange");
		list_Col.add("White");
		list_Col.add("Green");
		System.out.println(list_Col);
		list_Col.set(1, "Pink");
		list_Col.set(4, "Blue");
		System.out.println(list_Col);
	}
}

/*
 * Output :
 * 
 * [Black, Red, Orange, White, Green]
 * [Black, Pink, Orange, White, Blue]
 
*/