

public class Pattern_19 {

	public static void main(String[] args) {


			int alpha = 69;
			int rows = 5;
			
			for(int i = rows; i >= 1; i--) {
				
				 for(int j = 1; j <= i; j++) {
					System.out.print((char)(alpha - j + 1) +" ");
				}
				
				System.out.println();
			}

		

	}

}
