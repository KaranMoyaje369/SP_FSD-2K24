package Hotel_Management;

public class Customer extends Person {
	
	private Room room; // has-a-relation
	private String roomId;
	
	// param constructor
	public Customer(String id, String name, String contactNo, Room room) {
		super(id, name, contactNo);
		this.room = room;
	}
	
	
	public void rentRoom() {
		this.roomId = room.getRoomId();
	}
	
	
	@Override
	void show() {
		
		System.out.println("Customer Info         ");
		System.out.println("Customer Id          : "+ super.id);
		System.out.println("Customer Name        : "+ super.name);
		System.out.println("Customer Contact No. : "+ super.contactNo);
		System.out.println("Customer Room ID     : "+ room.roomId);
	}

}
