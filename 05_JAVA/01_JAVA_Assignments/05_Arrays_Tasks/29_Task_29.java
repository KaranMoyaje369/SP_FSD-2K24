
//write a java program multiply two matrices

import java.util.Scanner;

public class Task_29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
   
		System.out.print("Enter the Number Of Rows1 of First Matrix : ");
		int row1 = sc.nextInt();
		
		System.out.print("Enter the Number Of Columns1 ofFirst Matrix : ");
		int col1 = sc.nextInt();
		
		System.out.print("Enter the Number Of Rows1 of Second Matrix : ");
		int row2 = sc.nextInt();
		
		System.out.print("Enter the Number Of Columns1 of Second Matrix : ");
		int col2 = sc.nextInt();
		
		if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible. Number of columns of 1 must equal number of rows of 2.");
            return;
        }
		
		int[][] mat1 = new int[row1][col1];
		int[][] mat2 = new int[row2][col2];
		int[][] result = new int[row1][col2];
		
		System.out.println("Enter the Elements of First Matrix  : ");
		for(int i=0; i < row1; i++) {
			for(int j=0; j < col1; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the Elements of Second Matrix  : ");
		for(int i=0; i < row2; i++) {
			for(int j=0; j < col2; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("First Matrix Is : ");
		for(int i=0; i < row1; i++) {
			for(int j=0; j < col1; j++) {
				System.out.print(mat1[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println("Second Matrix Is : ");
		for(int i=0; i < row2; i++) {
			for(int j=0; j < col2; j++) {
				System.out.print(mat2[i][j] +" ");
			}
			System.out.println();
		}
		
//		Matrix Multiplication
		
		for (int i = 0; i < row1; i++) {
		    for (int j = 0; j < col2; j++) {
		        result[i][j] = 0;
		        for (int k = 0; k < col1; k++) {
		            result[i][j] += mat1[i][k] * mat2[k][j];
		        }
		    }
		}
		
		System.out.println("Result of matrix multiplication:");
		for (int i = 0; i < row1; i++) {
		    for (int j = 0; j < col2; j++) {
		        System.out.print(result[i][j] + " ");
		    }
		    System.out.println();
		}
		
	}

}


// Output :


// Enter the Number Of Rows1 of First Matrix : 3
// Enter the Number Of Columns1 ofFirst Matrix : 3
// Enter the Number Of Rows1 of Second Matrix : 3
// Enter the Number Of Columns1 of Second Matrix : 3
// Enter the Elements of First Matrix  : 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// Enter the Elements of Second Matrix  : 
// 9 
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
// First Matrix Is : 
// 1 2 3 
// 4 5 6 
// 7 8 9 
// Second Matrix Is : 
// 9 8 7 
// 6 5 4 
// 3 2 1 
// Result of matrix multiplication:
// 30 24 18 
// 84 69 54 
// 138 114 90 



