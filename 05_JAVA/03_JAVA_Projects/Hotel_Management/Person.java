package Hotel_Management;

public abstract class Person {
	
	protected String id;
	protected String name;
	protected String contactNo;
	
	
	// constructor of Person class..
	public Person(String id, String name, String contactNo) {
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
	}
	
	abstract void show();
}
