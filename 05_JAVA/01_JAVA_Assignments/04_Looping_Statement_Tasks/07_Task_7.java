

//Write a program to convert Hexadecimal to Decimal number system
import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {


		 
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.nextLine();

        
        int decimal = 0;

        
        for (int i = 0; i < hex.length(); i++) {
           
        char hexChar = hex.charAt(hex.length() - 1 - i);

            
        int digit = Character.digit(hexChar, 16);
        decimal += digit * Math.pow(16, i);
        }

         System.out.println("Decimal equivalent: " + decimal);
        
    }

}


// Output :

// Enter a hexadecimal number: a
// Decimal equivalent: 10


