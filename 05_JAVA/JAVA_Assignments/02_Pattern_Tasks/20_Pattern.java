
public class Pattern_20 {

	
	public static void main(String[] args) {


		int alpha = 69;
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			
			 for(int j = 1; j <= i; j++) {
				System.out.print((char)(alpha - j + 1) +" ");
			}
			
			System.out.println();
		}

	}
}
