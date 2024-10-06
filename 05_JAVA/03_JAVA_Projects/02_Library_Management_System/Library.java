package Library_Management_System;

import java.util.Scanner;

public class Library {
	
	int maxBook = 100;
	
	String[] titles = new String[maxBook];
	String[] authors = new String[maxBook];
	
	int bookCount = 0;
	
	public void addBook( String title, String author) {
		
		if(bookCount < maxBook) {
			titles[bookCount] = title;
			authors[bookCount] = author;
			bookCount++;
			System.out.println("Book Successfully Added in Library \n");
		} else {
			System.out.println("Library is Full.");
		}
		
	}
	
	public void searchBook(String title) {
		
		boolean found = false;
		
		for(int i = 0; i < bookCount; i++) {
			
			if( titles[i].equalsIgnoreCase(title)) {
				System.out.println("Book Found : ");
				System.out.println("Title : "+titles[i]);
				System.out.println("Author : "+authors[i]);
				System.out.println();
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Book Not Found in Library.");
		}
		
	}
	
	public void displayBook() {
		
		if(bookCount == 0) {
			System.out.println("No Books Are Available in Library");
		} else {
			
			for(int i = 0; i < bookCount; i++) {
				System.out.println((i+1)+". Title : "+titles[i]+" |  Author : "+authors[i]);
				System.out.println();
			}
		}
		
	}
	
	public void removeBook(String title) {
		
		 boolean found = false;
	        for (int i = 0; i < bookCount; i++) {
	            if (titles[i].equalsIgnoreCase(title)) {
	              
	                for (int j = i; j < bookCount - 1; j++) {
	                    titles[j] = titles[j + 1];
	                    authors[j] = authors[j + 1];
	                }
	                bookCount--;
	                found = true;
	                System.out.println("Book removed successfully.");
	                System.out.println();
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Book not found.");
	        }
	}

	public static void main(String[] args) {

		Library library = new Library();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			
			System.out.println("===== LIBRARY MANAGEMENT SYSTEM ... =====");
			System.out.println();
			
			System.out.println("1. Add a New Book");
			System.out.println("2. Search for a Book by Title");
			System.out.println("3. Display All Books");
			System.out.println("4. Remove a Book by Title");
			System.out.println("5. Exit");
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			
			
			switch (choice) {
			case 1: {
				
				System.out.print("Enter Book Title : ");
				String title = sc.nextLine();
				System.out.print("Enter Author Name : ");
				String author = sc.nextLine();
				library.addBook(title, author);
				break;
			}
			
			case 2: {
				
				System.out.print("Enter the Title of Book to Search : ");
				String bookTitle = sc.nextLine();
				library.searchBook(bookTitle);
				break;
			}
			
			case 3: {
				
				library.displayBook();
				break;
			}
			
			case 4: {
				
				System.out.println("Enter the Title of Book to Remove : ");
				String removeBook = sc.nextLine();
				library.removeBook(removeBook);
				break;
			}
			
			case 5: {
				System.out.println("Exit...");
				break;
			}
			
			
			
			default:
				System.out.println("Invalid Choice. Please Try Again !");
			}
		} while(choice != 5);
		
		sc.close();

	}

}


// Output :


// ===== LIBRARY MANAGEMENT SYSTEM ... =====

// 1. Add a New Book
// 2. Search for a Book by Title
// 3. Display All Books
// 4. Remove a Book by Title
// 5. Exit
// Enter Your Choice : 1
// Enter Book Title : Don't Waste Time
// Enter Author Name : Karan Moyaje
// Book Successfully Added in Library 

// ===== LIBRARY MANAGEMENT SYSTEM ... =====

// 1. Add a New Book
// 2. Search for a Book by Title
// 3. Display All Books
// 4. Remove a Book by Title
// 5. Exit
// Enter Your Choice : 2
// Enter the Title of Book to Search : Don't Waste Time
// Book Found : 
// Title : Don't Waste Time
// Author : Karan Moyaje

// ===== LIBRARY MANAGEMENT SYSTEM ... =====

// 1. Add a New Book
// 2. Search for a Book by Title
// 3. Display All Books
// 4. Remove a Book by Title
// 5. Exit
// Enter Your Choice : 3
// 1. Title : Don't Waste Time |  Author : Karan Moyaje

// ===== LIBRARY MANAGEMENT SYSTEM ... =====

// 1. Add a New Book
// 2. Search for a Book by Title
// 3. Display All Books
// 4. Remove a Book by Title
// 5. Exit
// Enter Your Choice : 4
// Enter the Title of Book to Remove : 
// Don't Waste Time
// Book removed successfully.

// ===== LIBRARY MANAGEMENT SYSTEM ... =====

// 1. Add a New Book
// 2. Search for a Book by Title
// 3. Display All Books
// 4. Remove a Book by Title
// 5. Exit
// Enter Your Choice : 5
// Exit...




