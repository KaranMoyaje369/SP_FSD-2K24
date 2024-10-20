package list_tasks;

// Shuffling Array List

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_05 {

	public static void main(String[] args) {

		List<String> colorList = new ArrayList<String>();

		colorList.add("Black");
		colorList.add("White");
		colorList.add("Orange");
		colorList.add("Pink");
		colorList.add("blue");

		System.out.println("Color List : " + colorList);

		Collections.shuffle(colorList);
		System.out.println("After Shuffling : " + colorList);
	}

}

/*
 * Output :
 * 
 * Color List : [Black, White, Orange, Pink, blue]
 * After Shuffling : [blue, Orange, White, Black, Pink]

 */