//Write a program to check if the letter is present in the word


public class Task_4 {

	public static void main(String[] args) {

		String word = "Helloworld";
		System.out.println("Given String Is : "+word);
		boolean isPresent = false;
		
        
        for(int i = 0; i < word.length(); i++ ) {
        	
        	if(word.charAt(i) == 'H') {
        		isPresent = true;
        		break;
        	}
        }
        System.out.println(isPresent);
	}

}


// Output : 



// Given String Is : Helloworld
// true



