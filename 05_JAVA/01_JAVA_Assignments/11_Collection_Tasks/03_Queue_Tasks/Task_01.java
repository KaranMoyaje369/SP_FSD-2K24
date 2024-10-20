package queue_tasks;

import java.util.LinkedList;
import java.util.Queue;

//write a java program create queue by using Linked list

public class Task_01 {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();

		queue.add("Karan");
		queue.add("Sahil");
		queue.add("Vivek");
		queue.add("Kaushal");
		queue.add("Om");
		queue.add("Dhiraj");
		System.out.println("Queue List Is : " + queue);

	}
}

// Output :

// Queue List Is : [Karan, Sahil, Vivek, Kaushal, Om, Dhiraj]

