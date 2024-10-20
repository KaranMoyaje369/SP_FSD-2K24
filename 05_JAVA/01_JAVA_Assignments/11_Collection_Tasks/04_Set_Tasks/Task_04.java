package set_tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task_04 {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("Black");
		hashSet1.add("White");
		hashSet1.add("Blue");
		hashSet1.add("Orange");
		hashSet1.add("Pink");
		System.out.println("HashSet 1 : " + hashSet1);

		List<String> res = new ArrayList<String>(hashSet1);
		System.out.println("Converting to Array List : " + res);
	}
}

/*
 * Output :
 * 
 * HashSet 1 : [White, Pink, Blue, Black, Orange]
 * Converting to Array List : [White, Pink, Blue, Black, Orange]
 * 
*/