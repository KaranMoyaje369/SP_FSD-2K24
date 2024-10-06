package Book_Heirarchy;

class Book {
	
	String title;
	String author;
	int year;
	
	public Book(String title, String author, int year) {
		
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public void displayInfo() {
		System.out.println("Book Title : "+title);
		System.out.println("Book Author : "+author);
		System.out.println("Book Publication Year : "+year);
	}
	
	
	
}

class FinctionBook extends Book {
	
	String genre;
	
	public FinctionBook(String title, String author, int year, String genre) {
		
		super(title, author, year);
		this.genre = genre;
		
	}
	
	public void read() {
		System.out.println("Enjoy Reading this Finction Book genre : "+genre);
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Genre : "+genre);
	}
	
}

class NonFinctionBook extends Book {
	
	String topic;
	
	public NonFinctionBook(String title, String author, int year, String topic) {
		
		super(title, author, year);
		this.topic = topic;
	}
	
	public void study() {
		System.out.println("Use this non-fiction book to study the topic: "+topic);
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Topic : "+topic);
	}
}


public class Book_Heirarchy {

	public static void main(String[] args) {

		System.out.println("================= Book Heirarchy ==================");
		System.out.println();

		FinctionBook f = new FinctionBook("The Hobbit", "Mr. John", 1998, "Fantasy");
		f.displayInfo();
		f.read();
		
		System.out.println();
		System.out.println();
		
		NonFinctionBook nf = new NonFinctionBook("History Of Human", "R.K. Sharma", 1990, "History");
		nf.displayInfo();
		nf.study();
		
		

	}

}
