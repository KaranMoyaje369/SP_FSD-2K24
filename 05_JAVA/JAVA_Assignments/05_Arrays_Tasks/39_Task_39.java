//write a java program the sum of each row and each column of a matrix

import java.util.Scanner;

public class Task_39 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows of Matrix : ");
		int rows = sc.nextInt();
		
		System.out.print("Enter Column of Matrix : ");
		int cols = sc.nextInt();
		
		int[][] mat = new int[rows][cols];
		
		System.out.println("Enter the Elements of the Matrix : ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix Is : ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();    // Add new line for spacing...
		
		int[] rowSum = new int[rows];
		int[] colSum = new int[cols];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				rowSum[i] += mat[i][j];
				colSum[j] += mat[i][j];
			}
		}
		
		System.out.print("Sum Of Each Row : ");
		for(int element : rowSum) {
			System.out.print(element+" ");
		}
		
		System.out.println();   // Add new line for spacing...
		
		System.out.print("Sum Of Each Column : ");
		for(int element : colSum) {
			System.out.print(element+" ");
		}
	}

}


// Output :


// Enter Rows of Matrix : 3
// Enter Column of Matrix : 3
// Enter the Elements of the Matrix : 
// 1
// 2
// 3 
// 4
// 5
// 6
// 7
// 8
// 9
// Matrix Is : 
// 1 2 3 
// 4 5 6 
// 7 8 9 

// Sum Of Each Row : 6 15 24 
// Sum Of Each Column : 12 15 18 



