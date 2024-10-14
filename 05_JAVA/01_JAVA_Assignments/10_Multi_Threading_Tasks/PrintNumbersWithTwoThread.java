//Exercise: Print Numbers with Two Threads

//Write a Java program that uses two threads to print numbers from 1 to 10. One thread should print odd numbers,
//and the other thread should print even numbers. Ensure that the output is in the correct order.

class NumberPrinter extends Thread {

	int start;
	int end;
	boolean isEven;

	public NumberPrinter(int start, int end, boolean isEven) {

		this.start = start;
		this.end = end;
		this.isEven = isEven;
	}

	public void run() {
		for (int i = start; i <= end; i++) {
			if ((i % 2 == 0) == isEven) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
		}
	}

}

public class PrintNumbersWithTwoThread {

	public static void main(String[] args) {

		NumberPrinter oddPrinter = new NumberPrinter(1, 10, false);
		NumberPrinter evenPrinter = new NumberPrinter(1, 10, true);

		oddPrinter.start();
		evenPrinter.start();

	}

}
