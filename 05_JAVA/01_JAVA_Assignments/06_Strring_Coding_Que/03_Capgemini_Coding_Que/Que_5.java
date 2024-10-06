package Capgemini_Coding_Que;

import java.util.Scanner;

public class Que_5 {
   
    public static boolean validateEmailDomain(String email) {
        
        String[] validDomains = { "com", "in", "net", "org" };
        
        int dotIndex = email.lastIndexOf('.');
        
        if (dotIndex != -1 && dotIndex < email.length() - 1) {
        	
            String domain = email.substring(dotIndex + 1);
            
            for (String validDomain : validDomains) {
                if (domain.equalsIgnoreCase(validDomain)) {
                    return true; 
                }
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Email");
        String email = scanner.nextLine();
        
        System.out.println(email);
        if (validateEmailDomain(email)) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
        
        scanner.close();
    }
}



// Output : 

// Enter Email
// krn@gmail.com
// krn@gmail.com
// Valid email address


