
public class Pattern_21 {

	public static void main(String[] args) {


		int alpha = 65;
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print((char) alpha + " ");
				alpha++;
			}
			System.out.println();
		}

	}

}
